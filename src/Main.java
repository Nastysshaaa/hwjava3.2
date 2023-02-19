public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        //double height = 1.96;
        //double weight = 91;
        float index = service.calculate(91, (float) 1.96);
        System.out.println(index);

        }
}