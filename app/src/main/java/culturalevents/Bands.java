package culturalevents;

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


import expandable.ExpandableListAdapter13;

/**
 * Created by aasaqt on 10/2/15.
 */
public class Bands extends BaseActivity {
    ExpandableListAdapter13 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.bands);

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter13(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        expListView.setOnGroupClickListener(new ExpandableListView.OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
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
        listDataHeader.add("EQUIPMENTS PROVIDED");
        listDataHeader.add("JUDGING CRITERIA");
        listDataHeader.add("PRIZES");
        listDataHeader.add("CONTACT");



        // Adding child data
        List<String> intro = new ArrayList<String>();
        intro.add("Come and feel the magic of untouched fresh music straight from the guitar and tap to the beats of drums, join in singing with the crowd. Acoustic space has the basic character of a sphere whose focus or centre is simultaneously everywhere and whose margin is nowhee. So come, widen your music space with Goonj’s string theory whicih will leave you with a musical orgasm never witnessed before. With the best bands from around the country, amazing prizes in cash and kind, METAMORPHOSIS  promises to be a spectacle this year again. So, get ready to headbang!");
        List<String> rules = new ArrayList<String>();
        rules.add("\n" +
                "  -  This is a rock band competition, open to any college or semi-professional band from India.\n" +
                "  -  Bands have to play atleast one original composition(compulsory with vocals). Bands have an option to perform more songs of their choice.\n" +
                "  -  Atleast 2 different instruments are to be played(different guitars to be counted as different instruments).\n" +
                "  -  Time limit givent to a band is 15 minutes.\n" +
                "  -  Bands will be disqualified on the spot for misconduct, obscenity or foul language.\n" +
                "  -  Bands will have to bring their own musical instruments and special effects. However, programmed music is not allowed.\n" +
                "  -  Teams will be heavily penalised for exceeding speed limits.\n" +
                "  -  Decision of judges shall be final and binding.\n" +
                "  -  The organizing committee reserves the rights to change or modify any of the rules.\n");
        List<String> equip = new ArrayList<String>();
        equip.add("\n" +
                "  -  1 bass amplifier speaker, 1 lead amplifier speaker, adequate microphones.\n");
        List<String> judge = new ArrayList<String>();
        judge.add("\n" +
                "  -  Quality of vocals, quality of music, tightness of music, synchronization, choice of song and overall performance as a band.");
        List<String> prize = new ArrayList<String>();
        prize.add("1st – Worth Rs. 20,000\n" +
                "\n");
        List<String> contact = new ArrayList<String>();
        contact.add("Akshay Bhushan –  +91-8558875488");







        listDataChild.put(listDataHeader.get(0), intro); // Header, Child data
        listDataChild.put(listDataHeader.get(1), rules);
        listDataChild.put(listDataHeader.get(2), equip);
        listDataChild.put(listDataHeader.get(3), judge);
        listDataChild.put(listDataHeader.get(4), prize);
        listDataChild.put(listDataHeader.get(5), contact);
        getActionBar().setTitle("Metamorphosis");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
