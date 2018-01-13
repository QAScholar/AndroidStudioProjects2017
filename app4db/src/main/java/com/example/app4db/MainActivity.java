package com.example.app4db;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   ListView listView;
    String[] tests = {"aa", "bb"};
    int selectedPosition;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.ListView);
        button   = findViewById(R.id.button);
        ArrayAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, tests);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                            @Override
                                            public void onItemClick(AdapterView<?> parent, View itemClicked, final int position,
                                                                    long id) {
                                                Toast.makeText(getApplicationContext(), ((TextView) itemClicked).getText(),
                                                        Toast.LENGTH_SHORT).show();

//                Intent secondActivity = new Intent(MainActivity.this, SecondActivity.class);
//
//
//
                                                selectedPosition = position;
                                            }
                                        });
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra("position",selectedPosition);
                        startActivity(intent);}
                });
            }
        }
