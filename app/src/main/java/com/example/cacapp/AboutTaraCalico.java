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
        tara_calico.setScarsAndMarks("Large ccar on right shoulder and brown birthmark on her leg");
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
        SpannableString ss_dob = new SpannableString(dOBStr + " "+ tara_calico.getDOB());
        StyleSpan bold_dob = new StyleSpan(Typeface.BOLD);
        ss_dob.setSpan(bold_dob,0, dOBStr.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        dobTV.setText(ss_dob);

        TextView raceTV = (TextView) findViewById(R.id.race_taraCalico);
        String raceStr = (String) raceTV.getText();
        SpannableString ss_race = new SpannableString(raceStr + " "+ tara_calico.getRace());
        StyleSpan bold_race = new StyleSpan(Typeface.BOLD);
        ss_race.setSpan(bold_race,0, raceStr.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        raceTV.setText(ss_race);

        TextView sexTV = (TextView) findViewById(R.id.sex_taraCalico);
        String sexStr = (String) sexTV.getText();
        SpannableString ss_sex = new SpannableString(sexStr + " "+ tara_calico.getSex());
        StyleSpan bold_sex = new StyleSpan(Typeface.BOLD);
        ss_sex.setSpan(bold_sex,0, sexStr.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        sexTV.setText(ss_sex);

        TextView scarsAndMarksTV = (TextView) findViewById(R.id.scarsAndMarks_taraCalico);
        String scarsAndMarksStr = (String) scarsAndMarksTV.getText();
        SpannableString ss_scarsAndMarks = new SpannableString(scarsAndMarksStr + "\n"+ tara_calico.getScarsAndMarks());
        StyleSpan bold_scarsAndMarks = new StyleSpan(Typeface.BOLD);
        ss_scarsAndMarks.setSpan(bold_scarsAndMarks,0, scarsAndMarksStr.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        scarsAndMarksTV.setText(ss_scarsAndMarks);
    }
}
