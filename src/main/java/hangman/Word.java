package hangman;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Word {
    public String   randomWords() {
        List<String> words = new ArrayList<>();
        words.add("юла");
        words.add("окно");
        words.add("кошка");
        words.add("собака");
        words.add("колбаса");
        words.add("ласточка");
        Random random = new Random();
        int randomIndex = random.nextInt(words.size());
        return words.get(randomIndex);
    }
}
