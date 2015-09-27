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


import expandable.ExpandableListAdapter27;

/**
 * Created by aasaqt on 10/2/15.
 */
public class Debate extends BaseActivity {
    ExpandableListAdapter27 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.debate);

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter27(this, listDataHeader, listDataChild);

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
        intro.add("Magboard brings to you ‘Speak Out: The Debate’, a platform to step up and speak your mind on the topics that truly matter in this day and age, in our country and the world. It shall comprise of two rounds:");
        List<String> rules = new ArrayList<String>();
        rules.add("DAY-1 (Round 1) PRELIMS: GROUP DISCUSSION\n" +
                "\n" +
                "• The teams will be sorted out randomly in groups.\n" +
                "• The number of groups in each GD will be based on the number of participating teams\n" +
                "• Each GD will allow each participant of each team to convey his/her idea in the beginning. Time given to each participant will be 2 minutes.\n" +
                "• Thereafter a GD will take place for about 8 minutes.\n" +
                "• At the end, each time will have to conclude the GD.\n" +
                "• The jury selects on the basis of:-\n" +
                "-Speech structure\n" +
                "-Content, logic, understandability of the speech\n" +
                "• 12 participants are selected after the prelims.\n" +
                "\n" +
                "DAY-2 (Round 2) FINALS: DEBATE\n" +
                "• The topic will be given a day before.\n" +
                "• Rebuttal by judge&students/co-participants.\n" +
                "• Speaking Time=3-5 mins\n" +
                "• The jury selects on the basis of:-\n" +
                "-Speech structure\n" +
                "-Content, logic, understandability of the speech\n" +
                "• Speech can be either for or against the motion.");
        List<String> prize = new ArrayList<String>();
        prize.add("\n" +
                "  -  1st – Worth Rs. 10,000\n" +
                "  -  2nd – Worth Rs. 5,000\n");
        List<String> contact = new ArrayList<String>();
        contact.add("\n" +
                "  -  Chirag Puri – +91-7696183006\n" +
                "  -  Kushal Walia – +91-9915125697\n");







        listDataChild.put(listDataHeader.get(0), intro); // Header, Child data
        listDataChild.put(listDataHeader.get(1), rules);
        listDataChild.put(listDataHeader.get(2), prize);
        listDataChild.put(listDataHeader.get(3), contact);
        getActionBar().setTitle("Debate");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
