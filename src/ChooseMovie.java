import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ChooseMovie {

    private final ArrayList<String> films = new ArrayList<>();

    ChooseMovie() {
        try {
            File file = new File("movies.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                films.add(scanner.nextLine());
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Błąd, nie znaleziono pliku");
        }

    }

    public char[] RandomChooseMovie() {
        return films.get((int) (Math.random() * films.size())).toCharArray();
    }

    public char[] dashRandomChoseMovie(char[] RandomChooseMovie) {
        char[] dashChosenMovie = RandomChooseMovie.clone();

        for (int i = 0; i < RandomChooseMovie.length; i++) {
            if (Character.toString(dashChosenMovie[i]).matches("[a-zA-Z0-9]")) {
                dashChosenMovie[i] = '-';
            }
        }
        return dashChosenMovie;
    }

}

