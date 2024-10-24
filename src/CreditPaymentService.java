public class CreditPaymentService {

    public int calculate(double interestRate, int loanAmount, int month) {
        double result = loanAmount * (interestRate / 12) * Math.pow((1 +  (interestRate / 12)), month) / (Math.pow((1 + (interestRate / 12)), month) -1);
        int resultMonthlyPayment = (int) result;
        return resultMonthlyPayment;
    }
}
