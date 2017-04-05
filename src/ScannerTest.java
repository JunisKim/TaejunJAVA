import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-04.
 */
public class ScannerTest {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("단어를 입력하시고 엔터를 치세요.");
        String inputted = in.nextLine();
        System.out.println("키보드로 입력한 글자는: " + inputted);
    }
}
