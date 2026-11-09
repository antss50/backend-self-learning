# Dart Backend Self-Learning Journey

Repository ghi lại quá trình tự học backend với Dart và Dart Frog. Nội dung được cập nhật liên tục sau mỗi giai đoạn học.

---

## Learning Log

### Phase 1 — Dart Core: User Module

**Status:** Completed

**What I learned:**
- Xây dựng User model, Repository và Service.
- Implement InMemory Repository.
- Validate email, full name và xử lý business exceptions.
- Viết unit tests cho UserService.

**Challenges & Lessons Learned:**
- Xử lý email trùng lặp.
- Phân biệt validation errors và business exceptions.
- Hiểu cách phân chia trách nhiệm giữa Model, Repository và Service.

---

### Phase 2 — Dart Frog: User CRUD API

**Status:** Completed

**What I learned:**
- Xây dựng REST API bằng Dart Frog.
- Sử dụng `onRequest` để dispatch HTTP methods.
- Implement GET, POST, PUT và DELETE.
- Sử dụng Middleware để inject UserService.
- Validate request body và xử lý HTTP status codes.
- Test API bằng Postman.

**Challenges & Lessons Learned:**
- Ban đầu nhầm `onPost` với `onRequest`.
- Gặp lỗi `405 Method Not Allowed` do chưa dispatch đúng HTTP method.
- Gặp lỗi khi gọi `.trim()` trên giá trị null.
- Chưa xử lý JSON parsing trong `try-catch`.
- Chưa phân biệt field bị thiếu và field có giá trị null khi update.
- Cần phân biệt business exceptions với unexpected exceptions.

---

## Future Learning Log

Các giai đoạn tiếp theo sẽ được thêm vào bên dưới sau khi hoàn thành:

- Integration Testing
- PostgreSQL Integration
- Authentication & Authorization
- Real Estate CRUD
- Auction CRUD
- Bidding System
- Concurrent Bidding

---

*This README is maintained as a chronological learning journal. New phases are appended as I progress through the project.*