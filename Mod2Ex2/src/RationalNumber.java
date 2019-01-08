public class RationalNumber implements Rational {
    private int numerator;
    private int denominator;

    /**
     * Constructor: Object takes a numerator and denominator as arguments
     * @param n int
     * @param d int
     */
    RationalNumber(int n, int d) {
        numerator = n;
        denominator = d;
    }

    /**
     * Return the quotient
     * @return flaot
     */
    public float getQuotient() {
        return (float)numerator/(float)denominator;
    }

    /**
     * Get the Rational value's numerator
     * @return int
     */
    public int getNumerator()
    {
        return numerator;
    }

    /**
     * Get the Rational value's denominator
     * @return int
     */
    public int getDenominator()
    {
        return denominator;
    }

    /**
     * Add two Rationals together and get a new RationalNumber back
     * @param other Rational
     * @return RationalNumber
     */
    public RationalNumber add(Rational other) {
        int newDenominator;
        int newNumerator;
        if(denominator!=other.getDenominator()) {
            newDenominator = denominator*other.getDenominator();
            newNumerator = (numerator*other.getDenominator())+other.getNumerator()*denominator;
            //do we need to bother with simplification?
            return new RationalNumber(newNumerator, newDenominator);
        }
        newDenominator = denominator;
        newNumerator = numerator+other.getNumerator();
        return new RationalNumber(newNumerator, newDenominator);
    }

    /**
     * Divide tow Rationals together and get a new RationalNumber back.
     * @param other Rational
     * @return RationalNumber
     */
    public RationalNumber divide(Rational other) {
        int newDenominator;
        int newNumerator;
        //Since division is the opposite of multiplication this is fairly simple.
        newDenominator = denominator*other.getNumerator();
        newNumerator = numerator*other.getDenominator();
        //do we need to bother with simplification?
        return new RationalNumber(newNumerator, newDenominator);
    }

    /**
     * Ouput the RationalNumber as a string
     * @return String
     */
    public String toString() {
        return Integer.toString(numerator)+"/"+Integer.toString(denominator);
    }
}