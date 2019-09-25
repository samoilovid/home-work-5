public class TaxiService {

    int predict(int distance) {
        int landingAmount = 60;
        int costOneKm = 20;
        int order = distance*costOneKm+landingAmount;

        int value = 1000;
            if (order> value){
            int percentageDiscount = 5;
            int maxDiscount = 100;
            int hundred = 100;
            int discount = order /hundred *percentageDiscount;
            if (discount>maxDiscount) {
                discount =maxDiscount;
            }
            order=order-discount;
           }
        return order;
    }
}
