/*
 * Copyright 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.goonj.android.goonj1;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

import events.FineArtsActivity;
import events.CulturalEventsActivity;
import events.LiteraryEventsActivity;
import events.StarNightsActivity;
import events.TechnicalEventsActivity;
import events.TheatreActivity;


public class MainActivity extends BaseActivity {

    private CustomGrid mAdapter;

    GridView grid;
    private ArrayList<String> text;
    private ArrayList<Integer> image;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.main);
        //setContentView(R.layout.main);
        prepareList();
        mAdapter = new CustomGrid(this,text, image);
        grid=(GridView)findViewById(R.id.gridView);
        grid.setAdapter(mAdapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                //Toast.makeText(MainActivity.this, "You Clicked at " + mAdapter.getItem(+position), Toast.LENGTH_SHORT).show();
                clickEvent(position);
            }
        });
        //getActionBar().setTitle("Home");
    }
    private void clickEvent(int position) {
        switch (position) {
            case 0:
                Intent i = new Intent(this, StarNightsActivity.class);
                startActivity(i);
                break;
            case 1:
                Intent a = new Intent(this, TechnicalEventsActivity.class);
                startActivity(a);
                break;
            case 2:
                Intent b = new Intent(this, CulturalEventsActivity.class);
                startActivity(b);
                break;
            case 3:
                Intent c = new Intent(this, FineArtsActivity.class);
                startActivity(c);
                break;
            case 4:
                Intent d = new Intent(this, LiteraryEventsActivity.class);
                startActivity(d);
                break;
            case 5:
                Intent e = new Intent(this, TheatreActivity.class);
                startActivity(e);
                break;
            /*case 5:
                Intent f = new Intent(this, FunEventsActivity.class);
                startActivity(f);
                break;
            case 6:
                Intent g = new Intent(this, SportsActivity.class);
                startActivity(g);
                break;
            case 7:
                Intent h = new Intent(this, EdmNightActivity.class);
                startActivity(h);
                break;
            */
            default:
                break;

        }
    }

    private void prepareList() {
        text = new ArrayList<String>();
        text.add("Star Night");
        text.add("Technical Events");
        text.add("Cultural Events");
        text.add("Fine Arts");
        text.add("Literary Events");
        text.add("Theatre");
        text.add("Fun Events(Coming soon)");
        text.add("Sports(Coming soon)");
        text.add("EDM Night(Coming soon)");

        image = new ArrayList<Integer>();
        image.add(R.drawable.rsz_falak);
        image.add(R.drawable.robowars);
        image.add(R.drawable.bhangra);
        image.add(R.drawable.rangeela);
        image.add(R.drawable.trivialpursuit);
        image.add(R.drawable.halla);
        image.add(R.drawable.funevents);
        image.add(R.drawable.sports);
        image.add(R.drawable.edmnight);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

}