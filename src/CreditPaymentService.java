public class CreditPaymentService {

    public double calculate(double credit, int month, double percent) {
        //double credit; первоначальная сумма кредита;
        //int month; количество месяцев кредитования;
        //double percent; ежемесячная ставка по процентам;
        double a = percent / 12 / 100;
        double payment = (credit * (a + (a / (Math.pow((1 + a), month) - 1))));
        return payment;
    }
}
