/**
 * Created by danawacomputer on 2017-04-04.
 */
public class StringExample {
    public static void main(String[] args){

        String myStr = "Hello, World!";
        String myStr2 = "안녕하세요";

        String result = myStr + myStr2;

        String result2 = myStr + 3;

        System.out.println(result);

        System.out.println(result2);

        String sliced = myStr.substring(0,5);
        System.out.println(sliced);

        boolean b = myStr.contains("Wor");
        System.out.println(b);

        boolean a = myStr.startsWith("H");
        System.out.println(a);

        String instructorName = "soong.on";
        String sliced1to7 = instructorName.substring(1,7);
        String sliced0to1 = instructorName.substring(0,1);
        System.out.print(sliced1to7+sliced0to1+"ay");

        String indexStr = instructorName.substring(0, instructorName.indexOf("."));
        System.out.println(indexStr);
    }
}
