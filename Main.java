package pw.artwhite;

/**
 * Created by artwhite on 17.02.17.
 *
 * @author Artem Umnov
 */

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Rational first = new Rational();
        Rational sec = new Rational(32, 8);
        //Rational add = new Rational();
        //Rational division = new Rational();
        String input;

        System.out.print("Введите дробное уравнение - ");
        input = sc.nextLine();

        if (input.matches("\\b[0-9]* [/] [0-9]* [-+*/] [0-9]* [/] [0-9]*\\b")){
            Operations.parse(first, sec, input);
        } else {
            System.out.print("nooo");
        }


        //add = Operations.add(first, sec);

        //division = Operations.division(first, sec);

        //System.out.println(add);
        //System.out.print(division);
    }
}
