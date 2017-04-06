/**
 * Created by danawacomputer on 2017-04-05.
 */
public class StringArrayExample {
    public static void main(String[] args){
        //element 글자수의 평균
        String[] strArr = {
          "숫가락반상 마실", "스시메이진", "맛찬들", "최우영스시", "철판목장", "용호낙지"
        };
        int sum = 0;
        for (String e : strArr) {
            sum = sum + e.length();
        }
        double averageLetter = sum / strArr.length;
        System.out.println("엘레먼트 갯수=" + strArr.length);
        System.out.println("합계=" + sum);
        System.out.println("글자수 평균은" + averageLetter);

        //글자수 3개 이하인 엘러멘트의 배열 생성
        String[] resultArr = new String[10];
        int count = 0;
        for(String e : strArr){
            if (e.length() <= 3) {
                resultArr[count] = e;
                count++;
            }}
            for(String a : resultArr) {
                System.out.println("글자수 3개 이하인 배열의 엘러먼트는: " + a);
            }

        int[] testArr = new int[3];
        System.out.println(testArr[1]);
        }
    }

