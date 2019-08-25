package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        listView = findViewById(R.id.listview1);

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("progress\t전진,진행");
        arrayList.add("propose\t제안하다");
        arrayList.add("produce\t생산하다");
        arrayList.add("protect\t보호하다");
        arrayList.add("pros and cons\t찬반양론");
        arrayList.add("predict\t예언하다");
        arrayList.add("precaution\t조심,경계");
        arrayList.add("premature\t조급한");
        arrayList.add("preview\t미리 보기");
        arrayList.add("forehead\t이마");
        arrayList.add("forefather\t선조,조상");
        arrayList.add("foremost\t중요한");
        arrayList.add("foresee\t예견하다");
        arrayList.add("postpone\t연기하다");
        arrayList.add("postscript\t추신");
        arrayList.add("income\t수입, 소득");
        arrayList.add("intake\t섭취(량)");
        arrayList.add("infect\t감염시키다");
        arrayList.add("insight\t통찰력");
        arrayList.add("invest\t투자하다");



        ArrayAdapter arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList);

        listView.setAdapter(arrayAdapter);

    }
}
