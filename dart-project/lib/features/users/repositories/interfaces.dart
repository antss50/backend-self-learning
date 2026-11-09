import 'package:dart_project/features/users/domain/user.dart';

abstract interface class UserRepository {
  Future<void> create(User user);

  Future<User?> findById(String id);

  Future<User?> findByEmail(String email);

  Future<List<User>> findAll();

  Future<User> update(User user);
}