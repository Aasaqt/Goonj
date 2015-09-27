package com.goonj.android.goonj1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.TextView;

import java.util.List;

/**
 * Created by aasaqt on 7/1/15.
 */
public class ContactUsActivity extends BaseActivity implements View.OnClickListener {
    public ContactUsActivity(){}

    private List<TextView> contacts;
    private TextView cont1,cont3,cont4,cont6,mail,website;
    private String phone1,phone3,phone4,phone6,emailadd,web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState,R.layout.contactus);
        cont1 = (TextView) findViewById(R.id.contact1);
        //cont2 = (TextView) findViewById(R.id.contact2);
        cont3 = (TextView) findViewById(R.id.contact3);
        cont4 = (TextView) findViewById(R.id.contact4);
        //cont5 = (TextView) findViewById(R.id.contact5);
        cont6 = (TextView) findViewById(R.id.contact6);
        mail = (TextView) findViewById(R.id.mail);
        website = (TextView) findViewById(R.id.website);
        cont1.setOnClickListener(this);
        //cont2.setOnClickListener(this);
        cont3.setOnClickListener(this);
        cont4.setOnClickListener(this);
        //cont5.setOnClickListener(this);
        cont6.setOnClickListener(this);
        mail.setOnClickListener(this);
        website.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.contact1:
                phone1 = cont1.getText().toString();
                Intent callIntent1 = new Intent(Intent.ACTION_DIAL);
                callIntent1.setData(Uri.parse("tel:" + phone1));
                callIntent1.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(callIntent1);
                break;

            case R.id.contact3:
                phone3 = cont3.getText().toString();
                Intent callIntent3 = new Intent(Intent.ACTION_DIAL);
                callIntent3.setData(Uri.parse("tel:" + phone3));
                callIntent3.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(callIntent3);
                break;
            case R.id.contact4:
                phone4 = cont4.getText().toString();
                Intent callIntent4 = new Intent(Intent.ACTION_DIAL);
                callIntent4.setData(Uri.parse("tel:" + phone4));
                callIntent4.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(callIntent4);
                break;

            case R.id.contact6:
                phone6 = cont6.getText().toString();
                Intent callIntent6 = new Intent(Intent.ACTION_DIAL);
                callIntent6.setData(Uri.parse("tel:" + phone6));
                callIntent6.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(callIntent6);
                break;
            case R.id.mail:
                emailadd = mail.getText().toString();
                Intent callIntent7 = new Intent(Intent.ACTION_DIAL);
                callIntent7.setData(Uri.parse("tel:" + emailadd));
                callIntent7.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(callIntent7);
                break;
            case R.id.website:
                String web = website.getText().toString();
                Intent webIntent = new Intent( Intent.ACTION_VIEW );
                webIntent.setData( Uri.parse(web) );

                startActivity(webIntent);
                break;
            default:
                break;

        }
        getActionBar().setTitle("Contact Us");
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }
}
