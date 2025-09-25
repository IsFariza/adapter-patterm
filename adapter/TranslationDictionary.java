package adapter;

import java.util.HashMap;

public class TranslationDictionary {
    static HashMap<String, String> dictionary = new HashMap<>();
    public static void load(){

        dictionary.put("hello", "Привет");
        dictionary.put("how are you?", "Как дела?");
        dictionary.put("i'm fine", "Я в порядке.");
        dictionary.put("thank you", "Спасибо");
        dictionary.put("goodbye", "До свидания.");
    }

    public static String translate(String word){
        String russianWord = dictionary.get(word.toLowerCase());
        if(russianWord==null){
            return "Translation not found for " + word;
        }
        return russianWord;
    }
}

