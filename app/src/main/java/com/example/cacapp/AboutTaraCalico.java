package com.example.cacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class AboutTaraCalico extends AppCompatActivity
{
    TextView lastSeenTV;
    TextView dobTV;
    MissingPeople tara_calico = new MissingPeople();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_tara_calico);
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

        changeLastSeen();
        changeDescriptionTable();
        /*Log.i("TESTING", "--------------------------"+ tara_calico.toString()+"----------------------------");
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
        toast.show();*/
    }

    public void onClickReturnMissingPersonScnBtn_TaraC(View view)
    {
        finish();
    }

    public void changeLastSeen()
    {
        lastSeenTV = (TextView) findViewById(R.id.lastSeen_taraCalico);
        lastSeenTV.setText(""+ tara_calico.getLastSeenDate()+ "\n"+ tara_calico.getLocationLastSeen());
    }

    public void changeDescriptionTable()
    {
        dobTV = (TextView) findViewById(R.id.dateOfBirth_taraCalico);
        String dOBStr = (String) dobTV.getText();
        SpannableString ss = new SpannableString(dOBStr + " "+ tara_calico.getDOB());
        StyleSpan bold = new StyleSpan(Typeface.BOLD);
        ss.setSpan(bold,0, dOBStr.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        dobTV.setText(ss);

  /*      TextView raceTV = (TextView) findViewById(R.id.race_taraCalico);
        raceTV.setText(raceTV.getText()+ tara_calico.getRace());

        TextView sexTV = (TextView) findViewById(R.id.sex_taraCalico);
        sexTV.setText(sexTV.getText()+ tara_calico.getSex());*/

    }
}
