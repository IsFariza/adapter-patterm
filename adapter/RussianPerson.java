package adapter;

public class RussianPerson implements RussianSpeaker{
    @Override
    public String speakRussian(String word){
        return word;
    }
}
