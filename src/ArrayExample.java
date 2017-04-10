/**
 * Created by danawacomputer on 2017-04-05.
 */
public class ArrayExample {
    public static void main(String[] args) {
        /*int[] iArr = new int[10];
        iArr[0] = 2;
        iArr[1] = 4;
        iArr[2] = 6;
        iArr[3] = 8;
        iArr[4] = 10;
        iArr[5] = 12;
        iArr[6] = 14;
        iArr[7] = 16;
        iArr[8] = 18;
        iArr[9] = 20;

        iArr[3] = 35000;

        System.out.println(iArr[0]);
        System.out.println(iArr[1]);
        System.out.println(iArr[2]);
        System.out.println(iArr[3]);
        System.out.println(iArr[4]);
        */

        int[] iArr = {1,2,3,4,5,6,7,8,9,10
                ,11,12,13,14,15,16,17,18,19,20
                ,21,22,23,24,25,26,27,28,29,30};
/*
        for (int e:iArr) {
            if(e%5 == 0){
                System.out.println("Bingo");
            }
            else{System.out.println(e);
            }
        }*/
/*
        for (int e : iArr) {
            String converted = String.valueOf(e); //숫자를 문자로 변환
            if (converted.contains("3") || converted.contains("6") || converted.contains("9")) //3이나 6, 9를 포함하고 있는지 판단
                System.out.println(converted);

        */
        double result = calcAverage(iArr);
        System.out.println(result);
        }

        public static double calcAverage(int[] intArr){
            int sum=0;
            for (int e : intArr) sum=sum+e;
            return (double)sum / intArr.length;
        }
        }
