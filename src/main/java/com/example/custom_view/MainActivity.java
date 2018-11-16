package com.example.custom_view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private MyGridLayout myGridLayout;
    private List<String> mList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        myGridLayout = findViewById(R.id.my_gridlayout);
        myGridLayout.setDragAble(true);

        mList = new ArrayList<String>();
        mList.add("国内");
        mList.add("国际");
        mList.add("社会");
        mList.add("军事");
        mList.add("娱乐");
        mList.add("科技");
        mList.add("游戏");
        mList.add("体育");
        mList.add("教育");
        myGridLayout.addItems(mList);


        myGridLayout = findViewById(R.id.my_undrage_gridlayout);
        myGridLayout.setDragAble(false);
        mList = new ArrayList<String>();
        mList.add("国内");
        mList.add("国际");
        mList.add("社会");
        mList.add("军事");
        mList.add("娱乐");
        mList.add("科技");
        mList.add("游戏");
        mList.add("体育");
        mList.add("教育");
        myGridLayout.addItems(mList);
    }
}
