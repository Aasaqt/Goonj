package com.goonj.android.goonj1;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import expandable.ExpandableListAdapter;

/**
 * Created by aasaqt on 7/1/15.
 */
public class AboutUsActivity extends BaseActivity {
    public AboutUsActivity(){}

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.aboutus);
        //setContentView(R.layout.aboutus);
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

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
        listDataHeader.add("About UIET");
        listDataHeader.add("About GOONJ");


        // Adding child data
        List<String> top250 = new ArrayList<String>();
        top250.add("The University Institute of Engineering and Technology (UIET) is the engineering branch of Punjab University and is the biggest department there.UIET has prospered by leaps and bounds over the years achieving great academic heights besides foraying into the top 29 finest engineering colleges (UIET ranked at position 10 among top engineering colleges of north India) of the country.\n" +
                "UIET offers four-year Bachelor of Engineering (BE) courses and five-year integrated BE/Master of Business Administration (MBA) courses in Biotechnology, Computer Science & Engineering, Electrical & Electronics Engineering, Electronics & Communication Engineering, Information Technology and Mechanical Engineering. Master of Engineering (ME) courses are offered in the same areas except Biotechnology Engineering and Electrical & Electronics Engineering. UIET offers full-time Ph.D courses in all discipline of Engineering.\n" +
                "UIET boasts of its 100+ academic staff and 2400+ students. Every year students from throughout the nation, representing cultural, demographic, economical, political and sponsor diversity, enroll themselves in the institute. With the combined efforts of the teachers and students, UIET students stand out for their overall academic excellence.");


        List<String> nowShowing = new ArrayList<String>();
        nowShowing.add("The annual cultural techno-literary fest of the institute is held every year in the even semester around February with full zeal and fervour. The entire college comes together at this time of the year to work as a unit instrumental in the organization of a wide array of events. GOONJ marks the cornerstone for the successful work that the students of UIET perform. The atmosphere in the days leading up to, as well as during the entire fest, is un-parallel to anything that goes on during the whole year.\n" +
                "\n" +
                "This college fest marks the working together for hundreds of students and teachers together, irrespective of the committee or the branch they may be in. GOONJ has rapidly become one of the most talked about as well as the most successful college fests in the tri-city area. This upward ascent could undoubtedly be credited to the painstaking efforts put in by faculty and students alike in ensuring that the infrastructure of this event is top-notch.\n" +
                "\n" +
                "A plethora of Cultural events including dance competitions that observe participation from teams throughout the region and other dance forms, the fest hosts a very colourful extravaganza. Apart from this, music events.\n" +
                "\n" +
                "The literary events like debates, group discussions, quizzes and many other events draw huge participation. The night events are marked by star night and rock band performances. The star nights feature some of the most prominent folk and local singers and entertainers in the state of Punjab and are witnessed by an overwhelming audience.The success and popularity of such events can be measured by the fact that every year dozens of teams travel hundreds(perhaps even thousands of miles) for the sole honor of being a participant in the mighty GOONJ.\n" +
                "\n" +
                "The complete involvement of all the years of college to make the fest a success marks a spirit of teamwork and dedication towards the progress of the institute and the fest itself.\n");




        listDataChild.put(listDataHeader.get(0), top250); // Header, Child data
        listDataChild.put(listDataHeader.get(1), nowShowing);
        getActionBar().setTitle("About Us");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }


}
