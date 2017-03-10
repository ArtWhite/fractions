package pw.artwhite;

/**
 * Created by artwhite on 17.02.17.
 */
public class Rational {
    private int numerator;
    private int denominator;


    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational() {
        this(1, 1);
    }
    public Rational(int numerator){
        this(numerator, 1);
    }



    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }



}
