import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) {
        boolean playAgain;

        do {
            ChooseMovie choseMovie = new ChooseMovie();

            char[] movie = choseMovie.RandomChooseMovie();
            char[] dashMovie = choseMovie.dashRandomChoseMovie(movie);

            Game game = new Game(movie, dashMovie);

            playAgain = game.playAgain();

        } while(playAgain);

    }

}





