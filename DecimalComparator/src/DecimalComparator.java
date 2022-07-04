public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces (double anumber, double bnumber) {
        if (anumber<0 && bnumber<0 || anumber>0 && bnumber>0 || anumber==0 && bnumber==0) {
            if (anumber<0 && bnumber<0) {
                anumber *= -1;
                bnumber *= -1;
            }
            anumber = anumber *1000;
            int Anumber = (int) anumber;

            bnumber = bnumber *1000;
            int Bnumber = (int) bnumber;

            System.out.println(Anumber);
            System.out.println(Bnumber);

            if ((int) Anumber==Bnumber) {
                System.out.println("true");
                return true;
            }

            System.out.println("false");
            return false;

        }

        System.out.println("false");
        return false;
    }
}
