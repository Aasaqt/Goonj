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


import expandable.ExpandableListAdapter15;

/**
 * Created by aasaqt on 10/2/15.
 */
public class LooseIt extends BaseActivity {
    ExpandableListAdapter15 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.looseit);

        expListView = (ExpandableListView) findViewById(R.id.lvExp2);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter15(this, listDataHeader, listDataChild);

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
        rules.add("Solo/Duet Dance Competition:\n" +
                "\n" +
                "  -  Dance styles can vary from western to classical to folk to the typical Bollywood style.\n" +
                "  -  Time limit for both solo and duet dance competitions is 5 mins.\n" +
                "  -  The participants shall bring their tracks on a pen drive.\n" +
                "  -  Solo and duet dance will be judged separately and shall have 1 winner and 1 runner-up each.\n" +
                "  -  For duet dance, any two individuals can pair up (irrespective of gender) to participate in this competition.\n" +
                "  -  Judgement will be on the basis of props, costumes, expressions, innovation and overall presentation.\n" +
                "\n" +
                "*In case of conflicts, decision of the judges would be considered final.");
        List<String> prize = new ArrayList<String>();
        prize.add("Prize for Solo\n" +
                "\n" +
                "  -  1st – Worth Rs. 2000\n" +
                "\n" +
                "  -  2nd – Worth Rs. 1000\n" +
                "Prize For Duet\n" +
                "\n" +
                "  -  1st – Worth Rs. 3000\n" +
                "\n" +
                "  -  2nd – Worth Rs. 2000");
        List<String> contact = new ArrayList<String>();
        contact.add("Akshay Bhushan –  +91-8558875488");







        //listDataChild.put(listDataHeader.get(0), intro); // Header, Child data
        listDataChild.put(listDataHeader.get(0), rules);
        listDataChild.put(listDataHeader.get(1), prize);
        listDataChild.put(listDataHeader.get(2), contact);
        getActionBar().setTitle("Loose It");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
