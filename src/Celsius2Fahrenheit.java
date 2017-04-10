/**
 * Created by danawacomputer on 2017-04-04.
 */
public class Celsius2Fahrenheit { //메인클래스
    public static void main(String[] args){ //메인함수
        double celsius;

        celsius =18.0;

        Celsius2FahrenheitService service =
                new Celsius2FahrenheitService();

        double result = service.getFahrenheit(celsius);

        //double Fahrenheit = getFahrenheit(celsius); //Fahrenheit = (celsius * 1.8) +32;

        String str = new String("hello");

        System.out.print("섭씨 온도" + celsius + "는 " + result + " 입니다.");
    }

}

