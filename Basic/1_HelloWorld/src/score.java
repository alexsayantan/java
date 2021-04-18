public class score {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelComplete = 5;
        int bonus = 100;

        if (gameOver){ // if(gameover == true) means if(gameover)
            int finalScore = score + (levelComplete + bonus);
            finalScore += 1000;
            System.out.println("Your Final Score = " + finalScore);
        }

        score = 10000;
        levelComplete = 8;
        bonus = 200;
        gameOver = false;

        if (!gameOver)
        {
            int finalScore = score + (levelComplete * bonus);
            System.out.println("Your Final Score = " + finalScore);
        }


    }
}
