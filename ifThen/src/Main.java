public class Main {
    public static void main(String[] args) {
        // most basic control flow statement is if-then
        // conditional logic: allow us to check conditional = true/false

        boolean a = false;
        if(a == false ) //no ;
            System.out.println("no alien");
            System.out.println("a");

        if(a == true ) //no ;
            System.out.println("no alien");
            System.out.println("a");
            //still prints out a because there is no code block

        if(a == true ) {
            System.out.println("no alien");
            System.out.println("a");
        }

        int top = 80;
        if (top ==100) {
            System.out.println("highest score bro");
        }

        if (top !=100) { //not equal to, logical complement operator
            System.out.println("highest score bro");
        }

        // AND && OPERATOR

        int secondtop = 60;
        if ((top > secondtop) && (top < 100)) { //&& is and
            System.out.println("greater than second top, less than 100");
        }

        // OR OPERATOR || (when there is only one | it is a bitwise operator)

        if ((top > 90)|| (secondtop<= 90)) { //top score is 80 false, secondtop is <90 tru
            System.out.println("either or both of the conditions are true");
        }

        int newval = 50; //assignment operator
        if(newval==50) { //equal to operator, looks for a boolean finds int when 1 equal sign
            System.out.println("is an error if there is one equal sign");
        }

        boolean newsval = false; //assignment operator
        if(newsval= true) { //assignment operator
            System.out.println("is an error if there is one equal sign");
        }

        newsval = false;
        if(newsval) { //assignment operator
            System.out.println("is an error if there is one equal sign");
        }

        // TERNARY OPERATOR

        newsval = true;
        boolean wasnewsval = newsval ? true : false;
        if (wasnewsval) {
            System.out.println("wasnewsval true");
        }
    }
}