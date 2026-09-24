public class CashPayment implements Payment {

    @Override
    public void pay(double amount) throws PaymentException {
        if (amount <= 0) {
//            System.out.println("thanh toan: " + amount + " VND");
            throw new PaymentException("So tien bat buoc phai lon hon 0.");
        }
        String formattedAmount = String.format("%,.0f", amount);
        System.out.println("Thanh toan " + formattedAmount + " VND bang tien mat.");
    }
}