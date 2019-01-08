public class Main {

    public static void main(String[] args) {
        RationalNumber num1 = new RationalNumber(1,4);
        RationalNumber num2 = new RationalNumber(3,4);
        RationalNumber num3 = new RationalNumber(1,2);

        RationalNumber num4 = num1.add(num2);
        RationalNumber num5 = num1.add(num3);
        RationalNumber num6 = num2.divide(num3);

        System.out.println(num1.toString()+" + "+num2.toString()+" = "+num4.toString()+" OR "+num4.getQuotient());
        System.out.println(num1.toString()+" + "+num3.toString()+" = "+num5.toString()+" OR "+num5.getQuotient());
        System.out.println(num2.toString()+" / "+num3.toString()+" = "+num6.toString()+" OR "+num6.getQuotient());
    }
}