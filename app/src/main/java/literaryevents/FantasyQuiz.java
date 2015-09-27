package literaryevents;

/**
 * Created by aasaqt on 13/2/15.
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


import expandable.ExpandableListAdapter24;

/**
 * Created by aasaqt on 10/2/15.
 */
public class FantasyQuiz extends BaseActivity {
    ExpandableListAdapter24 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.fantasyquiz);

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter24(this, listDataHeader, listDataChild);

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
        listDataHeader.add("BOOKS COVERED");
        listDataHeader.add("VENUE");
        listDataHeader.add("REQUIREMENTS");
        listDataHeader.add("PRIZES");
        listDataHeader.add("CONTACT");



        // Adding child data
        List<String> intro = new ArrayList<String>();
        intro.add("The Highly entertaining and mightily intriguing Fantasy series Quiz (T.H.E.A.M.I.F.S.Q) :-\n" +
                "\n" +
                "   Have you read Harry Potter? You know that LOTR is not just a random assembling of capitalized letters? Know the difference between Eragon and Aragon? Do you think that Katniss Everdeen is more badass than Bella Swan? Then  T.H.E.A.M.I.F.S.Q is definitely for you.  Come participate in the most fun quiz you shall ever not cosplay in! ");
        List<String> rules = new ArrayList<String>();
        rules.add("1.  Participants shall Be given questions of varying difficulty , from a variety of common fictional series ( Harry potter, Lord of the rings, etc)\n" +
                "\n" +
                "2. Depending upon participation the participant may be able to choose a specific series.\n" +
                "\n" +
                "3. Difficulty of questions varies from simple to fan-boy levels , tie breaker questions are already incorporated.\n" +
                "\n" +
                "4. In case of multiple winners for the same potion , The choice of winner lies with the organizer.");
        List<String> books = new ArrayList<String>();
        books.add("LOTR, HP, Inheritance Cycle, Twilight, Hunger Games.\n" +
                "\n" +
                "Goodies for finalists\n" +
                "\n" +
                "\n");
        List<String> venue = new ArrayList<String>();
        venue.add(" A lecture hall");
        List<String> requirement = new ArrayList<String>();
        requirement.add("Photocopies of question paper. Stationery");

        List<String> prize = new ArrayList<String>();
        prize.add("1st: Worth Rs. 4,000 \n" +
                "2nd: Worth Rs. 2,000");
        List<String> contact = new ArrayList<String>();
        contact.add("\n" +
                "  -  Chirag Puri – +91-7696183006\n" +
                "  -  Kushal Walia – +91-9915125697\n");







        listDataChild.put(listDataHeader.get(0), intro); // Header, Child data
        listDataChild.put(listDataHeader.get(1), rules);
        listDataChild.put(listDataHeader.get(2), books);
        listDataChild.put(listDataHeader.get(3), venue);
        listDataChild.put(listDataHeader.get(4), requirement);
        listDataChild.put(listDataHeader.get(5), prize);
        listDataChild.put(listDataHeader.get(6), contact);
        getActionBar().setTitle("Fantasy Quiz");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
