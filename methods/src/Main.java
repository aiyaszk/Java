public class Main {
    public static void main(String[] args) {
        // void means not returning any, empty

        /*boolean over = true;
        int score = 800;
        int completed= 5;
        int bonus= 100;

         calculateScore(over, score, completed, bonus);*/
        int finalscore = calculateScore(true, 800, 5, 100);
        System.out.println("your final score is " +finalscore);

        finalscore = calculateScore(true, 10000, 8, 200);
        System.out.println("your final score is " +finalscore);

    }

    public static int calculateScore(boolean over, int score, int completed, int bonus) {
        if(over) {
            int finals = score + (completed * bonus);
            finals+=1000;
            return finals;
        } else {
            return -1;
        }

        //return -1; can be here as well because return goes back to the main method
    }
}