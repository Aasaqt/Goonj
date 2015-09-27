package events;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.goonj.android.goonj1.BaseActivity;
import com.goonj.android.goonj1.R;

import literaryevents.BrandQuiz;
import literaryevents.ComputerQuiz;
import literaryevents.Debate;
import literaryevents.FantasyQuiz;
import literaryevents.Idiots;
import literaryevents.PotPori;
import literaryevents.SportQuiz;
import literaryevents.TrivialPursuit;

/**
 * Created by aasaqt on 10/1/15.
 */
public class LiteraryEventsActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.literaryevent);
        getActionBar().setTitle("LITERARY EVENTS");
        listView = (ListView) findViewById(R.id.listView);
        String values[] = {"Sport Quiz",
                "Brand Quiz","Computer Quiz","Pot Pourri","Fantasy Quiz"
                ,"Trivial Pursuit","3 Idiots","Speak Out - The Debate"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch(position){
            case 0:
                Intent a= new Intent(this, SportQuiz.class);
                startActivity(a);
                break;
            case 1:
                Intent b= new Intent(this, BrandQuiz.class);
                startActivity(b);
                break;
            case 2:
                Intent c= new Intent(this, ComputerQuiz.class);
                startActivity(c);
                break;
            case 3:
                Intent d= new Intent(this, PotPori.class);
                startActivity(d);
                break;
            case 4:
                Intent e= new Intent(this, FantasyQuiz.class);
                startActivity(e);
                break;
            case 5:
                Intent f= new Intent(this, TrivialPursuit.class);
                startActivity(f);
                break;
            case 6:
                Intent g= new Intent(this, Idiots.class);
                startActivity(g);
                break;
            case 7:
                Intent h= new Intent(this, Debate.class);
                startActivity(h);
                break;

        }
    }
}
