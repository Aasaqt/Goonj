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


import expandable.ExpandableListAdapter17;

/**
 * Created by aasaqt on 10/2/15.
 */
public class Rangeela extends BaseActivity {
    ExpandableListAdapter17 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.rangeela);

        expListView = (ExpandableListView) findViewById(R.id.lvExp4);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter17(this, listDataHeader, listDataChild);

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
        intro.add("For all the amateur Picassos and Da Vincis, sitting at their homes with brush in hand, all the sponsor enthusiasts ,all the current affairs hogs, Goonj presents the all new poster making competition. Be a Rangeela. Take up the brush and unleash your creativity as you let your imagination run unbridled on the canvas of your dreams. We will have a plethora of interesting themes too!");
        List<String> rules = new ArrayList<String>();
        rules.add("\n" +
                "  -  This is an individual event.\n" +
                "  -  Participants have to make a painting based on a theme given to them on the spot.\n" +
                "  -  All logistics and materials shall be provided on the spot.\n" +
                "  -  Time limit for the event is 2 hours.\n" +
                "  -  Decision of judges shall be final and binding.\n" +
                "  -  The organizing team reserves the right to change or modify any of the rules.\n");
        List<String> materials = new ArrayList<String>();
        materials.add("A3 size sheets, sketch pens, poster colours, brushes, pencils, erasers.");
        List<String> judge = new ArrayList<String>();
        judge.add("Judging shall be based on the depiction of emotion and aesthetic appeal of the painting.");
        List<String> prize = new ArrayList<String>();
        prize.add("1st Worth Rs 2000/-\n" +
                "\n" +
                "2nd Worth Rs 1000/-");
        List<String> contact = new ArrayList<String>();
        contact.add("Karanveer Singh Kohli – +91-9779999968");







        listDataChild.put(listDataHeader.get(0), intro); // Header, Child data
        listDataChild.put(listDataHeader.get(1), rules);
        listDataChild.put(listDataHeader.get(2), materials);
        listDataChild.put(listDataHeader.get(3), judge);
        listDataChild.put(listDataHeader.get(4), prize);
        listDataChild.put(listDataHeader.get(5), contact);
        getActionBar().setTitle("Rangeela");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
