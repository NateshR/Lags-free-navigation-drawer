package com.vsrstudio.example.drawer.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.vsrstudio.example.drawer.R;

public class ContentAdapter extends BaseAdapter {

    private final Context context;
    private final int section;

    private final int[] images = new int[]{
            android.R.drawable.ic_menu_compass,
            android.R.drawable.star_on,
            android.R.drawable.ic_dialog_email,
            android.R.drawable.arrow_down_float,
    };

    public ContentAdapter(Context context, int section) {
        this.context = context;
        this.section = section;
    }

    public View getView(final int position, View convertView, ViewGroup viewGroup) {
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
        ((TextView) convertView.findViewById(R.id.large_title)).setText("Position = " + position);
        ((TextView) convertView.findViewById(R.id.medium_title)).setText("Sub title");
        ((TextView) convertView.findViewById(R.id.small_title)).setText("Sub sub title :)");
        ((ImageView) convertView.findViewById(R.id.icon)).setImageResource(images[(int) (Math.random() * images.length)]);

        convertView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Toast.makeText(context, "You've just tapped position " + position, Toast.LENGTH_SHORT).show();
            }
        });

        return convertView;
    }

    public int getCount() {
        return 20;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return position;
    }

}
