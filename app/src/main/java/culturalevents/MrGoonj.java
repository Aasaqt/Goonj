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


import expandable.ExpandableListAdapter12;

/**
 * Created by aasaqt on 10/2/15.
 */
public class MrGoonj extends BaseActivity {
    ExpandableListAdapter12 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.mrgoonj);

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter12(this, listDataHeader, listDataChild);

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
        intro.add("Are you witty enough? Creative enough? Intelligent enough? Spontaneous enough? Impress the judges and the audience with your notability and win your first ever pageant.");
        List<String> rules = new ArrayList<String>();
        rules.add("Event will Consist of Two Rounds.\n" +
                "\n" +
                "Round 1\n" +
                "\n" +
                "  -  The participants are required to send their pics as message on Goonj UIET’s facebook page.\n" +
                "  -  Top Twelve Girls and Boys who are having Maximum Likes onto their pics will be qualified for the Second Round.\n" +
                "\n" +
                "Round 2\n" +
                "\n" +
                "  -  Qualified Participants will be called on the final day of Goonj’15.\n" +
                "  -  This round will consist of three more Sub-rounds. i.e. Walk `n Intro, Talent round & Questionaire.\n" +
                "\n" +
                "No vulgarity and obscenity will be allowed.\n" +
                "\n" +
                "  -  Judges’ decision will be final.\n" +
                "  -  Rules of every round will be given to participants before the event starts.\n" +
                "  -  Individual Participation Only.\n");
        List<String> prize = new ArrayList<String>();
        prize.add("Worth Rs. 10,000\n" +
                "\n");
        List<String> contact = new ArrayList<String>();
        contact.add("Akshay Bhushan –  +91-8558875488");







        listDataChild.put(listDataHeader.get(0), intro); // Header, Child data
        listDataChild.put(listDataHeader.get(1), rules);
        listDataChild.put(listDataHeader.get(2), prize);
        listDataChild.put(listDataHeader.get(3), contact);
        getActionBar().setTitle("Mr and Mrs Goonj");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
