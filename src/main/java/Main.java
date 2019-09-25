public class Main {
    public static void main(String[] args) {
        TaxiService taxiService = new TaxiService();
        int prediction =taxiService.predict(60);
        System.out.println(prediction);

    }

}
