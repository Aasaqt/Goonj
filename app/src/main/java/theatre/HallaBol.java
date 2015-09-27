package theatre;

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


import expandable.ExpandableListAdapter29;

/**
 * Created by aasaqt on 10/2/15.
 */
public class HallaBol extends BaseActivity {
    ExpandableListAdapter29 listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.hallabol);

        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter29(this, listDataHeader, listDataChild);

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
        intro.add("Galio me tamasha, liye badlaav ki bhasha,\n" +
                "Aa, aaj yaha tu aankhein de sabki khol,\n" +
                "Dhol nagade baja, kar de goonj me hallabol.\n" +
                "\n" +
                "Street play or Nukkad Naatak as it is known traditionally is the rawest form of theatre and has been used to spread sponsor and political messages to create awareness amongst the masses since ages. It is still the simplest yet the most efficient way to break\n" +
                "formal barriers and approach the people directly.\n" +
                "So, we invite you to once again bring the magic to the streets, grip the crowd with your antics and fill the masses with vigour!");
        List<String> rules = new ArrayList<String>();
        rules.add("1. Slots will be provided prior to the event.\n" +
                "2. The duration of the play should not exceed 20 minutes.\n" +
                "3. The number of participants per team should not exceed maximum of 20 members. (Including musicians).\n" +
                "5. Use of any specific costume is prohibited. Also, only minimal uniform makeup is allowed.\n" +
                "6. Use of any Prop other than chunni and lathi is strictly not allowed.\n" +
                "7. Use of gulaal or any color is allowed.\n" +
                "8. A maximum of 2 musical instruments are allowed.\n" +
                "9. No electronic music is allowed.\n" +
                "10. The musician has to be a part of the circle and no music shall be played outside the circle.\n" +
                "11. The judges can award negative points and even disqualify the entry if they find any act objectionable.");
        List<String> prize = new ArrayList<String>();
        prize.add("1st Prize worth Rs. 15,000/-\n" +
                "\n" +
                "2nd Prize worth Rs 5,000/-");
        List<String> contact = new ArrayList<String>();
        contact.add("Mohit Khanna –  +91-8054227016");







        listDataChild.put(listDataHeader.get(0), intro); // Header, Child data
        listDataChild.put(listDataHeader.get(1), rules);
        listDataChild.put(listDataHeader.get(2), prize);
        listDataChild.put(listDataHeader.get(3), contact);
        getActionBar().setTitle("Halla Bol");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}
