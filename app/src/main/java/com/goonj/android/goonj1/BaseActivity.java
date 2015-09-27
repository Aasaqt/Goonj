package com.goonj.android.goonj1;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by aasaqt on 9/1/15.
 */
public class BaseActivity extends Activity {
    public DrawerLayout mDrawerLayout;
    public ListView mDrawerList;
    public ActionBarDrawerToggle mDrawerToggle;

    public CharSequence mDrawerTitle;
    public CharSequence mTitle;
    public String[] mItemTitles;
    public TypedArray navMenuIcons;

    public ArrayList<NavDrawerItem> navDrawerItems;
    public NavDrawerListAdapter adapter;



    protected void onCreate(Bundle savedInstanceState,int resLayoutID) {
        super.onCreate(savedInstanceState);
        setContentView(resLayoutID);
        mTitle = mDrawerTitle = getTitle();
        mItemTitles = getResources().getStringArray(R.array.items);
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerList = (ListView) findViewById(R.id.left_drawer);
        navMenuIcons = getResources().obtainTypedArray(R.array.nav_drawer_icons);
        navDrawerItems = new ArrayList<NavDrawerItem>();

        navDrawerItems.add(new NavDrawerItem(mItemTitles[0], navMenuIcons.getResourceId(0, -1)));
        navDrawerItems.add(new NavDrawerItem(mItemTitles[1], navMenuIcons.getResourceId(1, -1)));
        navDrawerItems.add(new NavDrawerItem(mItemTitles[2], navMenuIcons.getResourceId(2, -1)));
        //navDrawerItems.add(new NavDrawerItem(mItemTitles[3], navMenuIcons.getResourceId(3, -1)));
        navDrawerItems.add(new NavDrawerItem(mItemTitles[3], navMenuIcons.getResourceId(3, -1)));
        navDrawerItems.add(new NavDrawerItem(mItemTitles[4], navMenuIcons.getResourceId(4, -1)));
        navMenuIcons.recycle();


        mDrawerLayout.setDrawerShadow(R.drawable.drawer_shadow, GravityCompat.START);
        // set up the drawer's list view with items and click listener
        adapter = new NavDrawerListAdapter(getApplicationContext(),
                navDrawerItems);
        mDrawerList.setAdapter(adapter);
        mDrawerList.setOnItemClickListener(new DrawerItemClickListener());


        getActionBar().setDisplayHomeAsUpEnabled(true);
        getActionBar().setHomeButtonEnabled(true);


        mDrawerToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.drawable.ic_drawer,
                R.string.drawer_open, R.string.drawer_close) {
            public void onDrawerClosed(View view) {
                getActionBar().setTitle(mTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }

            public void onDrawerOpened(View drawerView) {
                getActionBar().setTitle(mDrawerTitle);
                invalidateOptionsMenu(); // creates call to onPrepareOptionsMenu()
            }
        };
        mDrawerLayout.setDrawerListener(mDrawerToggle);

        /*if (savedInstanceState == null) {
            selectItem(0);
        }*/
    }

    /* Called whenever we call invalidateOptionsMenu() */
    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        // If the nav drawer is open, hide action items related to the content view
        boolean drawerOpen = mDrawerLayout.isDrawerOpen(mDrawerList);
        menu.findItem(R.id.action_websearch).setVisible(!drawerOpen);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // The action bar main/up action should open or close the drawer.
        // ActionBarDrawerToggle will take care of this.
        if (mDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        // Handle action buttons
        switch(item.getItemId()) {
            case R.id.action_websearch:
                // create intent to perform web search for this planet
                Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
                String s = "www.goonjuiet.com";
                intent.putExtra(SearchManager.QUERY, s);
                // catch event that there's no activity to handle intent
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                } else {
                    Toast.makeText(this, R.string.app_not_available, Toast.LENGTH_LONG).show();
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }




    /* The click listner for ListView in the navigation drawer */
    private class DrawerItemClickListener implements ListView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            selectItem(position);
        }
    }

    private void selectItem(int position) {


        switch (position) {
            case 0:
                //fragment = new HomeFragment();
                Intent d = new Intent(this,HomeActivty.class);
                startActivity(d);
                setTitle(mItemTitles[0]);

                break;
            case 1:
                //fragment = new RegisterFragment();
                Intent a = new Intent(this,RegisterActivity.class);
                startActivity(a);
                setTitle(mItemTitles[1]);
                //finish();
                break;
            case 2:
                //fragment = new GalleryFragment();
                Intent b = new Intent(this,SponsorActivity.class);
                startActivity(b);
                setTitle(mItemTitles[2]);
                //finish();
                break;
            /*case 3:
                //fragment = new EventsFragment();
                Intent c = new Intent(this,EventsActivity.class);
                startActivity(c);
                setTitle(mItemTitles[3]);
                finish();
                break;*/
            case 3:
                //fragment = new AboutUsFragment();
                Intent e = new Intent(this, AboutUsActivity.class);
                startActivity(e);
                setTitle(mItemTitles[3]);
                //finish();
                break;
            case 4:
                //fragment = new ContactUsFragment();
                Intent f = new Intent(this,ContactUsActivity.class);
                setTitle(mItemTitles[4]);
                startActivity(f);
                //finish();
                break;
            default:
                break;
        }




            mDrawerList.setItemChecked(position, true);
            mDrawerList.setSelection(position);

            mDrawerLayout.closeDrawer(mDrawerList);


    }

    @Override
    public void setTitle(CharSequence title) {
        mTitle = title;
        getActionBar().setTitle(mTitle);
    }



    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        // Pass any configuration change to the drawer toggls
        mDrawerToggle.onConfigurationChanged(newConfig);
    }

}

