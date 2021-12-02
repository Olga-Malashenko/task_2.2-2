public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double bmi = service.calculate(62,176);
        System.out.println(bmi);
    }
}
