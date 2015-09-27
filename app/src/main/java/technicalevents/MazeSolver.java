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


import expandable.ExpandableListAdapter4;

/**
 * Created by aasaqt on 10/2/15.
 */
public class MazeSolver extends BaseActivity {
    ExpandableListAdapter4 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.mazesolver);

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter4(this, listDataHeader, listDataChild);

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
        task.add("Design a Line Follower Robot Capable of Solving the Grid Maze with minimum time.");

        List<String> arena = new ArrayList<String>();
        arena.add("\n" +
                "  -  The area consists of grid which is 180cm x 180cm (5×5 white lines).\n" +
                "  -  All the white lines are of 30mm width.\n" +
                "  -  The floor panels are black in color and are made up of Black sheets.\n" +
                "  -  There will be 3-4 black spots present on various intersections which the bot has to avoid.\n" +
                "  -  There will be an inclination of 10 Degrees up to 30cm.\n" +
                "  -  The position of the box and the black spots on the grid intersections shown in the image are just an example. During the event, the position can be changed.\n" +
                "  -  Starting Zone will completely be a white zone (as Shown in Arena).\n");

        List<String> specifications = new ArrayList<String>();
        specifications.add("\n" +
                "  -  The maximum size of a robot is 30 x 30 cm, the maximum weight is 3 kg. Dimensional and weight limits for robots shall be strictly enforced. Robots must have passed inspection prior to competing.\n" +
                "  -  Robot should be completely autonomous and must not require any Human Intervention in between the gameplay.\n" +
                "  -  The machine can be powered electrically only. Use of an IC engine in any form is not allowed.\n" +
                "  -  Each team must prepare its own power sources.\n" +
                "  -  In case, the participants need to charge the batteries prior to their turn, a 220V power supply will be provided.\n" +
                "  -  All connections should be made safe to prevent short circuits and battery fires. Any unsafe circuitry may be asked to be replaced; failure to do so will result in disqualification.\n" +
                "  -  Use of damaged, non-leak proof batteries may lead to disqualification.\n" +
                "  -  Change of battery will not be allowed during the match.\n");

        List<String> gameplay = new ArrayList<String>();
        gameplay.add("\n" +
                "  -  Every machine must start from its starting zone at the start of a match.\n" +
                "  -  Use of any wireless controlling device/laptops/mobiles/tablets/transmitters etc. is strictly prohibited.\n" +
                "  -  In case a team is found using unfair means they will be subject to immediate disqualification.\n" +
                "  -  Each bot will be provided a dry run for the grid to detect the black spots prior to their turn.\n" +
                "  -  The robot will navigate its way through the grid.\n" +
                "  -  The whole path will be followed by the robot through the white line detection.\n" +
                "  -  After the GRID zone, the bot will enter the next zone, i.e. Ramp. The bot will need to cross the ramp inclination (of 10 Degrees) and reach on the top of it.\n" +
                "  -  The Bot should stop Itself on reaching the top of the ramp as the white line ends.\n" +
                "  -  No team is allowed to touch the robots in between a match, however if the bot is unable to move and needs a push and if the authorities agree, then the participant is allowed to push the bot after which each robot must start again from its respective starting zone. Please note that the timer and points counter shall NOT be reset.\n" +
                "  -  There is a maximum of 2 tries for each robots. However, all 2 tries must not exceed 10 minutes. The fastest run of the 2 will count.\n");
        List<String> scores = new ArrayList<String>();
        scores.add("\n" +
                "  -  Crossing Grid = 200 pts.\n" +
                "  -  Crossing Ramp = 50 pts.\n" +
                "  -  Stopping itself on top = 30 pts.\n" +
                "  -  Bonus Point (on No Mistakes) = 40 pts.\n");

        List<String> penalities = new ArrayList<String>();
        penalities.add("\n" +
                "  -  Deviation from the White line (Path) = RESTART.\n" +
                "  -  Crossing 1 Black Spot = -20 pts.\n" +
                "  -  Crossing more than one Black Spot = RESTART – 20pts.\n" +
                "  -  Tumbles during inclination = RESTART – 10pts.\n" +
                "  -  Keep in Motion (On Reaching Top End) = – 10pts.\n");
        List<String> note = new ArrayList<String>();
        note.add("Restarts will be made depending upon the, checkpoint achieved or any other current situation (will be disclosed during event).");
        List<String> judgement = new ArrayList<String>();
        judgement.add("\n" +
                "  -  A bot who reaches the Finish line and having a maximum Points will be the winner.\n" +
                "  -  For calculating points based on time lapsed, a threshold value will be set and revealed on the day of the event. The points awarded will be governed by the relation :-\n");
        List<String> points = new ArrayList<String>();
        points.add("\n" +
                "  -  TPoints = (T Threshold – T Taken)*10.\n" +
                "\n" +
                "  -  Total Points = TPoints + Scores + Penalties.\n" +
                "\n" +
                "  -  NOTE – The bot should be completely autonomous and the logic for the bot can’t be changed after the event has begun. There must be no changes in software programming once the event gets start. If any team will be found doing so, the particular team will be disqualified immediately.");
        List<String> team = new ArrayList<String>();
        team.add("\n" +
                "  -  Each team can have maximum 4 members.\n" +
                "  -  Any team that is not ready at the specified time will be scratched from the competition automatically.\n" +
                "  -  Judges’ and coordinators’ decision shall be treated as final and binding on all.\n" +
                "  -  The coordinators reserve the right to change any or all of the above mentioned rules as they deemed fit. Change in rules, if any, will be highlighted on the website and notified to the registered participants.\n");
        List<String> certification = new ArrayList<String>();
        certification.add("\n" +
                "  -  Certificate of excellence will be awarded to the top 3 winners.\n" +
                "  -  Certificate of participation will be given if the team scores minimum 30 points.\n");
        List<String> prize = new ArrayList<String>();
        prize.add("\n" +
                "  -  1st – Worth Rs. 7000\n" +
                "  -  2nd – Worth Rs. 3000\n");
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
        getActionBar().setTitle("Maze Solver");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
