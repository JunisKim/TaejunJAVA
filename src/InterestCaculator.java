import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class InterestCaculator {
    public static void main(String[] args){

        //input
        /*
        원금을 입력하세요: 3000000
        기간을 입력하세요: 48
        이율을 입력하세요: 35.5
         */

        Scanner a = new Scanner(System.in);
        System.out.print("원금을 입력하세요: ");
        double originalMoney = a.nextDouble();

        Scanner b = new Scanner(System.in);
        System.out.print("기간을 입력하세요: ");
        double howLongSave = b.nextDouble();

        Scanner c = new Scanner(System.in);
        System.out.print("이율을 입력하세요: ");
        double interestRate = c.nextDouble();

        //Process
        //이자계산공식 : 이자 = 원금 * 이율(연이율) * (월/12)
        //기간: 연
        if(howLongSave>=36){
            interestRate=0.7;
        } else{interestRate=1;}

        double interest =
                originalMoney * interestRate/100 * (howLongSave/12);



        //기간이 36개월 이상이면 이율을 30% 감면한다.
        //Output
        /*
        48개월 후 당신은 5000000원을 받을수 있습니다.
         */

        System.out.printf("%d개월 후 당신은 %d원을 받을수 있습니다.",howLongSave,(double)interest);
    }

    public static double calcInterest(
            double originalMoney, double howLongSave, double interestRate) {

        double interest =
                originalMoney * (interestRate/100) * (howLongSave/12);

        return interest; //함수를 만들었다.

        //함수를 실행하려면 함수를 호출해야한다.



    }
}
