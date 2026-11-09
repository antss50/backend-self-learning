import 'package:dart_project/features/users/domain/user.dart';
import 'package:dart_project/features/users/repositories/interfaces.dart';
import 'package:dart_project/features/users/repositories/repository_exception.dart';

class InMemoryUserRepository implements UserRepository {
  final Map<String, User> _users = {};

  @override
  Future<void> create(User user) async {
    if (_users.containsKey(user.id)) {
      throw DuplicateUserIdException(user.id);
    }
    _users[user.id] = user;
  }

  // Không cần throw exception nếu không tìm thấy user, chỉ trả về null
  @override
  Future<User?> findById(String id) async {
    return _users[id];
  }

  @override
  Future<User?> findByEmail(String email) async {
    final users = _users.values.where((user) => user.email == email);

    if (users.isEmpty) {
      return null;
    }

    return users.first;
  }

  @override
  Future<List<User>> findAll() async {
    return _users.values.toList();
  }

  // Cập nhật thông tin user, nếu không tìm thấy user thì phải throw exception
  @override
  Future<User> update(User user) async {
    if (!_users.containsKey(user.id)) {
      throw UserNotFoundException(user.id);
    }
    _users[user.id] = user;
    return user;
  }
}