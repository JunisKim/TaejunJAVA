/**
 * Created by danawacomputer on 2017-04-04.
 */
public class AppleShop {
    public static void main(String[] args){

        int iPadOriginalPrice = 999_000;
        double iPadDiscountedrate = 0.15;


        int iPadDiscountedPrice = getDiscountedPrice(iPadOriginalPrice, iPadDiscountedrate);

                System.out.println("iPad Pro 정가: " + iPadDiscountedPrice +"원");
    }

    public static int getDiscountedPrice(int iPadOriginalPrice, double iPadDiscountedrate){
        int DCPrice =
                (int)(iPadOriginalPrice * (1-iPadDiscountedrate));

        return DCPrice;
    }
}
