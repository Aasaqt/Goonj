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


import expandable.ExpandableListAdapter8;

/**
 * Created by aasaqt on 10/2/15.
 */
public class Triangle extends BaseActivity {
    ExpandableListAdapter8 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.triangle);

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter8(this, listDataHeader, listDataChild);

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
        intro.add("Talent wins games, but teamwork and intelligence wins championships.");
        List<String> rules = new ArrayList<String>();
        rules.add("\n" +
                "  -  It is a team based (strictly team of 3) coding algorithmic hard-coding event, from which team solving the problems will go to next round.\n" +
                "  -  Each team will be provided with 3 problems in which the teams would have to solve the problem where only one member will be dealing with the one problem at a time.\n" +
                "  -  At the shot of the buzzer which would buzz after 30 minutes, the next team member would have to switch the place with the previous member (in a triangular manner) and continue coding from where his/her team member left off.\n" +
                "  -  The switch would be in a triangular fashion.\n" +
                "  -  No discussion will be permitted.\n" +
                "  -  Members of the same team would be well-separated.\n" +
                "  -  The programs have to be written in C/C++.\n" +
                "  -  Team members cannot be changed during the event.\n" +
                "  -  No member will be allowed to swap the position before the buzzer, no matter if he/she has completed his part of the question.\n" +
                "  -  Decisions made by the Judges would be final and binding.\n" +
                "  -  The participants will not be allowed access to the internet and if found using any unfair means, the team will be disqualified.\n" +
                "\n" +
                "Final Round:\n" +
                "\n" +
                "  -  In this round, qualified teams will be provided with three on the spot problems.\n" +
                "  -  Only single computer will be provided to a single team (You are not allowed to use the Laptops).\n" +
                "  -  Team solving the problem in the minimum time will be the winner.\n");
        List<String> prize = new ArrayList<String>();
        prize.add("\n" +
                "  -  1st – Worth Rs. 5000\n" +
                "  -  2nd – Worth Rs. 2000\n");
        List<String> contact = new ArrayList<String>();
        contact.add("Aasaqt –  +91-8699501166");







        listDataChild.put(listDataHeader.get(0), intro); // Header, Child data
        listDataChild.put(listDataHeader.get(1), rules);
        listDataChild.put(listDataHeader.get(2), prize);
        listDataChild.put(listDataHeader.get(3), contact);
        getActionBar().setTitle("Triangle");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
