package technicalevents;

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


import expandable.ExpandableListAdapter2;

/**
 * Created by aasaqt on 10/2/15.
 */
public class Submerge extends BaseActivity {
    ExpandableListAdapter2 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.submerge);

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter2(this, listDataHeader, listDataChild);

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
        //listDataHeader.add("INTRODUCTION");
        listDataHeader.add("TASK");
        listDataHeader.add("ARENA");
        listDataHeader.add("SPECIFICATIONS");
        listDataHeader.add("GAMEPLAY");
        listDataHeader.add("SCORES");
        listDataHeader.add("PENALITIES");
        listDataHeader.add("*NOTE");
        listDataHeader.add("JUDGEMENT");
        listDataHeader.add("T POINTS");
        listDataHeader.add("TEAM");
        listDataHeader.add("CERTIFICATIONS");
        listDataHeader.add("PRIZES");
        listDataHeader.add("CONTACT");



        // Adding child data
        /*List<String> intro = new ArrayList<String>();
        intro.add("In the coming few decades, it is predicted that the human civilization will rely more and more on machines and substitute humans in daily life.\n" +
                "\n" +
                "This event brings forth the intersection of man and machine, how machines swiftly finish jobs under directions of man. The ever increasing demand on construction sector has made it imperative to involve machines for building. We invites you to design bots to build the skyscraper of the future. ");
        */
        List<String> task = new ArrayList<String>();
        task.add("To design an underwater machine capable of performing the specific tasks.");

        List<String> arena = new ArrayList<String>();
        arena.add("Arena will be disclosed soon.");

        List<String> specifications = new ArrayList<String>();
        specifications.add("\n" +
                "  -  The maximum size of a robot should be 30x30x30cms (lxbxh) and minimum dimensions must be 15×15 cm (lxb) however, there is no minimum restriction on the height of the robot.\n" +
                "  -  The machine can be powered electrically only. Use of an IC engine, or any other pressurized system in any form is not allowed. However, you can make use of water pumps (running at 12v only).\n" +
                "  -  The potential difference between any two points on bot must not exceed 12 Volts.\n" +
                "  -  Wireless remote controlled systems will have extra points.\n" +
                "  -  In case, the participants need to charge the batteries prior to their turn, a 220V power supply will be provided.\n" +
                "  -  There should be some means of picking the magnetic buttons (present on the bottom of arena).\n" +
                "  -  Weight of each button will be less than 100g and, there will be approximately 4 – 6 buttons present at the bottom of the arena.\n" +
                "  -  All connections should be made safe to prevent short circuits and battery fires. Any unsafe circuitry may be asked to be replaced; failure to do so will result in disqualification.\n" +
                "  -  Use of damaged, non-leak proof batteries may lead to disqualification.\n");

        List<String> gameplay = new ArrayList<String>();
        gameplay.add("\n" +
                "  -  Every machine must start from its starting zone at the start of a match.\n" +
                "  -  There will be a total of 2 rounds\n" +
                "  -  First Round comprises of a simple run in which, robot has traverse the whole arena in both floating mode and immersed mode. (FYI, this will be an elimination round)\n" +
                "  -  Second round is a picking round. In this round, shortlisted robots has to pick the small magnet buttons present at the bottom of the arena.\n" +
                "  -  In case a team is found using unfair means they will be subject to immediate disqualification.\n" +
                "  -  There will be some surprises present in the gameplay, which will be disclosed during the event.\n" +
                "  -  No team is allowed to touch the robots in between a match, however if the bot is unable to move and needs a push and if the authorities agree, then the participant is allowed to push the bot after which each robot must start again from its respective starting zone. Please note that the timer and points counter shall NOT be reset.\n" +
                "  -  There is a maximum of 2 tries for each robots in each rounds. However, all 2 tries must not exceed 5 minutes (in 1st round) and 7minutes (in 2nd round). The fastest run of the 2 will count.\n");
        List<String> scores = new ArrayList<String>();
        scores.add("\n" +
                "  -  Traversing Arena (While Floating) = 10 pts.\n" +
                "  -  Traversing Arena (While Immersed) = 10 pts.\n" +
                "  -  Picking a magnetic button = 10 pts.\n" +
                "  -  Crossing a Checkpoint = 20 pts.\n" +
                "  -  Bonus Point (on No Mistakes) = 10 pts.\n");

        List<String> penalities = new ArrayList<String>();
        penalities.add("\n" +
                "  -  Touching Boundary = -2 pts.\n" +
                "  -  Touching bottom of arena (except while picking magnets) = -2 pts.\n" +
                "  -  Touching walls = -2 pts.\n" +
                "  -  Manual touch = -1pts.\n");
        List<String> note = new ArrayList<String>();
        note.add("Restarts will be made depending upon the, checkpoint achieved or any other current situation (will be disclosed during event).");
        List<String> judgement = new ArrayList<String>();
        judgement.add("\n" +
                "  -  Maximum of 5 minutes for repair will be given for each team.\n" +
                "  -  If the bot fails or damage at any point in the whole gameplay then the participant is allowed to take restarts from the same point. Participant is allowed to take maximum of 3 restarts.\n" +
                "  -  If the bot fails, the game timer will be paused and a separate ‘repair timer’ will start at the same time. The total time in which participant can repair his/her bot is 300 sec including all three repairs. If the repair time runs out participant will be disqualified.\n" +
                "  -  A contestant may not alter a bot in a manner that alters its weight (e.g. removal of a bulky sensor array or switching to lighter batteries to get better speed).\n" +
                "  -  All restarts will require the approval of the organizers before the bot can be removed from the arena. If the bots were handled within the arena without approval, the run will be terminated.\n");
        List<String> points = new ArrayList<String>();
        points.add("TPoints = (T Threshold – T Taken)*10.\n" +
                "\n" +
                "Total Points = TPoints + Scores + Penalties.");
        List<String> team = new ArrayList<String>();
        team.add("\n" +
                "  -  Each team can have maximum 4 members.\n" +
                "  -  Any team that is not ready at the specified time will be scratched from the competition automatically.\n" +
                "  -  Judges’ and coordinators’ decision shall be treated as final and binding on all.\n" +
                "  -  The coordinators reserve the right to change any or all of the above mentioned rules as they deemed fit. Change in rules, if any, will be highlighted on the website and notified to the registered participants.\n");
        List<String> certification = new ArrayList<String>();
        certification.add("\n" +
                "  -  Certificate of excellence will be awarded to the top 2 winners.\n" +
                "  -  Certificate of participation will be given if the team scores minimum 20 points.\n");
        List<String> prize = new ArrayList<String>();
        prize.add("\n" +
                "  -  1st – Worth Rs. 5000\n" +
                "  -  2nd – Worth Rs. 2000\n");
        List<String> contact = new ArrayList<String>();
        contact.add("\n" +
                "  -  Rajat Kosh – +91-7837877087\n" +
                "  -  Puneet Sikka – +91-8146587896\n" +
                "  -  Aasaqt Agarwal – +91-8699501166\n");







        //listDataChild.put(listDataHeader.get(0), intro); // Header, Child data
        listDataChild.put(listDataHeader.get(0), task);
        listDataChild.put(listDataHeader.get(1), arena);
        listDataChild.put(listDataHeader.get(2), specifications);
        listDataChild.put(listDataHeader.get(3), gameplay);
        listDataChild.put(listDataHeader.get(4), scores);
        listDataChild.put(listDataHeader.get(5), penalities);
        listDataChild.put(listDataHeader.get(6), note);
        listDataChild.put(listDataHeader.get(7), judgement);
        listDataChild.put(listDataHeader.get(8), points);
        listDataChild.put(listDataHeader.get(9), team);
        listDataChild.put(listDataHeader.get(10), certification);
        listDataChild.put(listDataHeader.get(11), prize);
        listDataChild.put(listDataHeader.get(12), contact);
        getActionBar().setTitle("Submerged");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
