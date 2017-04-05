import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-04.
 */
public class ProductingPassword {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        System.out.println("단어를 입력하세요.");
        String answer = a.nextLine();
        String firstAnswer = answer.substring(0,1);
        String remainedAnswer = answer.substring(1);
        int countchar = answer.length();
        System.out.println("$$" + firstAnswer.toUpperCase() + remainedAnswer + countchar*countchar + "##" );
    }
}
