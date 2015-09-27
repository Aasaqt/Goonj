package finearts;

/**
 * Created by aasaqt on 12/2/15.
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


import expandable.ExpandableListAdapter19;

/**
 * Created by aasaqt on 10/2/15.
 */
public class Trashion extends BaseActivity {
    ExpandableListAdapter19 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.trashion);

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter19(this, listDataHeader, listDataChild);

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
        listDataHeader.add("MATERIALS PROVIDED");
        listDataHeader.add("JUDGING CRITERIA");
        listDataHeader.add("PRIZES");
        listDataHeader.add("CONTACT");



        // Adding child data
        List<String> intro = new ArrayList<String>();
        intro.add("You have competed in that evergreen best out of waste competition. Why not give it just another shot? However, yes. So cutting out all the clinched stuff we bring you a fashion designing competition with a twist, where you must a produce a dress out of garbage. Bring out your fashion skills to design an outfit. Run your wildest imagination and create a masterpiece worth watching.\n" +
                "\n" +
                "Just a li’l advice, choose less stinky material coz you’re gonna wear it.");
        List<String> rules = new ArrayList<String>();
        rules.add("\n" +
                "  -  Participants in team of atmost 2 are required to make an outfit with the materials provided by the organizers which will be given prior to the event. Any other material is not allowed.\n" +
                "  -  Time limit for the event is 3 hours.\n" +
                "  -  Each team will have to give a presentation before the judges after the dress designing is over.\n" +
                "  -  Any potentially vulgar designing of the dress will lead to disqualification.\n" +
                "  -  Decision of judges shall be final and binding.\n" +
                "  -  The organizing tem reserves the right to change or modify any of the rules.\n");
        List<String> material = new ArrayList<String>();
        material.add("Plastic sacks, newspapers, wrappers, thermocol pieces, bottle caps and other required stationery items.");
        List<String> judge = new ArrayList<String>();
        judge.add("Overall appeal of the dress, creativity, style, intelligent use of materials and finishing.");
        List<String> prize = new ArrayList<String>();
        prize.add("1st – Worth Rs. 2000\n" +
                "\n" +
                "2nd – Worth Rs. 1000");
        List<String> contact = new ArrayList<String>();
        contact.add("Karanveer Singh Kohli – +91-9779999968");







        listDataChild.put(listDataHeader.get(0), intro); // Header, Child data
        listDataChild.put(listDataHeader.get(1), rules);
        listDataChild.put(listDataHeader.get(2), material);
        listDataChild.put(listDataHeader.get(3), judge);
        listDataChild.put(listDataHeader.get(4), prize);
        listDataChild.put(listDataHeader.get(5), contact);
        getActionBar().setTitle("Face Canvas");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
