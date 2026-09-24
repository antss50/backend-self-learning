import java.util.*;

public class PaymentSystem {
    public static void main(String[] args) {
        User[] customers = {
            new Customer("cs1", "Ta Ngoc An", "tangocanss50@gmail.com", "Gia Lai"),
            new Customer("cs2", "Nguyen Thai Hoc", "hocng@gmail.com", "Phu Yen"),
            new Customer("cs3", "Nguyen Ba Trong Khoi", "khoibatrong@gmail.com", "Quang Nam")
        };

        User[] employees = {
            new Employee("ely1", "NV1", "abc@gmail.com", "Manager"),
            new Employee("ely2", "NV2", "xyz@gmail.com", "Sales"),
            new Employee("ely3", "NV3", "efg@gmail.com", "Supporter")
        };

        Payment[] payments = {
            new CashPayment(),
            new BankPayment(),
            new CardPayment()
        };

        for (User customer : customers) {
            customer.displayInfo();
        }

        System.out.println("Khach hang " + customers[0].getName() + " do nhan vien " + employees[0].getName() + " phu trach");
        try {
            System.out.print("Khach hang " + customers[0].getName() + " ");
            payments[0].pay(-1);
        } catch (Exception e) {
            System.out.println("So tien thanh toan phai lon hon 0");
        } finally {
            System.out.println("Hoan thanh thu tuc cho khach hang " + customers[0].getName() + " ");
        }
            System.out.println("Khach hang " + customers[1].getName() + " do nhan vien " + employees[1].getName() + " phu trach");
        try {
            System.out.print("Khach hang " + customers[1].getName() + " ");
            payments[1].pay(17500000.0);
        } catch (PaymentException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Hoan thanh thu tuc cho khach hang " + customers[1].getName() + " ");
        }
            System.out.println("Khach hang " + customers[2].getName() + " do nhan vien " + employees[2].getName() + " phu trach");
        try {
        System.out.print("Khach hang " + customers[2].getName() + " ");
            payments[2].pay(1000000000.0);
        } catch (PaymentException e) {
            System.out.println("So tien thanh toan phai lon hon 0" + e.getMessage());
        } finally {
            System.out.println("Hoan thanh thu tuc cho khach hang " + customers[2].getName() + " ");
        }
    }
}