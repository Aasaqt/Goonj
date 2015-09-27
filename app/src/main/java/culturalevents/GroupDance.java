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


import expandable.ExpandableListAdapter11;

/**
 * Created by aasaqt on 10/2/15.
 */
public class GroupDance extends BaseActivity {
    ExpandableListAdapter11 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.groupdance);

        expListView = (ExpandableListView) findViewById(R.id.lvExp1);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter11(this, listDataHeader, listDataChild);

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
       // listDataHeader.add("INTRODUCTION");
        listDataHeader.add("GENERAL RULES");
        listDataHeader.add("PRIZES");
        listDataHeader.add("CONTACT");



        // Adding child data
        /*List<String> intro = new ArrayList<String>();
        intro.add("A treasure hunt with a biotechnology twist.\n" +
                "\n" +
                "Put your knowledge to use!\n" +
                "\n" +
                "If you have the slightest idea of who’s who of biotech, your clues will surely lead you to your treasure.");
        */List<String> rules = new ArrayList<String>();
        rules.add("Round 1: Prelims\n" +
                "\n" +
                "  -  Every member must have a valid college id card.\n" +
                "\n" +
                "  -  Use of fire, water or any substances that may damage the stage is prohibited and each team must ensure that the stage is in the same condition as before their performance.\n" +
                "\n" +
                "  -  Prelims sequence time limit should be 3-5 mins.\n" +
                "\n" +
                "  -  This sequence should be a part of the final act.\n" +
                "\n" +
                "  -  At any time 3 members should be on the stage.\n" +
                "\n" +
                "  -  Each group shall comprise of 5 or more members.\n" +
                "\n" +
                "  -  No marks will be awarded for props or costumes.\n" +
                "\n" +
                "  -  Any violation of the rules prescribed will lead to disqualification.\n" +
                "\n" +
                "Round 2: Finals\n" +
                "\n" +
                "  -  Teams selected in prelims shall perform in the finals.\n" +
                "\n" +
                "  -  The total act should be of 8-12 mins and any violation to the prescribed time limit will lead to direct disqualification.\n" +
                "\n" +
                "  -  At any time there should be a minimum of 4 members on the stage.\n" +
                "\n" +
                "  -  Props, costumes, synchronization, choreography, expressions, innovation and overall presentation carry marks and will be the basis of judgement.\n" +
                "\n" +
                "*In case of conflicts, decision of the judge would be considered final.\n" +
                "\n" +
                "**Any obscene or inappropriate act will not be tolerated and will lead to direct disqualification.");
        List<String> prize = new ArrayList<String>();
        prize.add("\n" +
                "  -  1st – Worth Rs. 12000\n" +
                "  -  2nd – Worth Rs. 7000\n");
        List<String> contact = new ArrayList<String>();
        contact.add("Akshay Bhushan –  +91-8558875488");







        //listDataChild.put(listDataHeader.get(0), intro); // Header, Child data
        listDataChild.put(listDataHeader.get(0), rules);
        listDataChild.put(listDataHeader.get(1), prize);
        listDataChild.put(listDataHeader.get(2), contact);
        getActionBar().setTitle("Group Dance");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
