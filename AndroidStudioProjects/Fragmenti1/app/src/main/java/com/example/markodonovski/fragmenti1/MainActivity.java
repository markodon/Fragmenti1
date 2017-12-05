package com.example.markodonovski.fragmenti1;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.button)
    Button kopce;
    @BindView(R.id.textView)
    TextView text;
    @BindView(R.id.pager)
    ViewPager pager;
    @BindView(R.id.tab)
    TabLayout tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setUpViewPager(pager);
        tab.setupWithViewPager(pager);
    }

    private void setUpViewPager(ViewPager pager) {
        MyPageAdapter adapter = new MyPageAdapter(this.getSupportFragmentManager());

        pager.setAdapter(adapter);
    }


}
