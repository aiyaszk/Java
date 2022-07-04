public class secondminutes {

    private static final String INVALID_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(3601));
    }

    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            System.out.println(INVALID_MESSAGE);
            return INVALID_MESSAGE;
        }
        int hours = (int) minutes / 60;
        int remainingMins = minutes % 60;

        String hoursString = hours + "h ";
        if (hours<10) {
            hoursString = "0" + hoursString;
        }

        String minsString = minutes + "m ";
        if (minutes<10) {
            minsString = "0" + minsString;
        }

        String reminsString = remainingMins + "h ";
        if (remainingMins<10) {
            reminsString = "0" + reminsString;
        }

        String secondsString = seconds + "s ";
        if (seconds<10) {
            secondsString = "0" + secondsString;
        }

        return (minsString + secondsString + " = " + hoursString + reminsString + secondsString);
    }

    private static String getDurationString(int seconds) {
        if (seconds<0) {
            System.out.println(INVALID_MESSAGE);
            return INVALID_MESSAGE;
        }
        int minutes = (int) seconds/60;
        int remainingS = seconds%60;

        String secondsString = seconds + "s ";
        if (seconds<10) {
            secondsString = "0" + secondsString;
        }

        String resecondsString = remainingS + "s ";
        if (remainingS<10) {
            resecondsString = "0" + resecondsString;
        }

        String minsString = minutes + "m ";
        if (minutes<10) {
            minsString = "0" + minsString;
        }

        System.out.println(secondsString + " = " + minsString + resecondsString);
        return getDurationString(minutes, remainingS);
    }
}
