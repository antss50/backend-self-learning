enum UserRole {
  bidder,
  admin
}

enum UserStatus {
  active,
  banned
}
class User {
  final String id;
  final String email;
  final String fullName;
  UserRole role = UserRole.bidder;
  UserStatus status = UserStatus.active;

  User({
    required this.id, 
    required this.email, 
    required this.fullName, 
    this.role = UserRole.bidder, 
    this.status = UserStatus.active
  });
}