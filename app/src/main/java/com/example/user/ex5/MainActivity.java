package com.example.user.ex5;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout rl= (RelativeLayout)findViewById(R.id.rl1);
        LinearLayout ll1 = new LinearLayout(this);
        ll1.setId(R.id.ll1);
        ll1.setBackground(getResources().getDrawable(R.drawable.border));
        int width=100;

    }
}
