import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class ArrayListExample {
            public static void main(String[] args){

        String review =
                "구로디지털단지역 맛집 저렴한 한정식 숟가락반상 마실 한국의 반상차림을 " +
                        "서양의 정차너럼 시간전개형으로 격식을 차려서 내놓은 음식이라고 한다.";

        //1. review 스트링을 리스트로 변환
        //1-1. 스트링을 분해해서 스트링의 배열로 만든다.
        /*String[] splitted = review.split(" ");
        List<String> wordList = Arrays.asList(splitted); */
        // 강사님 답안

        List<String> myList = new ArrayList<String>(Arrays.asList(review.split(" ")));
        for(String e : myList){
            System.out.print(e + "/");
        }

        //2.리스트를 순회해서 전체 단어의 글자수의 평균을 구한다.
        int sum = 0;
        //int count = 0;
        for(String e : myList){
            e.length();
            sum += e.length();
        //    count += 1;

        }
        System.out.println("element 갯수: " + myList.size());
        System.out.println("element 총합: " + sum);
        System.out.println("element 길이 평균: " + sum/myList.size());

        //3. 단어가 5자 이하인 새로운 리스트를 생성한다.
        //List<String> myListUnderFiveChar = Arrays.asList(

        List<String> myListUnderFiveChar = new ArrayList<>();
        for(String a : myList){
            if(a.length() <= 5 ){
                myListUnderFiveChar.add(a);
                }
            }
        for(String b : myListUnderFiveChar){
            System.out.print(b + "/");
        }
    }

    /*public static double getAverageFromList(List<String> myList){
               //TODO
               return 0;
    }

    public static List<String> getListLessThanFive(List<String> myList){
               ruturn null;
    }
}*/
    //1번 문제 객체
    public static List<String> wordListTrans(String a){
        String[] splitted = a.split(" ");

        List<String> wordList = Arrays.asList(splitted);
        //새로운 List인 wordList에 split한 splitted 값을 대입한다.

        return wordList;
        // return값으로 List값을 보내줌.
    }

    //2번 문제 객체
    public static void wordListCount(List<String> a){
        int wordTotalCount = 0;
        for (String e : a) {
            wordTotalCount += e.length();
        }
        System.out.println("객체로 변환(2)");
        System.out.printf("글자수 평균은 %d개입니다.\n", wordTotalCount / a.size());
        return ;
        // 객체 내에서 출력하므로 return 값에 특정 값이 안 들어가도 됨.
    }
}