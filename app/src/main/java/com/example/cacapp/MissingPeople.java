package com.example.cacapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MissingPeople extends Fragment
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

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.missing_people_layout, container, false);
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
        return "age=" + age +
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
