public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double credit = 1_000_000; //первоначальная сумма кредита, рублей;
        int month = 12; //количество месяцев кредитования;
        double percent = 9.99; //ежемесячная ставка в процентах;
        double payment = service.calculate(credit, month, percent);
        System.out.println(payment);

    }
}
