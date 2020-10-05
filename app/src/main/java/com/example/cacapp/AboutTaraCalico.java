package com.example.cacapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class AboutTaraCalico extends AppCompatActivity
{

    private int age;
    private String name;
    private String DOB;
    private String lastSeenDate;
    private String locationLastSeen;
    private boolean hasReward;
    private String scarsAndMarks;
    private String contactNum;
    private String sex;
    private String hair;
    private String weight;
    private String height;
    private String race;
    private String eyeColor;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_tara_calico);

        setAge(49);
        setName("Tara Calico");
        setLastSeenDate("September 20,1988");
        setDOB("Feburary 28, 2969");
        setLocationLastSeen("Belen, New Mexico");
        setHasReward(false);
        setScarsAndMarks("Large Scar on right shoulder and brown birthmark in her leg");
        setContactNum("N/A");
        setSex("Female");
        setHair("brown");
        setEyeColor("Hazel");
        setHeight("5\'5\"");
        setWeight("115- 120lbs");
        setRace("White");

        Log.i("info", "--------------------------"+ toString()+"----------------------------");

        Log.i("info", "--------------------------"+ getAge()+"--------------------------");
        Log.i("info", "--------------------------"+ getName()+"--------------------------");
        Log.i("info", "--------------------------"+ getDOB()+"--------------------------");
        Log.i("info", "--------------------------"+ getLastSeenDate()+"--------------------------");
        Log.i("info", "--------------------------"+ getLocationLastSeen()+"--------------------------");
        Log.i("info", "--------------------------"+ getHasReward()+"--------------------------");
        Log.i("info", "--------------------------"+ getScarsAndMarks()+"--------------------------");
        Log.i("info", "--------------------------"+ getContactNum()+"--------------------------");
        Log.i("info", "--------------------------"+ getSex()+"--------------------------");
        Log.i("info", "--------------------------"+ getHair()+"--------------------------");
        Log.i("info", "--------------------------"+ getEyeColor()+"--------------------------");
        Log.i("info", "--------------------------"+ getHeight()+"--------------------------");
        Log.i("info", "--------------------------"+ getWeight()+"--------------------------");
        Log.i("info", "--------------------------"+ getRace()+"--------------------------");

    }

    public void onClickReturnMissingPersonScnBtn_TaraC(View view)
    {
        finish();
    }

    /*Getters*/
    public int getAge() {
        return age;
    }//end method getAge()

    public String getName() {
        return name;
    }//end getName()

    public String getDOB() {
        return DOB;
    }//end getDOB

    public String getLastSeenDate() {
        return lastSeenDate;
    }// end getLastSeenDate()

    public String getLocationLastSeen() {
        return locationLastSeen;
    }//end getLocationLastSeen()

    public boolean getHasReward()
    {
        return hasReward;
    }
    public String getScarsAndMarks() {
        return scarsAndMarks;
    }//end getScarsAndMarks()

    public String getContactNum() {
        return contactNum;
    }//end getContactNum()

    public String getSex() {
        return sex;
    }//end getSex()

    public String getHeight() {
        return height;
    }//end getHeight()

    public String getWeight() {
        return weight;
    }//end getWeight()

    public String getRace() {
        return race;
    }//end getRace()

    public String getEyeColor() {
        return eyeColor;
    }// end getEyeColor()

    public String getHair() {
        return hair;
    }//end getHair()

    /*Setters*/
    public void setAge(int age) {
        this.age = age;
    }//end setAge()

    public void setName(String name) {
        this.name = name;
    }//end setName()

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }//end setDOB()

    public void setLastSeenDate(String lastSeenDate) {
        this.lastSeenDate = lastSeenDate;
    }// end setLastSeenDate()

    public void setLocationLastSeen(String locationLastSeen) {
        this.locationLastSeen = locationLastSeen;
    }//end setLocationLastSeen()

    public void setHasReward(boolean hasReward) {
        this.hasReward = hasReward;
    }//end setHasReward()

    public void setScarsAndMarks(String scarsAndMarks) {
        this.scarsAndMarks = scarsAndMarks;
    }//end setScarsAndMarks()

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }//end setContactNum()

    public void setRace(String race) {
        this.race = race;
    }// end setRace()

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }//end setEyeColor()

    public void setSex(String sex) {
        this.sex = sex;
    }//end setSex()

    public void setHair(String hair) {
        this.hair = hair;
    }//end setHair()

    public void setHeight(String height) {
        this.height = height;
    }//end setHeight()

    public void setWeight(String weight) {
        this.weight = weight;
    }//end setWeight()


//    /*Edit TextViews*/
//
//    public void editLastSeen()
//    {
//        TextView currentTV = (TextView) findViewById(R.id.lastSeen_taraCalico);
//        String newTv = currentTV.getText().toString()+ lastSeenDate;
//    }


    @Override
    public String toString() {
        return "AboutTaraCalico{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", DOB='" + DOB + '\'' +
                ", lastSeenDate='" + lastSeenDate + '\'' +
                ", locationLastSeen='" + locationLastSeen + '\'' +
                ", hasReward=" + hasReward +
                ", scarsAndMarks='" + scarsAndMarks + '\'' +
                ", contactNum='" + contactNum + '\'' +
                ", sex='" + sex + '\'' +
                ", hair='" + hair + '\'' +
                ", weight='" + weight + '\'' +
                ", height='" + height + '\'' +
                ", race='" + race + '\'' +
                ", eyeColor='" + eyeColor + '\'' +
                '}';
    }
}