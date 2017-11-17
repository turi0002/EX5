package com.example.user.ex5;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ToggleButton;

import static com.example.user.ex5.R.id.rl1;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RelativeLayout rl = (RelativeLayout) findViewById(rl1);
        LinearLayout ll1 = new LinearLayout(this);
        ll1.setId(R.id.ll1);
        ll1.setOrientation(LinearLayout.VERTICAL);
        ll1.setBackgroundResource(R.drawable.border);
        RelativeLayout.LayoutParams rlp = new RelativeLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT,toPixel(150) );
        rlp.addRule(RelativeLayout.BELOW,R.id.tvIntro);
        rlp.setMargins(0,toPixel(40),0,0);
        rl.addView(ll1,rlp);
        TextView tv= new TextView(this);
        tv.setId(R.id.tv1);
        LinearLayout.LayoutParams tvp = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        tv.setText(getString(R.string.sub_intro));
        ll1.addView(tv,tvp);
        tvp.setMargins(toPixel(70),0,0,0);
        LinearLayout ll2 = new LinearLayout(this);
        ll2.setBackgroundResource(R.drawable.border);
        ll2.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams rlp2 = new LinearLayout.LayoutParams(toPixel(170),toPixel(50) );
        ll2.setBackgroundResource(R.drawable.border);
        rlp2.setMargins(toPixel(110),toPixel(40),0,0);
        ll2.setOrientation(LinearLayout.HORIZONTAL);
        ll1.addView(ll2,rlp2);
        CheckBox cb1 = new CheckBox(this);
        LinearLayout.LayoutParams cbp1 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT );
        ll2.addView(cb1,cbp1);
        cb1.setText(R.string.cb1);
        CheckBox cb2  = new CheckBox(this);
        LinearLayout.LayoutParams cbp2 = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT );
        ll2.addView(cb2,cbp2);
        cb2.setText(R.string.cb2);
    }
    public void onToggleClicked(View v) {
        FrameLayout frameL = (FrameLayout) findViewById(R.id.frameL);
        if(((ToggleButton)v).isChecked()==true) {
            LinearLayout ll4 = (LinearLayout) LayoutInflater.from(this).inflate(R.layout.layout1,null);
            frameL.removeAllViews();
            frameL.addView(ll4);
        }
            else



    }

    private int toPixel(int dp)
    {
        Resources r = getResources();
        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, r.getDisplayMetrics());
                      return (int)px;
    }
}
