package adapter;

//this is an Adapter
public class TranslatorAdapter implements EnglishSpeaker{
    private RussianSpeaker russianSpeaker;

    public TranslatorAdapter(){
        this.russianSpeaker=new RussianPerson();
        TranslationDictionary.load();
    }

    @Override
    public String speakEnglish(String word){
        return russianSpeaker.speakRussian(TranslationDictionary.translate(word));
    }
}
