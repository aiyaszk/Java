public class Main {
    public static void main(String[] args) {
        boolean a = true;
        int score = 1200;
        int completed= 5;
        int bonus= 100;

        if(score<5000 && score >1000) {
            System.out.println("your score is less than 5000, greater than 1000");
        }
        else if(score<1000){
            System.out.println("score is less than 1000");
        }
        else {
            System.out.println("got here");
        }

        if(a==true) { //(a) is the same thing
            int finals = score + (completed * bonus);
            System.out.println("your final score is " +  finals);
        }

        score = 10000;
        completed = 8;
        bonus = 200;

        int finals = score + (completed * bonus);
        System.out.println(finals);
    }
}