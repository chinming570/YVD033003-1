package com.example.user.yvd033003;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> data = new ArrayList<>();
    MyAdapter adapter;
    ListView Iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Iv = (ListView) findViewById(R.id.listView);
        data.add("AA1");
        data.add("AA2");
        data.add("AA3");
        data.add("AA4");
        data.add("AA5");
        data.add("AA6");
        data.add("AA7");
        data.add("AA8");
        data.add("AA9");
        data.add("AA10");
        data.add("AA11");
        data.add("AA12");
        adapter = new MyAdapter(MainActivity.this, data);

        Iv.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add("Show");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getTitle().equals("Show"))
        {
            StringBuilder sb = new StringBuilder();
            int i;
            for (i=0;i<adapter.chks.length;i++)
            {
                if (adapter.chks[i])
                {
                    sb.append(data.get(i) + ",");
                }
            }
            Toast.makeText(MainActivity.this, sb.toString(), Toast.LENGTH_LONG).show();
        }
        return super.onOptionsItemSelected(item);
    }
}


