package com.example.dell.uidesign;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MySpaceViewActivity extends AppCompatActivity {
    ListView listView;
    ArrayAdapter<String> arrayAdapter;
    String []strings={"A","B","C"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_space_view);
        initview();
    }
    public void initview(){
        listView=findViewById(R.id.listview);
        ArrayList<String> list=new ArrayList<>();
        list.add("设置");
        list.add("我的收藏");
        list.add("推荐给朋友");
        list.add("关于");
        arrayAdapter=new ArrayAdapter<String>(MySpaceViewActivity.this,android.R.layout.simple_list_item_1,list);
        listView.setAdapter(arrayAdapter);
    }
}
