package com.example.prac1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.prac1.R.string.toast_message;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button reset;
    private Button mEvenOdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        reset = (Button) findViewById(R.id.button_zero);
        mEvenOdd = (Button) findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view){
        ++mCount;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    public void zero(View view){
        if (mShowCount != null) {
            reset.setBackgroundColor(Color.parseColor("#00ff00"));
            int mZero = 0;
            mShowCount.setText(Integer.toString(mZero));
            mCount = 0;
        }
    }

    public Button getReset() { return reset; }

    public void setReset(Button reset) {
        this.reset = reset;
    }

    public Button getmEvenOdd() {
        return mEvenOdd;
    }

    public void setmEvenOdd(Button mEvenOdd) {
        this.mEvenOdd = mEvenOdd;
    }
}