/**
 * Created by danawacomputer on 2017-04-06.
 */
public class StringArrayExample2 {/**
 * Created by danawacomputer on 2017-04-05.
 * 1. 각 element의 글자수 평균 구하기
 * 2. 글자수가 3자 이하인 element의 배열 새로 만들기
 *
 */
public static void main(String[] args) {

        /*String[] strArr =
                {"숟가락반상 마실", "스시메이진", "맛찬들", "최우영스시", "철판목장", "용호낙지"
                        , "은행골", "메이비", "돌배기집", "구로곱창", "두끼 구로디지털단지점", "아비꼬"
                        , "마루가메제면", "킹콩부대찌개 구로디지털점", "바른식탁", "말뚝곱창", "보나베띠"
                        , "춘자싸롱", "황제해물보쌈", "호우 양꼬치"};



//        int totalCharCount = 0;
//        for (String e : strArr) {
//            totalCharCount = totalCharCount + e.length();
//        }
//        int arrSize = strArr.length;
//        System.out.println(totalCharCount/arrSize);


        int totalCharCount = 0;
        for (String e : strArr) {
            totalCharCount = totalCharCount + e.length();
        }

        int arrSize = strArr.length;
        System.out.println(totalCharCount / arrSize);



        int strArrCnt = 0;
        int newArrCnt = 0;


        for (String e : strArr) {
            if(e.length() <= 3) {

//                System.out.println(e);

//                System.out.println("NewArrIndex: " + newArrCnt);
                newArrCnt++;
            }
//            System.out.println("배열 검색 순번: " + strArrCnt);
            strArrCnt++;
        }
        String[] newArr = new String [newArrCnt];

        int savedCnt = 0;
        int searchCnt = 0;
        for (String e : strArr) {
            if(e.length() <= 3) {

                System.out.println(e);
                newArr[savedCnt] = strArr[searchCnt];
//                System.out.println("NewArrIndex: " + newArrCnt);
                savedCnt++;
            }
//            System.out.println("배열 검색 순번: " + strArrCnt);
            searchCnt++;
        }*/

    int[] nArr =
            {1,2,3,4,5,6,7,8,9,10};
    //accumulate
    int sum = 0;

    for (int e : nArr) {
        sum = sum +e; //sum += e (누적해서 더해서 넣어라)
    }
    int countOfArray = nArr.length;
    System.out.println("누적합계:=" + sum);
    System.out.println("평균=" + sum / countOfArray);
}
}

