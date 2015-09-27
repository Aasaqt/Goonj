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


import expandable.ExpandableListAdapter21;

/**
 * Created by aasaqt on 10/2/15.
 */
public class BrandQuiz extends BaseActivity {
    ExpandableListAdapter21 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.brandquiz);

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter21(this, listDataHeader, listDataChild);

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
        intro.add("Brand quiz is a test of knowing the various brands, advertisements, tag-lines, logos, etc. Test your knowledge and wits at the annual brand quiz.");
        List<String> rules = new ArrayList<String>();
        rules.add("Round 1\n" +
                "\n" +
                "  -  Consists of 20-25 on screen questions.\n" +
                "  -  Each question appears for 45 seconds in the form of a single PowerPoint slide.\n" +
                "  -  Participants are required to write the answers on the blank A4 sheets (provided by the QMs), along with their names, college name and contact numbers.\n" +
                "  -  All the questions will carry the same weight age of marks. There will be no negative marking at all.\n" +
                "  -  Every 4th or 5th question will be a star marked question, which will be come into play in case of a tie. The tied teams will be separated out on the basis of more correct star marked questions.\n" +
                "  -  All the questions will be repeated, this time from last to first, such that teams can re-check and answer the questions they skipped previously.\n" +
                "  -  At the end of Round 1 (roughly 30 min), answer sheets will be collected.\n" +
                "  -  Answers to the 1st round questions will be shown to the participants there and then, as soon as all the sheets are collected.\n" +
                "  -  Result Declaration at the end of DAY1. Four teams will be shortlisted for the Final Round.\n" +
                "  -  If still a tie persists, a tie-breaker will be played between the tied teams before the beginning of the second round.\n" +
                "\n" +
                "Round 2 :\n" +
                "\n" +
                "  -  Another audio-visual round.\n" +
                "  -  There will be 5-6 categories consisting of different questions in the other sub-rounds (bound to change).\n" +
                "  -  The top 2 teams will take away the cash prizes.\n");
        List<String> prize = new ArrayList<String>();
        prize.add("1st worth Rs. 3000/- , 2nd worth Rs. 1000/-");
        List<String> contact = new ArrayList<String>();
        contact.add("Chirag Puri +917696183006");







        listDataChild.put(listDataHeader.get(0), intro); // Header, Child data
        listDataChild.put(listDataHeader.get(1), rules);
        listDataChild.put(listDataHeader.get(2), prize);
        listDataChild.put(listDataHeader.get(3), contact);
        getActionBar().setTitle("Brand Quiz");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
