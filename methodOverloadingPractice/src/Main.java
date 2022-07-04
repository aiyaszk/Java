public class Main {
    public static void main(String[] args) {
        calcfeetAndInchesToCentimeters(27);
        calcfeetAndInchesToCentimeters(100);
        calcfeetAndInchesToCentimeters(6, -3);
        calcfeetAndInchesToCentimeters(0, 11);
    }

    public static double calcfeetAndInchesToCentimeters (double feet, double inches) {
        if (feet>=0 && inches>=0 && inches<=12) {
            double cm = inches*2.54 + feet*12.0*2.54;
            System.out.println(feet + " feet " + inches + " inches = " + cm + " cm");
            return cm;
        }
        System.out.println("Invalid -_- ");
        return -1;
    }

    public static double calcfeetAndInchesToCentimeters (int inches) {
        if (inches>=0) {
            double feet = (int) inches/12;
            double remainingInches = (int) inches %12;

            System.out.println(inches + " inches is = " + feet + " feet " + remainingInches + " inches");
            return calcfeetAndInchesToCentimeters(feet, remainingInches);
        }

        return -1;
    }
}