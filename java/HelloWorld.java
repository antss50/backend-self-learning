import java.util.*;


public class Main {
    public static void main(String[] args) {
        String ten;
        int tuoi;
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ten: ");
        ten = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi = sc.nextInt();
        System.out.println("Thong tin ca nhan:");
        System.out.print(ten + " " + tuoi + " tuoi");
    }
}