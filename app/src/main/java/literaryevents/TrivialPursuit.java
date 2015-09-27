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


import expandable.ExpandableListAdapter25;

/**
 * Created by aasaqt on 10/2/15.
 */
public class TrivialPursuit extends BaseActivity {
    ExpandableListAdapter25 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.trivialpursuit);

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter25(this, listDataHeader, listDataChild);

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
        listDataHeader.add("SCORING");
        listDataHeader.add("INFRASTRUCTURE REQUIREMENTS");
        listDataHeader.add("VENUE");
        listDataHeader.add("PRIZES");
        listDataHeader.add("CONTACT");



        // Adding child data
        List<String> intro = new ArrayList<String>();
        intro.add("Stop twiddling your thumbs, for the wait for the most popular (and needless to say, the most awesome) quiz is over! Goonj’15 brings with itself the Trivial Pursuit in a brand new avatar! Register ASAP to try your hands at a quiz that might let you win even if you do NOT have your facts (absolutely) straight.\n" +
                "\n" +
                "As much of a gamble, as is a brain racking experience, this quiz derived from the traditional game by the same name guarantees a fun ensconced hour or two at the fest! ");
        List<String> rules = new ArrayList<String>();
        rules.add("Only one participant will be allowed. No teams to be formed. Three rounds.");
        List<String> score = new ArrayList<String>();
        score.add("Round 1: 0 points for a correct answer. Depending on the deviation from the correct integer answer, negative points shall be awarded. For eg- If the correct answer is 20, and the candidate answers 10, then he shall be awarded -10 points. If he answers 15, he shall be awarded -5 points.\n" +
                "\n" +
                "Hence, the participant with the maximum score qualifies for the next round/wins.\n" +
                "\n" +
                "First round will have 50 questions to be solved in 20 mins (attempt all)\n" +
                "\n" +
                "Top 15 scorers qualify for the next round.\n" +
                "\n" +
                "Round 2: It will be a VISUAL round having 20 questions with integer answers and the same scoring pattern as round 1.\n" +
                "\n" +
                "Top 5 scorers qualify for the next round.\n" +
                "\n" +
                "Round 3: Each candidate will be given a single (visual) question with an integer answer, but the question shall be unveiled only upon answering 9 general knowledge mcq questions (block by block).\n" +
                "\n" +
                "Hence the winner is decided\n" +
                "\n" +
                "Tie breaker: A set of 10 mcq questions.");
        List<String> infra = new ArrayList<String>();
        infra.add("-Roughly 60 copies of the question paper\n" +
                "-Sound system,\n" +
                "-projector for second round");
        List<String> venue = new ArrayList<String>();
        venue.add("Round 1, lecture room\n" +
                "Round 2, old library");
        List<String> prize = new ArrayList<String>();
        prize.add("\n" +
                "  -  1st: Worth Rs. 5,000 \n" +
                "  -  2nd: Worth Rs. 3,000 \n");
        List<String> contact = new ArrayList<String>();
        contact.add("\n" +
                "  -  Chirag Puri – +91-7696183006\n" +
                "  -  Kushal Walia – +91-9915125697\n");







        listDataChild.put(listDataHeader.get(0), intro); // Header, Child data
        listDataChild.put(listDataHeader.get(1), rules);
        listDataChild.put(listDataHeader.get(2), score);
        listDataChild.put(listDataHeader.get(3), infra);
        listDataChild.put(listDataHeader.get(4), venue);
        listDataChild.put(listDataHeader.get(5), prize);
        listDataChild.put(listDataHeader.get(6), contact);
        getActionBar().setTitle("Trivial Pursuit");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
