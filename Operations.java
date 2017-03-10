package pw.artwhite;

import static java.lang.System.exit;

/**
 * Created by artwhite on 28.02.17.
 */
public class Operations {

    public static Rational add(Rational first, Rational sec) {
        Rational test = new Rational((first.getNumerator()*sec.getNumerator()), (first.getDenominator()*sec.getDenominator()));
        return test;
    }

    public static Rational division(Rational first, Rational sec) {
        Rational test = new Rational((first.getNumerator()*sec.getDenominator()), (first.getDenominator()*sec.getNumerator()));
        return test;
    }


    public static void parse(Rational first, Rational sec, String input) {
        String array[] = new String[5];
        int slash = 0;
        System.out.print("Возвращаемое значение: ");
        for (String retval : input.split(" ", 2)) {
            if (retval == "/"){
                slash++;
            }

            if (retval == "/" && slash == 2){

            } else {
                array[0] = retval;
            }
            System.out.println(array[0]);

        }
    }
}
