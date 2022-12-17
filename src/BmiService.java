public class BmiService {
    public int calculate(double h, double m) {
        double result = m / (h * h);
        return (int) result;
    }
}