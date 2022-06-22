public class Main {
    public static void main(String[] args) {
        // primitive data types: boolean, byte, char, short, int, long, float, double

        int myValue = 10000;
        int MAxvalue = 2_147_483_647; //easier?? meh

        int minValue = Integer.MIN_VALUE; //min value that can be stored in an integer
        int maxValue = Integer.MAX_VALUE;
        System.out.println("Integer min value = "+ minValue);
        System.out.println("Integer min value = "+ maxValue);
        System.out.println("Busted MAX value = " + (maxValue +1)); //too large number - overflow
        System.out.println("Busted MIN value = " + (minValue -1)); //too large number - underflow

        byte minbyte = Byte.MIN_VALUE;
        byte maxbyte = Byte.MAX_VALUE;

        System.out.println(maxbyte);
        System.out.println(minbyte);

        short minshort = Short.MAX_VALUE;
        short maxshort = Short.MIN_VALUE;

        System.out.println(maxshort);
        System.out.println(minshort);

        /* short occupies 16
        byte occupies 8
        int occupies 32 bit
         */

        long longValue = 100L;
        long longmax = Long.MAX_VALUE;
        long longmin = Long.MIN_VALUE;

        System.out.println(longmax);
        System.out.println(longmin);

        // CASTING

        byte newbyte = (byte) (minbyte / 2);
        // mat işlemleri otomatik olarak int diye işlenir, o yüzden parantez'de byte eklenmeli

        byte num1 = 1;
        short num2 = 2;
        int num3 = 3;

        long total = 50000L + 10L*(num1+num3+num2);
        short total1 = (short) (1000 + 10L*(num1+num3+num2));
        System.out.println(total);

        // float is single precision covers 32 bits
        // double is double precision covers 64 bits

        float floatmax = Float.MAX_VALUE;
        float floatmin = Float.MIN_VALUE;
        System.out.println(floatmax);
        System.out.println(floatmin);

        double doublemax = Double.MAX_VALUE;
        double doublemin = Double.MIN_VALUE;
        System.out.println(doublemax);
        System.out.println(doublemin);

        int theint = 5;
        float thefloat = (float) 5.25;
        float thefloat1 = 5.25f; //we need to indicate the float since java takes it as a double
        double thedouble = 5d;

        // char occupies 16 bits, 1 byte || unicode-table.com
        char mychar = 'D';
        char unicodeChar = '\u0044';
        System.out.println(mychar);
        System.out.println(unicodeChar);

        boolean trueb = true;
        boolean falseb = false;

    }
}