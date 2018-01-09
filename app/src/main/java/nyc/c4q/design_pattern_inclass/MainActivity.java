package nyc.c4q.design_pattern_inclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import nyc.c4q.design_pattern_inclass.question1.DeckofCards;
import nyc.c4q.design_pattern_inclass.question1.MonthOfTheYear;
import nyc.c4q.design_pattern_inclass.question2.Underwear;
import nyc.c4q.design_pattern_inclass.question3.Thanksgiving;

import static nyc.c4q.design_pattern_inclass.question1.DeckofCards.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LogCards(DIAMONDS.toString());

        DeckofCards[] deck= DeckofCards.values();
        for (int i = 0; i < deck.length; i++) {
            Log.d("Looping the deck", deck[i].name() + ": " + deck[i].toString());
        }

        for (DeckofCards deck1: DeckofCards.values()) {
            Log.d("Looping the deck", deck1.name() + ": " + deck1.toString());
        }

        LogMonth(String.valueOf(MonthOfTheYear.APRIL.getMonthNumber()));

//        Underwear underwear = new Underwear("blue");

        Underwear underwear= Underwear.getUnderweaInstance();

        Thanksgiving thanksgiving= new Thanksgiving.ThanksgivingBuilder()
                .setMashedpotatoes(true)
                .setPasta("Alfredo Pasta")
                .setPie("Pumpkin Pie")
                .setCorn(true)
                .setGravy(true)
                .setTurkey(true)
                .build();

        Log.d("Thanksgiving Dinner: ", "Pie: " + thanksgiving.getPie()+ ", Pasta: " + thanksgiving.getPasta());


    }

    public void LogCards(String input){
        Log.d("What card do I have?", input);
    }

    public void LogMonth(String input){
        Log.d("What month is it?", input);
    }
}
