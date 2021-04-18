public class HighscorePosition {
    public static void main(String[] args) {
        String a = "Sayantan Saha ";
        int b = 1;
        int c = 1500;
        System.out.println("Position Concured = " + calculateHigHScorePosition(c));
        displayHighScorePosition(a,b);
        System.out.println("Position = " + calculateHighScore(c));
        String ab = "Sajda Parveen ";
        int bc = 2;
        int cd = 900;
        System.out.println("Position Concured = " + calculateHigHScorePosition(cd));
        displayHighScorePosition(ab,bc);

        System.out.println("Position Concured = " + calculateHigHScorePosition(1000));
        displayHighScorePosition("Rohit ",1);

    }

    public static void displayHighScorePosition(String playerName,int position) {
        System.out.println(playerName + "manage to get into position " + position + " on the highscore table ");
    }

    public static int calculateHigHScorePosition(int playerScore) {
        if (playerScore >= 1000)
            return 1;
        else if (playerScore >= 500 && playerScore < 1000)
            return 2;
        else if (playerScore >= 100 && playerScore < 500)
            return 3;
        else
            return 4;

    }

    public static int calculateHighScore(int playscore) {
        int p = 4;
        if (playscore >= 1000)
            p = 1;
        else if (playscore < 1000 && playscore >= 500)
            p = 2;

        return p;
    }
}
