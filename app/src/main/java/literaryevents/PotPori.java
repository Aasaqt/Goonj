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


import expandable.ExpandableListAdapter23;

/**
 * Created by aasaqt on 10/2/15.
 */
public class PotPori extends BaseActivity {
    ExpandableListAdapter23 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.potpori);

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter23(this, listDataHeader, listDataChild);

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
        intro.add("It is an amalgamation of a plethora of events; literary and general; to test the participants on various parameters. ");
        List<String> rules = new ArrayList<String>();
        rules.add("Round 1: Just A Minute \n" +
                "   The JAMmers are challenged to speak for one minute on a given subject without “repetition, hesitation, or deviation“.\n" +
                "\n" +
                "   “Repetition” means the repetition of any word or phrase, although challenges based upon very common words such as “and” are generally rejected except in extreme cases. Words contained in the given subject are exempt unless repeated many times in quick succession. Skillful players use (sometimes obscure) synonyms in order to avoid repeating themselves. The term “BBC” maybe successfully challenged upon for repetition of “B”.\n" +
                "\n" +
                "\n" +
                "   “Hesitation” is watched very strictly: a momentary pause before resumption of the subject can give rise to a successful challenge, as can tripping over one’s words.\n" +
                "\n" +
                "\n" +
                "   “Deviation” means deviating from the subject, but has also been interpreted as “deviating from the English language as we know it”, “deviation from grammar as we understand it”, deviating from the truth, and sometimes even logic, although often leaps into the surreal are allowed.\n" +
                "\n" +
                "\n" +
                "   A JAMmer scores a point for making a correct challenge against whomever is speaking, while the speaker gets a point if the challenge is deemed incorrect. However, if a witty interjection amuses the audience, even though it is not a correct challenge, both the challenger and speaker may gain a point, at the moderator’s discretion. A player who makes a correct challenge takes over the subject for the remainder of the minute, or, until he or she is correctly challenged. A speaker also scores a point if they are the person speaking when the 60 seconds expires. An extra point is awarded when a speaker speaks for the entire minute without being challenged.\n" +
                "\n" +
                "\n" +
                "   The scores of members will be added and averaged. \n" +
                "\n" +
                "\n" +
                "Round 2: Word Mole\n" +
                "   It is a direct skill check of the ‘English Language’ through word games and the rules and instructions will be mentioned, then and there.\n" +
                "\n" +
                "\n" +
                "Round 3: Guess What\n" +
                "   It is a pictionary round. One member of each team will be given a word to draw. The other member(s) will have to guess the word. \n" +
                "\n" +
                "\n" +
                "Round 4: Dabangg\n" +
                "   We were there when he taught the world what the word meant and now, in its third year, Dabangg is better than ever. Come prove that you have the necessary wherewithal to be crowed the real Dabangg master of UIET.  You will be given a number of tasks which test your courage and showmanship. Complete them in the given time and submit your entries to the jury, which will select the best video.");
        List<String> prize = new ArrayList<String>();
        prize.add("1st: Worth Rs. 5,000\n" +
                "2nd:Worth Rs. 3,000");
        List<String> contact = new ArrayList<String>();
        contact.add("\n" +
                "  -  Chirag Puri – +91-7696183006\n" +
                "  -  Kushal Walia – +91-9915125697\n");







        listDataChild.put(listDataHeader.get(0), intro); // Header, Child data
        listDataChild.put(listDataHeader.get(1), rules);
        listDataChild.put(listDataHeader.get(2), prize);
        listDataChild.put(listDataHeader.get(3), contact);
        getActionBar().setTitle("Pot Pourri");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
