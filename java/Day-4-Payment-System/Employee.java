public class Employee extends User {
    private String role;

    public Employee(String id, String name, String email, String role) {
        super(id, name, email);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public void action() {
        System.out.println("Đang hỗ trợ khách hàng...");
    }
}