/**
 * Created by danawacomputer on 2017-04-04.
 */
public class VarTypeExample {
    public static void main(String[] args){

        //정수타입

        //int myInt = 2_000_000_000;
        int myInt; //변수선언, 메모리 공간 확보
        myInt = 5; //재할당, re-assignment


        long myLong = 1_000_000_000_000_000_000L;

        // float type
        double mydouble =3.14;

        // string type
        String myStr = "Hello world";

        //글자 한글자 작성시

        char myChar = 'a';

        //boolean type
        boolean myBool = true;
        System.out.println(myBool);

    }// 변수가 범위를 벗어나면 죽는다. 사용되지 않는 변수는 회색으로.
}
