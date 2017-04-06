import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-06.
 */
public class StringArrayListExample {
    public static void main(String[] args) {
        String[] str = {
                "숫가락반상 마실", "스시메이진", "맛찬들", "최우영스시", "철판목장", "용호낙지"
        };

        //     List<String> goumet = new ArrayList<>();
        //    goumet.add("숫가락반상 마실");
        //    goumet.add("스시메이진");

        List<String> goumet = Arrays.asList("숫가락반상 마실", "스시메이진", "맛찬들", "최우영스시", "철판목장", "용호낙지");

        List<String> goumetUnderThreeChar = new ArrayList<>();
        for (String a : goumet) {
            if (a.length() <= 3) {
                goumetUnderThreeChar.add(a);
            }
        }
            //새로 만들어진 리스트 출력
            for (String e : goumetUnderThreeChar) {
                System.out.println(e);
            }

        }
    }


