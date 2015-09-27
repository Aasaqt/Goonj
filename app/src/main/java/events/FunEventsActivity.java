package events;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

import com.goonj.android.goonj1.BaseActivity;
import com.goonj.android.goonj1.R;

/**
 * Created by aasaqt on 10/1/15.
 */
public class FunEventsActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.funevent);
        getActionBar().setTitle("FUN EVENTS");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
