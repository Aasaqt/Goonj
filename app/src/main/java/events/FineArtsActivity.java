package events;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.goonj.android.goonj1.BaseActivity;
import com.goonj.android.goonj1.R;

import finearts.FaceCanvas;
import finearts.Rangeela;
import finearts.Trashion;

/**
 * Created by aasaqt on 10/1/15.
 */
public class FineArtsActivity extends BaseActivity implements AdapterView.OnItemClickListener {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.fineart);
        getActionBar().setTitle("FINE ARTS");
        listView = (ListView) findViewById(R.id.listView);
        String values[] = {"Rangeela","Face Canvas","Trashion"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(this);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch(position){
            case 0:
                Intent a= new Intent(this, Rangeela.class);
                startActivity(a);
                break;
            case 1:
                Intent b= new Intent(this, FaceCanvas.class);
                startActivity(b);
                break;
            case 2:
                Intent c= new Intent(this, Trashion.class);
                startActivity(c);
                break;


        }
    }

}

