package Gourmet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-07.
 */
public class GourmetReview {

    public static void main(String[] args){

        //맛집 객체를 5개 만든다.
        Gourmet spoon = new Gourmet("숫가락반상마실","한정식, 떡갈비, 갈비찜",111);
        //spoon.title = "숟가락반상 마실";
      //  spoon.setTitle("숫가락반상마실");
       // spoon.setTitle("한정식, 떡갈비, 갈비찜");
       // spoon.setScore(111);

        Gourmet sushi = new Gourmet("스시메이진","스시, 스시뷔페",70);
        //sushi.title = "스시메이진";
       // sushi.setTitle("스시메이진");
        //sushi.setMainMenu("스시, 스시뷔페");
       // sushi.setScore(70);

        Gourmet chan = new Gourmet("맛찬들","삼겹살, 한우, 목살",49);
      //  chan.title = "맛찬들";
       // chan.setTitle("맛찬들");
      //  chan.mainMenu = "삼겹살, 한우, 목살";
      //  chan.setTitle("삼겹살, 한우, 목살");
       // chan.setScore(49);

        Gourmet choi = new Gourmet("최우형 스시","초밥, 회전초밥",49);
       // choi.title = "최우형 스시";
      //  choi.setTitle("최우형 스시");
      //  choi.mainMenu = "초밥, 회전초밥";
       // choi.setTitle("초밥, 회전초밥");
       // choi.setScore(49);

        Gourmet ranch = new Gourmet("철판 목장","스테이크 철판",46);
       // ranch.title = "철판 목장";
       // ranch.setTitle();
        //ranch.mainMenu = "스테이크 철판";
       // ranch.setTitle();
       // ranch.setScore();
//
        Gourmet yongho = new Gourmet("용호낙지", "낙새, 낙곱새", 46);

        //맛집객체 리스트를 만든다.
        List<Gourmet> list = new ArrayList<>();
        list.add(ranch);
        list.add(sushi);
        list.add(choi);
        list.add(ranch);
        list.add(chan);

        //맛집 점수의 평균을 구해라.
        /*int totalScore = 0;
        for(Gourmet a : list){
            totalScore = totalScore + a.getScore();
        }
        System.out.println("점수의 총합은: " + totalScore);
        System.out.println("평균은: " + totalScore/list.size());*/

        GourmetService service = new GourmetService();

        double result = service.calcAverageScore(list);

        System.out.println(result);
    }
}
