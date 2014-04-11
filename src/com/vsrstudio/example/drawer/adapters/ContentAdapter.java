package com.vsrstudio.example.drawer.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.vsrstudio.example.drawer.R;

public class ContentAdapter extends BaseAdapter {

    private final Context context;
    private final int section;

    public ContentAdapter(Context context, int section) {
        this.context = context;
        this.section = section;
    }

    public View getView(int position, View convertView, ViewGroup viewGroup) {
        LayoutInflater mInflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);

        convertView = mInflater.inflate(R.layout.grid_item, null);
        switch (section) {
            case 0:
                convertView.findViewById(R.id.box).setBackground(context.getResources().getDrawable(R.drawable.box_green));
                break;
            case 1:
                convertView.findViewById(R.id.box).setBackground(context.getResources().getDrawable(R.drawable.box_orange));
                break;
            case 2:
                convertView.findViewById(R.id.box).setBackground(context.getResources().getDrawable(R.drawable.box_blue));
                break;
        }
        ((TextView) convertView.findViewById(R.id.item_title)).setText("Position = " + position);

        return convertView;
    }

    public int getCount() {
        return 10;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return position;
    }

}
