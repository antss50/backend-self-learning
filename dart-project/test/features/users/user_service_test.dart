import 'package:test/test.dart';
import 'package:dart_project/features/users/services/user_services.dart';
import 'package:dart_project/features/users/repositories/implements.dart';
import 'package:dart_project/features/users/domain/user.dart';
import 'package:dart_project/features/users/repositories/repository_exception.dart';

void main() {
  group('UserService', () {
    late InMemoryUserRepository userRepository;
    late UserService userService;

    setUp(() {
      userRepository = InMemoryUserRepository();
      userService = UserService(userRepository);
    });
    test('should register a user successfully', () async {
      // Arrange
      const email = 'test@example.com';
      const fullName = 'Test User';

      // Act
      final user = await userService.registerUser(email: email, fullName: fullName);

      // Assert
      expect(user.email, email);
      expect(user.fullName, fullName);
      expect(user.id, isNotEmpty);
      expect(user.role, UserRole.bidder);
      expect(user.status, UserStatus.active);

      final registeredUser = await userService.getUserByEmail(email);
      expect(registeredUser, isNotNull);
      expect(registeredUser!.email, email);

    });

    test('should throw exception when email is invalid', () async {
      // Arrange
      const email = 'invalid-email';
      const fullName = 'Test User 1';

      // Act
      final future = userService.registerUser(
        email: email,
        fullName: fullName,
      );

      // Assert
      await expectLater(
        future,
        throwsA(isA<InvalidEmailFormatException>()),
      );
    });

    test('should throw exception when duplicate email is used', () async {
      // Arrange
      const email = 'test@example.com';
      const fullName = 'Test User Duplicate';

      // Act
      await userService.registerUser(email: email, fullName: fullName);

      // Assert
      final future = userService.registerUser(email: email, fullName: 'Another User');
      await expectLater(
        future,
        throwsA(isA<EmailAlreadyExistsException>()),
      );
    });

    test('should throw exception when email has uppercase letters', () async {
      // Arrange
      const email = 'TEST@EXAMPLE.COM';
      const fullName = 'Test User 2';

      // Act
      final future = userService.registerUser(
        email: email,
        fullName: fullName,
      );

      // Assert
      await expectLater(
        future,
        throwsA(isA<UppercaseInEmailException>()),
      );
    });

    test('should throw exception when email has whitespace', () async {
      // Arrange
      const email = 'te st @example.com';
      const fullName = 'Test User 3';

      // Act
      final future = userService.registerUser(
        email: email,
        fullName: fullName,
      );

      // Assert
      await expectLater(
        future,
        throwsA(isA<InvalidEmailFormatException>()),
      );
    });

    test('should throw exception when full name is empty', () async {
      // Arrange
      const email = 'test1@example.com';
      const fullName = '';

      // Act
      final future = userService.registerUser(
        email: email,
        fullName: fullName,
      );

      // Assert
      await expectLater(
        future,
        throwsA(isA<EmptyFullNameException>()),
      );
    });
  });
}