package culturalevents;

/**
 * Created by aasaqt on 10/2/15.
 */

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import com.goonj.android.goonj1.BaseActivity;
import com.goonj.android.goonj1.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import expandable.ExpandableListAdapter16;

/**
 * Created by aasaqt on 10/2/15.
 */
public class FashionShow extends BaseActivity {
    ExpandableListAdapter16 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.fashionshow);

        expListView = (ExpandableListView) findViewById(R.id.lvExp3);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter16(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
        expListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {

            @Override
            public void onGroupExpand(int groupPosition) {
                /*Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Expanded",
                        Toast.LENGTH_SHORT).show();*/
            }
        });

        // Listview Group collasped listener
        expListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
                /*Toast.makeText(getApplicationContext(),
                        listDataHeader.get(groupPosition) + " Collapsed",
                        Toast.LENGTH_SHORT).show();*/

            }
        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
                /*Toast.makeText(
                        getApplicationContext(),
                        listDataHeader.get(groupPosition)
                                + " : "
                                + listDataChild.get(
                                listDataHeader.get(groupPosition)).get(
                                childPosition), Toast.LENGTH_SHORT)
                        .show();*/
                return false;
            }
        });
    }
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("INTRODUCTION");
        listDataHeader.add("GENERAL RULES");
        listDataHeader.add("PRIZES");
        listDataHeader.add("CONTACT");



        // Adding child data
        List<String> intro = new ArrayList<String>();
        intro.add("“Is fashion the root of all your passion? Got the face, the pace, the class and the grace of a celebrity? Now, you have the chance to be the one! Walk up the ramp with your attitude, the best designed outfits and on the best of the music.  The Fashion Show will make sure your style goes ramp-ant.\n" +
                "\n" +
                "No of participants per team: 8 – 15 members\n" +
                "\n" +
                "Age Group: 16-25");
        List<String> rules = new ArrayList<String>();
        rules.add("\n" +
                "\n" +
                "  -  This event is open to all.\n" +
                "\n" +
                "  -  It is compulsory for all participants and non-participants to carry their respective ID cards on all the days.\n" +
                "\n" +
                "  -  Extra members that are allowed to be part of the team are the choreographer, designer, light & sound person.\n" +
                "\n" +
                "  -  Time limit: 12-15 minutes. Time limit will be inclusive of stage setup and introduction\n" +
                "\n" +
                "  -  Points will be deducted for exceeding the time limit\n" +
                "\n" +
                "  -  Teams will be judged on the basis of clothing, choreography, attitude, creativity and originality, coordination, props and glamour, adaption of theme\n" +
                "\n" +
                "  -  No props and costumes will be provided by us. Teams have to bring their own costumes and props.\n" +
                "\n" +
                "  -  Music must be mailed to the Event Coordinator two days prior to the event in MP3 format\n" +
                "\n" +
                "  -  All lighting requirements must be mailed beforehand to the Event Coordinator\n" +
                "\n" +
                "  -  Person responsible for the lighting and sound should be present during the performance\n" +
                "\n" +
                "  -  The performance will be held in an outdoor (open air) stage\n" +
                "\n" +
                "  -  No fire, water, life threatening tools, live animals can be used\n" +
                "\n" +
                "  -  Vulgarity of any kind will lead to disqualification of the team from the event\n" +
                "\n" +
                "  -  Decision of the judges and organizing committee is final\n" +
                "\n" +
                "  -  The team which fails to perform during its allotted slot will not be given second chances.\n" +
                "\n" +
                "  -  College will not be responsible for any misplaced or lost belongings\n" +
                "\n" +
                "  -  Drinking and smoking is prohibited inside the campus.\n");
        List<String> prize = new ArrayList<String>();
        prize.add("1st – Worth Rs. 25,000");
        List<String> contact = new ArrayList<String>();
        contact.add("Akshay Bhushan –  +91-8558875488");








        listDataChild.put(listDataHeader.get(0), intro); // Header, Child data
        listDataChild.put(listDataHeader.get(1), rules);
        listDataChild.put(listDataHeader.get(2), prize);
        listDataChild.put(listDataHeader.get(3), contact);
        getActionBar().setTitle("Fashion Show");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
