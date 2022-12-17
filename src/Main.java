public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height = 1.75;
        int weight = 75;
        int index = service.calculate(height, weight);

        System.out.println("Ваш индекс массы тела равен: " + index);
    }
}