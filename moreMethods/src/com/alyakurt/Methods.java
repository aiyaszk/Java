package com.alyakurt;

public class Methods {

    /* in java two or more methods may have the same name if they are differing in
    parameters, this is referred as overloading
     */

    public static void main(String[] args) {
        int newScore = calculateScore("John", 13);
        System.out.println("new score is" + newScore);
        int anotherval = calculateScore(78);
        System.out.println(anotherval);
        calculateScore();

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score*1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player player scored " + score + " points");
        return score*1000;
    }

    public static void calculateScore() {
        System.out.println("No player name, no score");
    }


}
