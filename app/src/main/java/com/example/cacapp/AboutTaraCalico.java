package com.example.cacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AboutTaraCalico extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_tara_calico);
        MissingPeople tara_calico = new MissingPeople();
        tara_calico.setAge(49);
        tara_calico.setName("Tara Calico");
        tara_calico.setLastSeenDate("September 20,1988");
        tara_calico.setDOB("Feburary 28, 2969");
        tara_calico.setLocationLastSeen("Belen, New Mexico");
        tara_calico.setHasReward(false);
        tara_calico.setScarsAndMarks("Large Scar on right shoulder and brown birthmark in her leg");
        tara_calico.setContactNum("N/A");
        tara_calico.setSex("Female");
        tara_calico.setHair("brown");
        tara_calico.setEyeColor("Hazel");
        tara_calico.setHeight("5'5\"");
        tara_calico.setWeight("115- 120lbs");
        tara_calico.setRace("White");

        Log.i("TESTING", "--------------------------"+ tara_calico.toString()+"----------------------------");
        Log.i("TESTING", "--------------------------"+ tara_calico.getAge()+"--------------------------");
        Log.i("TESTING", "--------------------------"+ tara_calico.getName()+"--------------------------");
        Log.i("TESTING", "--------------------------"+ tara_calico.getDOB()+"--------------------------");
        Log.i("TESTING", "--------------------------"+ tara_calico.getLastSeenDate()+"--------------------------");
        Log.i("TESTING", "--------------------------"+ tara_calico.getLocationLastSeen()+"--------------------------");
        Log.i("TESTING", "--------------------------"+ tara_calico.getHasReward()+"--------------------------");
        Log.i("TESTING", "--------------------------"+ tara_calico.getScarsAndMarks()+"--------------------------");
        Log.i("TESTING", "--------------------------"+ tara_calico.getContactNum()+"--------------------------");
        Log.i("TESTING", "--------------------------"+ tara_calico.getSex()+"--------------------------");
        Log.i("TESTING", "--------------------------"+ tara_calico.getHair()+"--------------------------");
        Log.i("TESTING", "--------------------------"+ tara_calico.getEyeColor()+"--------------------------");
        Log.i("TESTING", "--------------------------"+ tara_calico.getHeight()+"--------------------------");
        Log.i("TESTING", "--------------------------"+ tara_calico.getWeight()+"--------------------------");
        Log.i("TESTING", "--------------------------"+ tara_calico.getRace()+"--------------------------");

        Toast toast = Toast.makeText(getApplicationContext(),"--------------------------"+ tara_calico.toString()+"----------------------------",Toast.LENGTH_LONG);
        toast.show();
    }

    public void onClickReturnMissingPersonScnBtn_TaraC(View view)
    {
        finish();
    }


}
