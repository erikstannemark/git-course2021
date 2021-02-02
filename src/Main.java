import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String[] movies = new String[]{"Rick and morty", "South park", "The Mandalorian", "Breaking Bad", "Alternated Carbon"};


        String shortest = returnShortest(movies);

        System.out.println(shortest);

    }

    public static String returnShortest(String[] findShortest) {

        String shortest = findShortest[0];

        for (int i = 0; i < findShortest.length; i++) {
            if (findShortest[i].length() < shortest.length()) {
                shortest = findShortest[i];
            }
        }

        return shortest;

    }

}
