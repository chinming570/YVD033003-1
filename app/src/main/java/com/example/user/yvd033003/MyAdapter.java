package com.example.user.yvd033003;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by User on 2017/3/30.
 */

public class MyAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> data;
    public boolean chks[];
    public MyAdapter(Context c, ArrayList<String> d)
    {
      context = c;
        data = d;
        chks = new boolean[d.size()];
      }
    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int position, View convretView, ViewGroup parent) {
        Log.d("MyView", "p:" + position);
        ViewHolder holder = new ViewHolder();
        if (convretView == null)
        {
            convretView = ((Activity) context).getLayoutInflater().inflate(R.layout.myitem, null);
            holder.tv = (TextView) convretView.findViewById(R.id.textView);
            holder.chk = (CheckBox) convretView.findViewById(R.id.checkBox);
            holder.btn = (Button) convretView.findViewById(R.id.button);
            convretView.setTag(holder);
        }
        else
        {
            holder = (ViewHolder) convretView.getTag();
        }
        holder.tv.setText(data.get(position));
        holder.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, data.get(position), Toast.LENGTH_SHORT).show();
            }
        });
        return convretView;
     }

    static class ViewHolder
    {
        TextView tv;
        CheckBox chk;
        Button btn;
    }
}
