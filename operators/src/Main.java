public class Main {
    public static void main(String[] args) {
        // operators are soecial symbols that perform specific operation - ex: +, -
        /* operands:
        int myVar = 12 + 15 | 12 and 15 are manipulated by an operator so they are operands
         */
        //expression is 27, operands after being manipulated by operators

        int result = 1 + 2; //3
        int previousresult = result;
        System.out.println(previousresult);
        result = result -1;
        System.out.println(result);
        result = 4;
        result = result % 3;
        System.out.println(result);

        // result = result + 1
        result++; //1+1
        System.out.println(result);

        //result = result - 1
        result--; //2-1
        System.out.println(result);

        //result = result + 2
        result+=2; //1+2
        System.out.println(result);

    }
}