public class RationalNumber implements Rational {
    private int numerator;
    private int denominator;

    RationalNumber(int n, int d) {
        numerator = n;
        denominator = d;
    }

    public float getQuotient() {
        return numerator/denominator;
    }

    private int getNumerator()
    {
        return numerator;
    }

    private int getDenominator()
    {
        return denominator;
    }

    public RationalNumber add(RationalNumber other) {
        int newDenominator;
        int newNumerator;
        if(denominator!=other.getDenominator()) {
            newDenominator = denominator*other.getDenominator();
            newNumerator = (numerator*other.denominator)+other.getNumerator();
            //do we need to bother with simplification?
            return new RationalNumber(newNumerator, newDenominator);
        }
        newDenominator = denominator;
        newNumerator = numerator+other.getNumerator();
        return new RationalNumber(newNumerator, newDenominator);
    }

    public RationalNumber divide(RationalNumber other) {
        int newDenominator;
        int newNumerator;
        //Since division is the opposite of multiplication this is fairly simple.
        newDenominator = denominator*other.getNumerator();
        newNumerator = numerator*other.getDenominator();
        //do we need to bother with simplification?
        return new RationalNumber(newNumerator, newDenominator);
    }

    public String toString() {
        return Integer.toString(numerator)+"/"+Integer.toString(denominator);
    }
}