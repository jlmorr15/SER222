public interface Rational {
    public float getQuotient(); //computes the quotient
    public int getNumerator();
    public int getDenominator();
    public Rational add(Rational other); //this + other
    public Rational divide(Rational other); //this / other
}