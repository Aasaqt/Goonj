package technicalevents;

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


import expandable.ExpandableListAdapter6;

/**
 * Created by aasaqt on 10/2/15.
 */
public class Hackathon extends BaseActivity {
    ExpandableListAdapter6 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.hackathon);

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter6(this, listDataHeader, listDataChild);

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
        intro.add("Whatsapp Messenger, Hike Messenger, Share It, True caller are some simple yet powerful hacks solving problems. They are just to name a few out of millions. Have you ever dreamt of building something, which addresses the challenges related to life-changing problems or is even used by millions of people across the globe. If yes, then your ticket to turning this enthralling thought into reality is right in front of you. UIET presents the premier HACKATHON this GOONJ 2015 where we gathering some of the best minds in the country to create apps for a better world. Come be a part of an all-around event where developers from entire country participate in a !@ hour long app making contest. So guys pack up your ideas and suggestions as interesting tech talks, hacking tips and lessons, coding workshops and weekly problem statements awaits you. Make hay while the opportunity lasts and keep watching the HACKATHON space for regular updates. ");
        List<String> rules = new ArrayList<String>();
        rules.add("\n" +
                "  -  It is an open problem statemnent event. One has to submit their idea before start of the event on the portal that will be just up before the events kicks-off.\n" +
                "  -  All the coding should be done during the event.\n" +
                "  -  Participants are expected to bring all tools and software necessary to build the problem statement. Organizers will provide power strips.\n" +
                "  -  Contest will go on for 3 hours(tentative).\n" +
                "  -  Your entry will be instantly disqualified if your code directly calls unmanaged code or directly reads, writes or executes any database object other than those created by your module.\n" +
                "  -  The organizing committee reserves the rights to change or modify any of the rules.\n");
        List<String> prize = new ArrayList<String>();
        prize.add("\n" +
                "  -  1st – Worth Rs. 4000\n" +
                "  -  2nd – Worth Rs. 2000\n");
        List<String> contact = new ArrayList<String>();
        contact.add("Aasaqt –  +91-8699501166");







        listDataChild.put(listDataHeader.get(0), intro); // Header, Child data
        listDataChild.put(listDataHeader.get(1), rules);
        listDataChild.put(listDataHeader.get(2), prize);
        listDataChild.put(listDataHeader.get(3), contact);
        getActionBar().setTitle("Hackathon");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
