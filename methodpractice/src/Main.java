public class Main {
    public static void main(String[] args) {
        int highscore = calculateHighScorePosition(1500);
        displayHighScorePosition("Mabel", highscore);

        highscore =calculateHighScorePosition(900);
        displayHighScorePosition("Dipper", highscore);

        highscore =calculateHighScorePosition(400);
        displayHighScorePosition("Hinata", highscore);

        highscore =calculateHighScorePosition(50);
        displayHighScorePosition("John", highscore);

    }

    public static void displayHighScorePosition(String playername, int highscore){
        System.out.println("player name is " + playername + " and position is " + highscore);
    }

    public static int calculateHighScorePosition(int playerscore) {
        // or set a variable, change it in any case of if,
        // and use only one return to return tha variable

        if(playerscore>=1000) {
            return 1;
        }
        else if(playerscore>=500) {
            return 2;
        }
        else if(playerscore>=100) {
            return 3;
        }
        return 4;
    }
}