/**
 * Created by danawacomputer on 2017-04-04.
 */
public class Celsius2Fahrenheit {
    public static void main(String[] args){
        double Celsius;

        Celsius =18.0;

        double Fahrenheit = getFahrenheit(Celsius); //Fahrenheit = (Celsius * 1.8) +32;

        System.out.print("섭씨 온도" + Celsius + "는 " + Fahrenheit + " 입니다.");

    }

    public static double getFahrenheit(double a){
        double Fahrenheit =
                (a * 1.8) +32;

        return Fahrenheit;
    }
}
