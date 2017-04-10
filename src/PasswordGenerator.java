import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class PasswordGenerator {
    public static void main(String[] args){

        //input from keyboard
        Scanner in = new Scanner(System.in);
        System.out.println("단어를 하나 입력하세요: ");
        String targetStr = in.nextLine(); //여기서 블락이 걸린다.

        //second. processing
        String prefix = "$$";
        String postfix = "##";
        int squarelengthOfChar = targetStr.length() * targetStr.length();

        targetStr =
                targetStr.substring(0,1).toUpperCase()
                    + targetStr.substring(1);

      //  String passwordGenerated = prefix + squarelengthOfChar + targetStr+ postfix ;

        //the last.. output the passwordGenerated

        PasswordGeneratorService service = new PasswordGeneratorService();

        String result = service.makePassword(targetStr, prefix, postfix);

        System.out.println(result);

    }
}
