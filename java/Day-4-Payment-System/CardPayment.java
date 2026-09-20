public class CardPayment implements Payment {
    @Override
    public void pay(double amount) {
        String formattedAmount = String.format("%,.0f", amount);
        System.out.println("Thanh toan " + formattedAmount + " VND bang the tin dung.");
    };
}