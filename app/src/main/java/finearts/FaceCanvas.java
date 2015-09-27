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


import expandable.ExpandableListAdapter18;

/**
 * Created by aasaqt on 10/2/15.
 */
public class FaceCanvas extends BaseActivity {
    ExpandableListAdapter18 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.facecanvas);

        expListView = (ExpandableListView) findViewById(R.id.lvExp5);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter18(this, listDataHeader, listDataChild);

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
        intro.add("Every face is a blank canvas and the true expressions are portrayed only when it is tinted in the right shade. Most of you have painted on canvas and papers, but what if the face becomes the canvas? Hold up your brushes and unfurl your painted counterpart. Because art enables us to find ourselves and lose ourselves at the same time. Get ready to decorate your partner’s face.\n" +
                "\n" +
                "We aren’t on an undercover identity-destruction mission, so we will ensure completely organic and safe paints for your delicate skins! All you need is a friend who is willing to trust you with their face!");
        List<String> rules = new ArrayList<String>();
        rules.add("\n" +
                "  -  This is a team event having 2 members. One member will paint on the other member’s face.\n" +
                "  -  All logistics and material shall be provided on the spot.\n" +
                "  -  Time limit for the event is 2 hours.\n" +
                "  -  Decision of judges shall be final and binding.\n" +
                "  -  The organizing team reserves the right to change or modify any of the rules.\n" +
                "  -  Stickers and any kind of make-up items are not allowed.\n");
        List<String> material = new ArrayList<String>();
        material.add("Colours, Round brushes");
        List<String> judge = new ArrayList<String>();
        judge.add("Theme and colour contrast of the painting will be rewarded.");
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
