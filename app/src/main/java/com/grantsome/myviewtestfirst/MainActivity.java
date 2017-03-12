package com.grantsome.myviewtestfirst;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;

    private List<Fragment> mFragmentList;

    private Fragment mFragmentFirst;

    private Fragment mFragmentSecond;

    private MyFragmentAdapter mMyFragmentAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDate();
    }

    private void initDate(){
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mFragmentList = new ArrayList<>();
        mFragmentFirst = new FirstFragment();
        mFragmentSecond = new SecondFragment();
        mFragmentList.add(mFragmentSecond);
        mFragmentList.add(mFragmentFirst);
        mMyFragmentAdapter = new MyFragmentAdapter(getSupportFragmentManager(),mFragmentList);
        mViewPager.setAdapter(mMyFragmentAdapter);
    }
}
