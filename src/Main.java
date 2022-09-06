public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 86;
        double growthSentimeter = 190;
        double growthMeters = growthSentimeter * 0.01;
        double index = service.calculate(weight, growthMeters);
        System.out.printf("%.1f",index);
    }
}
