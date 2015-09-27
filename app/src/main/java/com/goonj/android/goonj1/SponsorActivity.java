package com.goonj.android.goonj1;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

import com.goonj.android.goonj1.R;

/**
 * Created by aasaqt on 7/1/15.
 */
public class SponsorActivity extends BaseActivity implements View.OnClickListener {
    public SponsorActivity(){}



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.sponsor);

        getActionBar().setTitle("Sponsor");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public void onClick(View view) {

    }
}
