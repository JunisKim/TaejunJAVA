/**
 * Created by danawacomputer on 2017-04-04.
 */
public class MyAccountBook {
    public static void main(String[] args) {

    int busFee   = 1400;
    int coffee   = 3500;
    int forLunch = 7000;
    int candy    = 1000;

    int totalSpent = getTotalSpent(busFee, coffee, forLunch, candy); //함수를 호출한다.

    System.out.println("오늘 쓴 경비는 " + totalSpent + "원 입니다.");
    }


    //호출받은 함수를 실행한다.
    public static int getTotalSpent(int busFee, int coffee, int forLunch, int candy){
        int getTotalSpent =
        busFee + coffee + forLunch + candy;
        return getTotalSpent;

    }

}
