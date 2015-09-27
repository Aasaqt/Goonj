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


import expandable.ExpandableListAdapter3;

/**
 * Created by aasaqt on 10/2/15.
 */
public class RoboWarrior extends BaseActivity {
    ExpandableListAdapter3 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.robowars);

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter3(this, listDataHeader, listDataChild);

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
        listDataHeader.add("TASK");
        listDataHeader.add("ARENA");
        listDataHeader.add("SPECIFICATIONS");
        listDataHeader.add("MOBILITY");
        listDataHeader.add("ROBOT REQUIREMENTS");
        listDataHeader.add("BATTERY AND POWER");
        listDataHeader.add("PNEUMATICS");
        listDataHeader.add("HYDRAULICS");
        listDataHeader.add("WEAPON SYSTEM");
        listDataHeader.add("SAFETY RULES");
        listDataHeader.add("TEAM SPECIFICATION");
        listDataHeader.add("GAMEPLAY");
        listDataHeader.add("JUDGING CRITERIA");
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
        task.add("Design a Robot capable of fighting with another robot in one on one Knockout Round.");

        List<String> arena = new ArrayList<String>();
        arena.add("\n" +
                "  -  There will be two concentric circular area in arena as Shown above.\n" +
                "  -  Radius of Inner Circle = 75 cm.\n" +
                "  -  Radius of Outer Circle = 150 cm.\n" +
                "  -  There will be two areas (Colored in Black) as Shown Above of 75×75 cm.\n");

        List<String> specifications = new ArrayList<String>();
        specifications.add("\n" +
                "  -  The bot should fit in a box of dimension 700 mm x 700 mm x 700 mm at the beginning of the match. The machine can be extended later. At any point of time during match the machine should fit in a box of length 1000 mm.\n" +
                "  -  The external device used to control the machine or any external tank is not included in the size constraint.\n" +
                "  -  The machine should not exceed 50 kg of weight including the weight of pneumatic source/tank. All pneumatic tanks/source should be onboard. Weight of adaptors and the remote controller will not be counted.\n" +
                "  -  It’s doesn’t matter that your supply is on board or off board all the things that are mounted onto your robot will counted in 50kg weight.\n" +
                "  -  In case of a wireless robot, the weight limit is 55Kg.\n");

        List<String> mobility = new ArrayList<String>();
        mobility.add("\n" +
                "  -  All robots must have easily visible and controlled mobility in order to compete. Methods of mobility may include:\n" +
                "  -  Rolling (wheels, tracks or the whole robot) Non-wheeled robots having no rolling elements in contact with the floor and no continuous rolling or cam operated motion in contact with the floor, either directly or via a linkage.\n" +
                "  -  Motion is “continuous” if continuous operation of the drive motor(s) produces motion of the robot. Linear-actuated legs and novel non-wheeled drive systems come under this category.\n" +
                "  -  Jumping and hopping is not allowed.\n" +
                "  -  Flying (using airfoil, helium balloons, ornithopters, quad-rotors etc.) is not allowed.\n");
        List<String> requirement = new ArrayList<String>();
        requirement.add("\n" +
                "  -  The machine can be controlled through wired or wireless remote. Refer below for further details on battery and power.\n" +
                "  -  In case of wired bots, the minimum length of the wires should be 5 meters. The wires should remain slack at any instant during the fight. All the wires coming out of the machine should be stacked as a single unit. Also, the wires should be projected at least 700 mm above the ground to avoid entanglement.\n" +
                "  -  The machines using wireless remote must at least have a four frequency remote control circuit or two dual control circuits which may be interchanged before the start of the match to avoid frequency interference with other teams.\n" +
                "  -  The case of any interference in the wireless systems will not be considered for rematch or results. In case of wireless, consult us for the frequency allotments before the match.\n" +
                "  -  Remote control systems from other sources might be used. Remote control systems available in the market may also be used.\n" +
                "  -  Nonstandard or self-made remote control systems must first be approved by the organizers.\n");

        List<String> battery = new ArrayList<String>();
        battery.add("\n" +
                "  -  The machine can be powered electrically only. Use of any other prime movers such as IC engine in any form is not allowed.\n" +
                "  -  On board Batteries must be sealed, immobilized-electrolyte types (such as gel cells, lithium, NiCad, NiMH, or dry cells).\n" +
                "  -  Weight of Onboard battery will be considered in the weight of the Robot.\n" +
                "  -  The electric voltage between 2 points anywhere in the machine should not be more than 36 V DC at any point of time.\n" +
                "  -  All efforts must be made to protect battery terminals from a direct short and causing a battery fire, failure to do so will cause direct disqualification.\n" +
                "  -  Use of damaged, non-leak proof batteries may lead to disqualification.\n" +
                "  -  Special care should be taken to protect the on-board batteries.\n" +
                "  -  Change of battery will not be allowed during the match (Except in case of Low Battery).\n");
        List<String> pneumatics = new ArrayList<String>();
        pneumatics.add("\n" +
                "  -  Robot can use pressurized non-inflammable gases to actuate pneumatic devices. Maximum allowed outlet nozzle pressure is 3 – 4 bar. The storage tank and pressure regulators used by teams need to be certified and teams using pneumatics are required to produce the Safety and Security letters to the Organizers at the venue. Failing to do so will lead to direct disqualification.\n" +
                "  -  Participants must be able to indicate the used pressure with integrated or temporarily fitted pressure gauge. Also there should be provision to check the cylinder pressure on the bot.\n" +
                "  -  The maximum pressure in cylinder should not exceed the rated pressure at any point of time.\n" +
                "  -  You must have a safe way of refilling the system and determining the on board pressure.\n" +
                "  -  All pneumatic components on board must be securely mounted.\n" +
                "  -  Entire pneumatic setup should be onboard, no external input (from outside the arena) could be given to the robot for functioning of its pneumatic system.\n");
        List<String> hydraulics = new ArrayList<String>();
        hydraulics.add("\n" +
                "  -  Robot can use non-inflammable liquid to actuate hydraulic devices e.g. cylinders.\n" +
                "  -  All hydraulic components on-board a robot must be securely mounted. Special care must be taken while mounting pump, accumulator and armor to ensure that if ruptured direct fluid streams will not escape the robot.\n" +
                "  -  All hydraulic liquids are required to be non-corrosive and your device should be leak proof.\n" +
                "  -  Participant must be able to indicate the used pressure with integrated or temporarily fitted pressure gauge.\n" +
                "  -  Entire hydraulic setup should be onboard, no external input (from outside the arena) should be given to the robot for functioning of its hydraulic system.\n");
        List<String> weapon = new ArrayList<String>();
        weapon.add("\n" +
                "  -  Robots can have any kind of magnetic weapons, cutters, flippers, saws, lifting devices, spinning hammers etc. as weapons with following exceptions and limitations:\n" +
                "  -  Liquid projectiles (Must be any kind of inflammable liquid).\n" +
                "  -  Nets, tape, glue, or any other entanglement device.\n" +
                "  -  Radio jamming, tazers, tesla coils, or any other high-voltage device are not allowed.\n" +
                "  -  Spinning weapons which do not come in contact with the arena at any point of time are allowed.\n" +
                "  -  Arena should not be damaged in any case by any bot. The competition will be played on a knock-out basis. There can be some hazards in the arena (subject to change, will be notified as soon as decided).\n");
        List<String> safety = new ArrayList<String>();
        safety.add("\n" +
                "  -  Special care should be taken to protect the on-board batteries and pneumatics, robot without proper protection will not be allowed to compete.\n" +
                "  -  If you have a robot or weapon design that does not fit within the categories set forth in these rules or is in some way ambiguous or borderline, please contact the event organizers. Safe innovation is always encouraged, but surprising the organizers with your brilliant exploitation of a loophole may cause your robot to be disqualified before it even competes.\n" +
                "  -  Each event has safety inspections. It is at their sole discretion that your robot is allowed to compete. As a builder you are obligated to disclose all operating principles and potential dangers to the inspection staff.\n" +
                "  -  Proper activation and deactivation of robots is critical. Robots must only be activated in the arena, testing areas, or with expressed consent of the event coordinators.\n" +
                "  -  All weapons must have a safety cover on any sharp edges.\n" +
                "  -  All participants build and operate robots at their own risk. Combat robotics is inherently dangerous. There is no amount of regulation that can encompass all the dangers involved. Please take care to not hurt yourself or others when building, testing and competing.\n" +
                "  -  Any kind of activity (repairing, battery handling, pneumatics systems etc.) which may cause damage to the surroundings during the stay of the teams in the competition area should not be carried out without the consent of organizers. Not following this rule may result in disqualification.\n" +
                "  -  All the resources provided at the time of competition from the organizers should be strictly used only after the consent of the organizers.\n" +
                "  -  Once the robots have entered into the arena, no team members can enter into the arena at any point of time. In case if fight has to be halted in between and some changes have to be done in the arena or condition of the robot(s), it will be done by organizers only.\n");
        List<String> team = new ArrayList<String>();
        team.add("\n" +
                "  -  Any team can participate in Robo Wars. All members of the team should register for the event on the website or at the Event.\n" +
                "  -  The teams can be formed by students of the same institute or students from different institutes. A team may consist of a maximum of 6 participants.\n" +
                "  -  Every team must have a name which must be unique. A team must have a leader who represents the team at any point of the competition. Leader will be the single point of contact for any type of conversation and clarification.\n" +
                "  -  Each team should have only one bot. Teams with multiple bots will be divided into separate teams with single bot.\n");
        List<String> gameplay = new ArrayList<String>();
        gameplay.add("\n" +
                "  -  Each match is of 5-7 minutes. Teams has to defeat their opponent in the given interval.\n" +
                "  -  Each team has to place its robot into the area A or B before the commencement of the match.\n" +
                "  -  If a bot attacks another bot inside the inner circle then, an extra bonus point will be awarded to the attacking team. However, attacking robot should be completely inside the inner circle during the attack.\n");
        List<String> judging = new ArrayList<String>();
        judging.add("\n" +
                "  -  A robot is declared victorious if its opponent is immobilized.\n" +
                "  -  A robot will be declared immobile if it cannot display linear motion of at least one inch in a timed period of 30 seconds. A bot with one side of its drive train disabled will not be counted out if it can demonstrate some degree of controlled movement. This rule will also apply to any robot that becomes trapped by any part of the arena or arena hazards, including the pit.\n" +
                "  -  In case both the robots remain mobile after the end of the round then the winner will be decided subjectively.\n" +
                "  -  A robot that is deemed unsafe by the judges after the match has begun will be disqualified and therefore declared the loser. The match will be immediately halted and the opponent will be awarded a win.\n" +
                "  -  If a robot is thrown out of the arena (more than 3 times) the match will stop immediately, and the robot still inside the arena will automatically be declared as the winner.\n" +
                "  -  Robots cannot win by pinning or lifting their opponents. Organizers will allow pinning or lifting for a maximum of 30 seconds per pin/lift then the robots will be instructed to release. If, after being instructed to do so, the attacker is able to release but, the opponent will not be able to mobilize its robot then, the attacker will be considered as winner.\n" +
                "  -  If two or more robots become entangled or a crushing or gripping weapon is employed and becomes trapped within another robot, then the competitors should make the timekeeper aware, the fight should be stopped and the robots separated by the safest means.\n" +
                "  -  Points will be given on the basis of aggression, control and damage.\n" +
                "  -  Aggression – Aggression is judged by the frequency, severity, boldness and effectiveness of attacks deliberately initiated by the robot against its opponent. If a robot appears to have accidentally attacked an opponent, that act will not be considered aggression.\n" +
                "  -  Control – Control means a robot is able to attack an opponent at its weakest point, use its weapons in the most effective way, avoid Arena Hazards, and minimize the damage caused by the opponent or its weapons.\n" +
                "  -  Damage – Through deliberate action, a robot either directly, or indirectly using the Arena Hazards, reduces the functionality, effectiveness or defensibility of an opponent. Damage is not considered relevant if a robot inadvertently harms itself. Also, if a pressure vessel or a rapidly spinning device on a robot fragments, any damage to the opponent will not be considered “deliberate”.\n");
        List<String> certification = new ArrayList<String>();
        certification.add("\n" +
                "  -  Certificate of excellence will be awarded to the top 2 winners.\n" +
                "  -  Certificate of participation will be given to the top 10 participating teams (Excluding Winners).\n" +
                "  -  **PROBLEM STATEMENT IS SUBJECT TO CHANGE. PARTICIPANTS WILL BE INTIMATED OF ANY CHANGES IMMEDIATELY THROUGH WEBSITE OR OTHER MEANS**.\n");
        List<String> prize = new ArrayList<String>();
        prize.add("First Prize:  Worth Rs. 20,000/-\n" +
                "\n" +
                "Second Prize: Worth Rs5,000/-");
        List<String> contact = new ArrayList<String>();
        contact.add("\n" +
                "  -  Rajat Kosh – +91-7837877087\n" +
                "  -  Puneet Sikka – +91-8146587896\n" +
                "  -  Aasaqt Agarwal – +91-8699501166\n");







        //listDataChild.put(listDataHeader.get(0), intro); // Header, Child data
        listDataChild.put(listDataHeader.get(0), task);
        listDataChild.put(listDataHeader.get(1), arena);
        listDataChild.put(listDataHeader.get(2), specifications);
        listDataChild.put(listDataHeader.get(3), mobility);
        listDataChild.put(listDataHeader.get(4), requirement);
        listDataChild.put(listDataHeader.get(5), battery);
        listDataChild.put(listDataHeader.get(6), pneumatics);
        listDataChild.put(listDataHeader.get(7), hydraulics);
        listDataChild.put(listDataHeader.get(8), weapon);
        listDataChild.put(listDataHeader.get(9), safety);
        listDataChild.put(listDataHeader.get(10), team);
        listDataChild.put(listDataHeader.get(11), gameplay);
        listDataChild.put(listDataHeader.get(12), judging);
        listDataChild.put(listDataHeader.get(13), certification);
        listDataChild.put(listDataHeader.get(14), prize);
        listDataChild.put(listDataHeader.get(15), contact);
        getActionBar().setTitle("Robo Warrior");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
