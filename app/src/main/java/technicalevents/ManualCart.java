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


import expandable.ExpandableListAdapter5;

/**
 * Created by aasaqt on 10/2/15.
 */
public class ManualCart extends BaseActivity {
    ExpandableListAdapter5 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.manualcart);

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter5(this, listDataHeader, listDataChild);

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
        listDataHeader.add("TASK");
        listDataHeader.add("ARENA");
        listDataHeader.add("SPECIFICATIONS");
        listDataHeader.add("SCORING");
        listDataHeader.add("GAMEPLAY");
        listDataHeader.add("TEAM");
        listDataHeader.add("PRIZES");
        listDataHeader.add("CONTACT");



        // Adding child data
        List<String> intro = new ArrayList<String>();
        intro.add("\n" +
                "MANUAL CART (Cartalyst)\n" +
                "\n" +
                "Did you ever wonder of designing a car that utilizes no electronics or electrical energy but, based on pure Mechanics?\n" +
                "\n" +
                "If yes, then this event is for you.\n" +
                "\n" +
                "Design a Cart which is capable of propagating the path (Straight path) covering maximum distance without utilizing any electronic or electrical Mechanism (e.g. Motors, Wireless, solar etc.) and is based on Pure Mechanics.");

        List<String> task = new ArrayList<String>();
        task.add("Team has to design a self-propagating Cart/ Vehicle which is capable of travelling the Straight path with maximum distance. ");

        List<String> arena = new ArrayList<String>();
        arena.add("Arena will be a Straight Path with Markers on the Both Sides (Left/Right) in order to measure the distance Travelled by the Cart. Arena will be disclosed at the time of the event.");

        List<String> specifications = new ArrayList<String>();
        specifications.add("\n" +
                "  -  The dimensions of the cart should not exceed 300mm X 300mm X 300mm (lxbxh) at the start of the game.\n" +
                "  -  Use of Electronic/Electrical Components are strictly prohibited and doing so, will leads to immediate Disqualification.\n" +
                "  -  Use of Soda/Cola/Chemical/water or any other liquid Substance for vehicle propulsion is not allowed and will leads to immediate Disqualification. However, team can make use of rubber bands, balloons, Springs, Air pressure etc. for vehicle propulsion.\n" +
                "  -  A Security Check will be done in order to ensure Safety and vehicle/cart must satisfy the safety constraints determined by the organizers.\n");

        List<String> gameplay = new ArrayList<String>();
        gameplay.add("\n" +
                "  -  A total of three tries will be given to every team in order to traverse the path.\n" +
                "  -  The best of three will be considered as the final Score.\n");
        List<String> score = new ArrayList<String>();
        score.add("\n" +
                "  -  Total Score = Maximum Distance travelled (in inches/meters).\n" +
                "  -  Team covering the maximum distance will be considered as winner.\n" +
                "  -  In case of Tie. A team having less time will be considered as winner.\n");

        List<String> team = new ArrayList<String>();
        team.add("\n" +
                "  -  A team may consist of a maximum of 3 members. Students from different educational institutes can form a team.\n" +
                "  -  All students with a valid identity card of their respective educational institutes are eligible to participate in the event.\n");
        List<String> prize = new ArrayList<String>();
        prize.add("\n" +
                "  -  1st – Worth Rs. 3000\n" +
                "  -  2nd – Worth Rs. 2000\n");
        List<String> contact = new ArrayList<String>();
        contact.add("\n" +
                "  -  Rajat Kosh – +91-7837877087\n" +
                "  -  Puneet Sikka – +91-8146587896\n" +
                "  -  Aasaqt Agarwal – +91-8699501166\n");







        listDataChild.put(listDataHeader.get(0), intro); // Header, Child data
        listDataChild.put(listDataHeader.get(1), task);
        listDataChild.put(listDataHeader.get(2), arena);
        listDataChild.put(listDataHeader.get(3), specifications);
        listDataChild.put(listDataHeader.get(4), score);
        listDataChild.put(listDataHeader.get(5), gameplay);
        listDataChild.put(listDataHeader.get(6), team);
        listDataChild.put(listDataHeader.get(7), prize);
        listDataChild.put(listDataHeader.get(8), contact);
        getActionBar().setTitle("Manual Cart");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
