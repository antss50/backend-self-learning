public class CardPayment implements Payment {
    @Override
    public void pay(double amount) throws PaymentException {
        if (amount <= 0) {
            throw new PaymentException("So tien phai lon hon 0.");
        }
        String formattedAmount = String.format("%,.0f", amount);
        System.out.println("Thanh toan " + formattedAmount + " VND bang the tin dung.");
    }
}