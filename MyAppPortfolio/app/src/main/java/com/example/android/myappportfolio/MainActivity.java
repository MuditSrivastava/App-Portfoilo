package com.example.android.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    String s;
    public void toastMsg(String msg)
    {
        Toast toast = Toast.makeText(this,msg,Toast.LENGTH_SHORT);
        toast.show();
    }
    public void displayToastMsg1(View view)
    {
        s="Media Streamer app!";
        toastMsg("This button will launch my " + s);
    }
    public void displayToastMsg2(View view)
    {
        s="Football Scores app!";
        toastMsg("This button will launch my "+ s);
    }
    public void displayToastMsg3(View view)
    {
        s="Library app!";
        toastMsg("This button will launch my "+ s);
    }
    public void displayToastMsg4(View view)
    {
        s="Build it Bigger app!";
        toastMsg("This button will launch my "+ s);
    }
    public void displayToastMsg5(View view)
    {
        s="XYZ app!";
        toastMsg("This button will launch my "+ s);
    }
    public void displayToastMsg6(View view)
    {
        s="Capstone app!";
        toastMsg("This button will launch my "+ s);
    }
}
