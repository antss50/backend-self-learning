import 'package:dart_project/features/users/domain/user.dart';
import 'package:dart_project/features/users/repositories/interfaces.dart';
import 'package:dart_project/features/users/repositories/repository_exception.dart';
import 'package:uuid/uuid.dart';

class UserService {
  final UserRepository _userRepository;
  final Uuid _uuid = Uuid();
  UserService(this._userRepository);

  Future<User> registerUser({required String email, required String fullName,}) async {
    if (email.contains(RegExp(r'[A-Z]'))) {
      throw UppercaseInEmailException(email);
    }
    
    if (!RegExp(r'^[\w-\.]+@([\w-]+\.)+[\w-]{2,4}$').hasMatch(email)) {
      throw InvalidEmailFormatException(email);
    }

    if (fullName.trim().isEmpty) {
      throw EmptyFullNameException(fullName);
    }

    if (email.contains(RegExp(r'\s'))) {
      throw WhitespaceInEmailException(email);
    }

    final existingUser = await _userRepository.findByEmail(email.trim().toLowerCase());
    if (existingUser != null) {
      throw EmailAlreadyExistsException(email);
    }

    final normalizedEmail = email.trim().toLowerCase();
    
    final user = User(id: _uuid.v4(), email: normalizedEmail, fullName: fullName.trim());
    await _userRepository.create(user);
    return user;
  }

  Future<User?> getUserById(String id) {
    return _userRepository.findById(id);
  }

  Future<User?> getUserByEmail(String email) {
    return _userRepository.findByEmail(email.trim().toLowerCase());
  }

  Future<List<User>> getAllUsers() {
    return _userRepository.findAll();
  }

  Future<User> updateUser(User user) {
    return _userRepository.update(user);
  }
}