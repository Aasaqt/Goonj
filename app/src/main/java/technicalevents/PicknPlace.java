package technicalevents;

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

import expandable.ExpandableListAdapter1;

/**
 * Created by aasaqt on 10/2/15.
 */
public class PicknPlace extends BaseActivity {
    ExpandableListAdapter1 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.pickplace);

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter1(this, listDataHeader, listDataChild);

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
        listDataHeader.add("TASK");
        listDataHeader.add("ARENA");
        listDataHeader.add("SPECIFICATIONS");
        listDataHeader.add("GAMEPLAY");
        listDataHeader.add("SCORES");
        listDataHeader.add("PENALITIES");
        listDataHeader.add("REPAIRS & RESTARTS");
        listDataHeader.add("GENERAL RULES");
        listDataHeader.add("TEAM");
        listDataHeader.add("CERTIFICATIONS");
        listDataHeader.add("PRIZES");
        listDataHeader.add("CONTACT");



        // Adding child data
        List<String> intro = new ArrayList<String>();
        intro.add("In the coming few decades, it is predicted that the human civilization will rely more and more on machines and substitute humans in daily life.\n" +
                "\n" +
                "This event brings forth the intersection of man and machine, how machines swiftly finish jobs under directions of man. The ever increasing demand on construction sector has made it imperative to involve machines for building. We invites you to design bots to build the skyscraper of the future. ");

        List<String> task = new ArrayList<String>();
        task.add("Team has to perform a pick and place task by collecting the balls from one point and placing them onto the Specific points.");

        List<String> arena = new ArrayList<String>();
        arena.add("\n" +
                "  -  Arena will consist of Gravels and Oil Surfaces as Shown in the Diagram above.\n" +
                "  -  There will be platform on the top of P1 and P2 in order to place the Balls.\n" +
                "  -  There will be a box of 300mm X 200mm present on the platform/area C for collecting the balls.\n" +
                "  -  There will be Obstacles like Speed Barkers, Gravels presents on the Platform A (as shown above).\n");

        List<String> specifications = new ArrayList<String>();
        specifications.add("\n" +
                "  -  The dimensions of the bot should not exceed 300mm X 300mm X 300mm (lxbxh) at the start of the game.\n" +
                "  -  Teams can use both wired as well as wireless control mechanisms. In case of wired bots, the length of wire should be more than 3 meters so that the wire remains slack at any instant of time. If the participants use wireless mechanism then it is mandatory to use a dual frequency remote.\n" +
                "  -  Participants are not allowed to make use of any readymade Lego components or readymade gripping mechanism. Violating this clause will lead to immediate disqualification of the team.\n" +
                "  -  Only one person will be allowed to control the bot. However, it is allowed to handle the batteries separately by another person.\n" +
                "  -  The participants must use an onboard/off-board electric or non-electric power supply. However the power source must be non-polluting and must satisfy the safety constraints determined by the organizers. In case of non-electric power supply, the participants must get it approved from the organizers beforehand. Organizers are not responsible for the inconvenience if the approval is not sought.\n" +
                "  -  In case of an electric power supply, the voltage difference between any two points during any point of time should not exceed 24V.\n" +
                "  -  A Standard Power Supply of 220v AC will be available on the Spot.\n");

        List<String> gameplay = new ArrayList<String>();
        gameplay.add("\n" +
                "  -  There are total of Six Balls kept onto the platform A (Red colored area).\n" +
                "  -  First, you have to pick the ball from the platform A and place it onto the platform P1.\n" +
                "  -  After placing the ball onto P1, you have to pick another ball from platform A and place it onto platform P2.\n" +
                "  -  Now, you have to pick the remaining of the balls from the Platform A and collect them into the box (blue colored).\n" +
                "  -  Team having Maximum Score will be considered as the winner.\n" +
                "  -  You are allowed to interchange the above steps at any points (e.g. placing balls into box before placing it on P1 or P2).\n");

        List<String> scores = new ArrayList<String>();
        scores.add("\n" +
                "  -  Placing Ball onto the Platform P1 or P2 = 50 points.\n" +
                "  -  Placing Ball into Basket P3 = 30 points.\n" +
                "  -  Bonus points of 10 will be awarded to a team if, their bot reaches the platform C without making any foul.\n" +
                "  -  Team having wireless Bot will be awarded with extra 10 points over the wired bots.\n");

        List<String> penalities = new ArrayList<String>();
        penalities.add("\n" +
                "  -  If the ball leaves the Arena during the gameplay then, a penalty of -10 will be awarded.\n" +
                "  -  Dragging of ball is not allowed at any point during the gameplay. Doing so, will leads to immediate disqualification.\n" +
                "  -  Skipping of any platform P1 or P2 will leads to a penalty of -40 points. However, there is no penalties in case of platform P3.\n" +
                "  -  After picking the ball, if the bot loses its grip onto the ball (before placing it onto the required platform) then a penalty of -2 points will be given.\n" +
                "  -  Any damage done to the arena will lead to immediate disqualification.\n");
        List<String> repair = new ArrayList<String>();
        repair.add("\n" +
                "  -  Maximum of 5 minutes for repair will be given for each team.\n" +
                "  -  If the bot fails or damage at any point in the whole gameplay then the participant is allowed to take restarts from the same point. Participant is allowed to take maximum of 3 restarts.\n" +
                "  -  If the bot fails, the game timer will be paused and a separate ‘repair timer’ will start at the same time. The total time in which participant can repair his/her bot is 300 sec including all three repairs. If the repair time runs out participant will be disqualified.\n" +
                "  -  A contestant may not alter a bot in a manner that alters its weight (e.g. removal of a bulky sensor array or switching to lighter batteries to get better speed).\n" +
                "  -  All restarts will require the approval of the organizers before the bot can be removed from the arena. If the bots were handled within the arena without approval, the run will be terminated.\n");
        List<String> rules = new ArrayList<String>();
        rules.add("\n" +
                "  -  The teams must adhere to the spirit of healthy competition.\n" +
                "  -  The machine would be checked for its safety before the run and will be disqualified if found unsafe for other participants.\n" +
                "  -  The bot will be liable for disqualification if it causes any kind of damage to the arena.\n" +
                "  -  Organizers reserve the right to disqualify any team indulging in misbehavior or violating any rules.\n" +
                "  -  Any team that is not ready at the specified time will be disqualified from the competition automatically.\n" +
                "  -  The time measured by the organizers will be final and will be used for scoring the teams.\n" +
                "  -  Time measured by any contestant by any means will not be accepted for scoring.\n" +
                "  -  In case of any disputes/discrepancies, the organizers’ decision will be final and binding.\n" +
                "  -  The organizers reserve the rights to change any or all of the above rules as they deem fit. Change in rules, if any will be highlighted on the website and notified to the registered teams.\n");

        List<String> team = new ArrayList<String>();
        team.add("\n" +
                "  -  A team may consist of a maximum of 4 members. Students from different educational institutes can form a team.\n" +
                "  -  All students with a valid identity card of their respective educational institutes are eligible to participate in the event.\n");

        List<String> certification = new ArrayList<String>();
        certification.add("\n" +
                "  - Certificate of excellence will be awarded to the top 3 winners.\n" +
                "  - Certificate of participation will be given if the team scores minimum 20 points.\n");
        List<String> prize = new ArrayList<String>();
        prize.add("\n" +
                "  -  1st – Worth Rs. 7000\n" +
                "  -  2nd – Worth Rs. 3000\n");
        List<String> contact = new ArrayList<String>();
        contact.add("\n" +
                "  -  Rajat Kosh – +91-7837877087\n" +
                "  -  Puneet Sikka – +91-8146587896\n" +
                "  -  Aasaqt Agarwal – +91-8699501166\n");







        listDataChild.put(listDataHeader.get(0), intro); // Header, Child data
        listDataChild.put(listDataHeader.get(1), task);
        listDataChild.put(listDataHeader.get(2), arena);
        listDataChild.put(listDataHeader.get(3), specifications);
        listDataChild.put(listDataHeader.get(4), gameplay);
        listDataChild.put(listDataHeader.get(5), scores);
        listDataChild.put(listDataHeader.get(6), penalities);
        listDataChild.put(listDataHeader.get(7), repair);
        listDataChild.put(listDataHeader.get(8), rules);
        listDataChild.put(listDataHeader.get(9), team);
        listDataChild.put(listDataHeader.get(10), certification);
        listDataChild.put(listDataHeader.get(11), prize);
        listDataChild.put(listDataHeader.get(12), contact);
        getActionBar().setTitle("Pick 'n Place");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
