package adapter;
//this is a Client, it only talks to Target(EnglishSpeaker), without knowing about RussianSpeaker
public class Main {
    public static void main(String[] args){
        EnglishSpeaker translator = new TranslatorAdapter();

        System.out.println(translator.speakEnglish("Hello"));
        System.out.println(translator.speakEnglish("cat"));

    }
}
