package com.example.user.classtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        textView = findViewById(R.id.tvId);
        listView = findViewById(R.id.lvId);

        final String [] country = getResources().getStringArray(R.array.country);

        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.sample_layout_list_view,R.id.sampleId,country);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String select = country [position];
                Intent intent = new Intent(MainActivity.this,Details.class);
                intent.putExtra("cun",select);
                startActivity(intent);

            }
        });

    }


}
