public class Main {

    public static void main(String[] args) {
        RationalNumber num1 = new RationalNumber(1,4);
        RationalNumber num2 = new RationalNumber(3,4);
        RationalNumber num3 = new RationalNumber(1,2);

        RationalNumber num4 = num1.add(num2);
        System.out.println(num4.toString());
    }
}
