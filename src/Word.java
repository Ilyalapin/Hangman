import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Word {

    private final Random random = new Random();

    public String chooseRandomWord() {

        List<String> words = new ArrayList<>();
        words.add("юла");
        words.add("окно");
        words.add("кошка");
        words.add("собака");
        words.add("колбаса");
        words.add("ласточка");

        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }
}