public class Main {
    public static void main (String[] args) {
    /* we can create our own data types with classes in java, and we
    can combine already given data types as well
     */
        // string is not a primitive data type, its a class and they are immutable

        String stringval = "This is a string";
        System.out.println("my String " + stringval);

        stringval = stringval + ", and this is more.";
        System.out.println(stringval);

        stringval = stringval + "\u00A9 2019";
        System.out.println(stringval);

        String a = "10";
        int b = 50;
        a = a + b; //coverts it to a string automatically
        System.out.println(a);
    }
}
