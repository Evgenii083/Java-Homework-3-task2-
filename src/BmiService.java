public class BmiService {
    public double calculate(double weight, double growthMeters) {
        double index = weight / (growthMeters * growthMeters) ;
        return index;
    }
}
