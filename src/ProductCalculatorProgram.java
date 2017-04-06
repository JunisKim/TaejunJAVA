import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class ProductCalculatorProgram {
    public static void main(String[] args){

        int priceThis = 4500;
        int priceMalboro = 5200;

        Scanner a = new Scanner(System.in);
        System.out.println("1.담배 종류를 입력하세요.");
        int kindOfCigarret;
        int inputFirstNumber = a.nextInt();
        if(inputFirstNumber==1){
            kindOfCigarret= priceThis;}else{kindOfCigarret= priceMalboro;}

        Scanner b = new Scanner(System.in);
        System.out.println("2.나이를 입력하세요.");
        int inputAge = b.nextInt();
        double discountRate;
        if(inputAge<19){
            discountRate=0.2;}
            else if(inputAge>=45){
            discountRate=0.3;}
            else{discountRate=0;}

        Scanner c = new Scanner(System.in);
        System.out.println("3.수량을 입력하세요.");
        int howMany = c.nextInt();

        double totalPrice = kindOfCigarret * howMany * (1-discountRate);
        System.out.printf("지불할 금액은 %d원입니다.",(int)totalPrice);
        }
        }




