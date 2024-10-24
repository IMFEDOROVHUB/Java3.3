public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double interestRate = 0.0999;
        int loanAmount = 1_000_000;

        int oneYearPayment = service.calculate(interestRate, loanAmount, 12);
        System.out.println("Ежемесячный платеж за год " + oneYearPayment);

        int twoYearPayment = service.calculate(interestRate, loanAmount, 24);
        System.out.println("Ежемесячный платеж за 2 года " + twoYearPayment);

        int thereeYearPayment = service.calculate(interestRate, loanAmount, 36);
        System.out.println("Ежемесячный платеж за 3 года " + thereeYearPayment);
    }
}