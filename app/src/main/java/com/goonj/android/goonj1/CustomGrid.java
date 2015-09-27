package com.goonj.android.goonj1;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aasaqt on 10/1/15.
 */
public class CustomGrid extends BaseAdapter {
    private ArrayList<String> text;
    private ArrayList<Integer> image;
    private Activity activity;

    public CustomGrid(Activity activity,ArrayList<String> listCountry, ArrayList<Integer> listFlag) {
        super();
        this.text = listCountry;
        this.activity = activity;
        this.image= listFlag;
    }

    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return text.size();
    }

    @Override
    public String getItem(int position) {
        // TODO Auto-generated method stub
        return text.get(position);
    }

    @Override
    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    public static class ViewHolder
    {
        public ImageView imgViewFlag;
        public TextView txtViewTitle;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // TODO Auto-generated method stub
        ViewHolder view;
        LayoutInflater inflator = activity.getLayoutInflater();

        if(convertView==null)
        {
            view = new ViewHolder();
            convertView = inflator.inflate(R.layout.main_item, null);

            view.txtViewTitle = (TextView) convertView.findViewById(R.id.grid_text);
            view.imgViewFlag = (ImageView) convertView.findViewById(R.id.grid_image);

            convertView.setTag(view);
        }
        else
        {
            view = (ViewHolder) convertView.getTag();
        }

        view.txtViewTitle.setText(text.get(position));
        view.imgViewFlag.setImageResource(image.get(position));

        return convertView;
    }
}