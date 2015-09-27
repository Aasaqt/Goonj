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

import culturalevents.Bands;
import culturalevents.Bhangra;
import culturalevents.FashionShow;
import culturalevents.GroupDance;
import culturalevents.LooseIt;
import culturalevents.MrGoonj;

/**
 * Created by aasaqt on 10/1/15.
 */
public class CulturalEventsActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.culturalevent);
        getActionBar().setTitle("CULTURAL EVENTS");
        listView = (ListView) findViewById(R.id.listView);
        String values[] = {"Mr and Miss Goonj 2015",
                "Metamophisis(Battle of Bands)","Rang Punjab De","Loose It","Group Dance - Hit The Floor"
                ,"Fashion Show"};
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
                Intent a= new Intent(this, MrGoonj.class);
                startActivity(a);
                break;
            case 1:
                Intent b= new Intent(this, Bands.class);
                startActivity(b);
                break;
            case 2:
                Intent c= new Intent(this, Bhangra.class);
                startActivity(c);
                break;
            case 3:
                Intent d= new Intent(this, LooseIt.class);
                startActivity(d);
                break;
            case 4:
                Intent e= new Intent(this, GroupDance.class);
                startActivity(e);
                break;
            case 5:
                Intent f= new Intent(this, FashionShow.class);
                startActivity(f);
                break;

        }
    }
}