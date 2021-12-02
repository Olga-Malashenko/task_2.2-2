public class BmiService {
    public double calculate(double weight, double height) {
        double bmIndex = weight / (height * height);
        return bmIndex;
    }
}
