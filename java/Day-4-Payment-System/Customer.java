public class Customer extends User {
    private String address;

    public Customer(String id, String name, String email, String address) {
        super(id, name, email);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Address: " + address);
    }
    @Override
    public void action() {
        System.out.println("Đang cần tư vấn...");
    }
}