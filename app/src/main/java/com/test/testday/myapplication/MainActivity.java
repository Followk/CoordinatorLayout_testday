package com.test.testday.myapplication;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    private TextView tv_1,tv_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_1 = (TextView) findViewById(R.id.tv_1);
        tv_2 = (TextView) findViewById(R.id.tv_2);

        setLister();
    }

    private void setLister() {
        tv_1.setOnClickListener(this);
        tv_2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_1:
                CoordinatorLayoutStyleOneActivity.start(this);
                break;

            case R.id.tv_2:
                CoordinatorLayoutStyleTwoActivity.start(this);
                break;
            default:
                break;
        }
    }
}
