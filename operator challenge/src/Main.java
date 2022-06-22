public class Main {
    public static void main(String[] args) {
        double a = 20.00;
        double b = 80.00;

        double total =  (a + b)*100.00;

        double remainder = total % 40.00;

        boolean isremainder = (remainder==0) ? true: false;

        if (isremainder == false) {
            System.out.println("got some remainder");
        }

    }
}