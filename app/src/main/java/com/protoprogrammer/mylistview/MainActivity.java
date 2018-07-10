package com.protoprogrammer.mylistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;

    String[] values = new String[] {
            "Item 1: Android",
            "Item 2: iPhone ",
            "Item 3: Windows Phone",
            "Item 4: Custom Phone"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1 , android.R.id.text1 , values);
        listView.setAdapter(adapter);

    }
}
