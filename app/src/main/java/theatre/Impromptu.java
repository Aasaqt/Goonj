package theatre;

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


import expandable.ExpandableListAdapter30;

/**
 * Created by aasaqt on 10/2/15.
 */
public class Impromptu extends BaseActivity {
    ExpandableListAdapter30 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.impromptu);

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter30(this, listDataHeader, listDataChild);

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
        intro.add("Act fast to react,\n" +
                "react such as to act,\n" +
                "late lateefs here fail,\n" +
                "& that’s a valid fact.\n" +
                "\n" +
                "Impromptu is the event where we would test your spontaneous theatre skills. Only those who are quick with their minds, swift in their enacting apt in their approach would prevail. In this event, each team shall be given topic on the spot and they’ll have to present a short skit on the same. Hence, all those who are confident about their calibre and find thrill in outrunning others are gladly welcome.");
        List<String> rules = new ArrayList<String>();
        rules.add("1. Number of participants per team should not exceed 6.\n" +
                "2. The time limit is of 12 minutes (empty stage to empty stage).\n" +
                "3. Any number of teams per college can participate but any participating individual can’t participate twice.\n" +
                "4. Topics will be distributed 3 hours prior to the event. It is the responsibility of the team to collect the topic from the event coordinators.\n" +
                "5. Use of fire and water on stage is prohibited.\n" +
                "6. Any basic required prop will be provided if available but the need has to be brought into the notice of the event coordinators at least 90 minutes prior to the event.\n" +
                "7. Only Live music is allowed.\n" +
                "8. The judges can award negative points and even disqualify the entry if they find any act objectionable.");
        List<String> prize = new ArrayList<String>();
        prize.add("Prize Worth Rs. 10,000/-");
        List<String> contact = new ArrayList<String>();
        contact.add("Mohit Khanna –  +91-8054227016");







        listDataChild.put(listDataHeader.get(0), intro); // Header, Child data
        listDataChild.put(listDataHeader.get(1), rules);
        listDataChild.put(listDataHeader.get(2), prize);
        listDataChild.put(listDataHeader.get(3), contact);
        getActionBar().setTitle("Impromptu");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
