package com.example.dell.uidesign;


import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabWidget;

public class MainActivity extends TabActivity{
    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_tab);
        TabHost tabHost=getTabHost();
        tabHost.addTab(tabHost.newTabSpec("Tab1").setIndicator("球队").setContent(new Intent(MainActivity.this,TeamViewActivity.class)));
        tabHost.addTab(tabHost.newTabSpec("Tab2").setIndicator("赛事").setContent(new Intent(MainActivity.this,MatchViewActivity.class)));
        tabHost.addTab(tabHost.newTabSpec("Tab3").setIndicator("我的").setContent(new Intent(MainActivity.this,MySpaceViewActivity.class)));

    }
}
