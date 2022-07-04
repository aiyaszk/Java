public class TeenNumberChecker {
    public static boolean hasTeen (int a, int b, int c) {
        // teen is 13-19 inclusive

        if ((13<=a && 19>=a) || (13<=b && 19>=b) || (13<=c && 19>=c)) {
            return true;
        }

        return false;

    }

    public static boolean isTeen (int d) {
        if (13<=d && 19>=d) {
            return true;
        }

        return false;
    }
}
