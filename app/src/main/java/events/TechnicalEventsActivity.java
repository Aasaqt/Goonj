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


import technicalevents.BugSmash;
import technicalevents.Csi;
import technicalevents.Hackathon;
import technicalevents.ManualCart;
import technicalevents.MazeSolver;
import technicalevents.PicknPlace;
import technicalevents.RoboWarrior;
import technicalevents.Submerge;
import technicalevents.Triangle;

import com.goonj.android.goonj1.R;

/**
 * Created by aasaqt on 10/1/15.
 */
public class TechnicalEventsActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.technicalevent);
        getActionBar().setTitle("TECHNICAL EVENTS");
        listView = (ListView) findViewById(R.id.listView);
        String values[] = {"Pick 'n Place",
                            "Submerged","Robo Warrrior","Line Follower","Manual cart(Cartalyst)"
                ,"Hackathon","Bug smash(C/C++)","Triangle - Let's code mate","CSI - Crime Scene Investigaton"};
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
                Intent a= new Intent(this,PicknPlace.class);
                startActivity(a);
                break;
            case 1:
                Intent b= new Intent(this, Submerge.class);
                startActivity(b);
                break;
            case 2:
                Intent c= new Intent(this, RoboWarrior.class);
                startActivity(c);
                break;
            case 3:
                Intent d= new Intent(this, MazeSolver.class);
                startActivity(d);
                break;
            case 4:
                Intent e= new Intent(this, ManualCart.class);
                startActivity(e);
                break;
            case 5:
                Intent f= new Intent(this, Hackathon.class);
                startActivity(f);
                break;
            case 6:
                Intent g= new Intent(this, BugSmash.class);
                startActivity(g);
                break;
            case 7:
                Intent h= new Intent(this, Triangle.class);
                startActivity(h);
                break;
            case 8:
                Intent i= new Intent(this, Csi.class);
                startActivity(i);
                break;
            /*case 9:
                Intent j= new Intent(this, BioHunt.class);
                startActivity(j);
                break;*/

        }
    }
}
