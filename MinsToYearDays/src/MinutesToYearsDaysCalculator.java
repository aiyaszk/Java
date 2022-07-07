public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays (long minutes) {
        if (minutes<0){
            System.out.println("Invalid Value");
        }
        else {
            int totaldays = (int) ((minutes/60)/24);
            int totalyears = (int) (totaldays/365);
            int lastdays = (int) (totaldays%365);

            System.out.println(minutes + " min = " + totalyears + " y and " + lastdays + " d");
        }

    }


}
