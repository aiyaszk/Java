public class BarkingDog {
    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {
        if (barking == true) {
            if (0<=hourOfDay && hourOfDay<8 || 22<hourOfDay && hourOfDay<=23) {
                return true;
            }
        }
        return false;
    }
}
