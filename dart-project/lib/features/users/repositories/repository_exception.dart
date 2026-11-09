class DuplicateUserIdException implements Exception {
  final String userId;

  DuplicateUserIdException(this.userId);

  @override
  String toString() => 'User ID already exists: $userId';
}

class UserNotFoundException implements Exception {
  final String userId;

  UserNotFoundException(this.userId);

  @override
  String toString() => 'User not found: $userId';
}

class InvalidEmailFormatException implements Exception {
  final String email;

  InvalidEmailFormatException(this.email);

  @override
  String toString() => 'Invalid email format: $email';
}

class UppercaseInEmailException implements Exception {
  final String email;

  UppercaseInEmailException(this.email);

  @override
  String toString() => 'Email contains uppercase letters: $email';
}

class WhitespaceInEmailException implements Exception {
  final String email;

  WhitespaceInEmailException(this.email);

  @override
  String toString() => 'Email contains whitespace: $email';
}

class InvalidFullNameException implements Exception {
  final String fullName;

  InvalidFullNameException(this.fullName);

  @override
  String toString() => 'Invalid full name: $fullName';
}

class EmptyFullNameException implements Exception {
  final String fullName;

  EmptyFullNameException(this.fullName);

  @override
  String toString() => 'Full name cannot be empty: $fullName';
}

class EmailAlreadyExistsException implements Exception {
  final String email;

  EmailAlreadyExistsException(this.email);

  @override
  String toString() => 'Email already exists: $email';
}