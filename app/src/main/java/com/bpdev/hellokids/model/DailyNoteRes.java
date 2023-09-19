package com.bpdev.hellokids.model;

public class DailyNoteRes {
    private int id;
    private int teacherId;
    private int childId;
    private String title;
    private String contents;
    private String dailyTemperCheck;
    private String dailyMealCheck;
    private String dailyNapCheck;
    private String dailyPooCheck;

    public DailyNoteRes(int id, int teacherId, int childId, String title, String contents, String dailyTemperCheck, String dailyMealCheck, String dailyNapCheck, String dailyPooCheck) {
        this.id = id;
        this.teacherId = teacherId;
        this.childId = childId;
        this.title = title;
        this.contents = contents;
        this.dailyTemperCheck = dailyTemperCheck;
        this.dailyMealCheck = dailyMealCheck;
        this.dailyNapCheck = dailyNapCheck;
        this.dailyPooCheck = dailyPooCheck;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public int getChildId() {
        return childId;
    }

    public void setChildId(int childId) {
        this.childId = childId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getDailyTemperCheck() {
        return dailyTemperCheck;
    }

    public void setDailyTemperCheck(String dailyTemperCheck) {
        this.dailyTemperCheck = dailyTemperCheck;
    }

    public String getDailyMealCheck() {
        return dailyMealCheck;
    }

    public void setDailyMealCheck(String dailyMealCheck) {
        this.dailyMealCheck = dailyMealCheck;
    }

    public String getDailyNapCheck() {
        return dailyNapCheck;
    }

    public void setDailyNapCheck(String dailyNapCheck) {
        this.dailyNapCheck = dailyNapCheck;
    }

    public String getDailyPooCheck() {
        return dailyPooCheck;
    }

    public void setDailyPooCheck(String dailyPooCheck) {
        this.dailyPooCheck = dailyPooCheck;
    }
}
