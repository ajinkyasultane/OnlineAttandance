package com.ajinkya.onlineattandancesystem;

public class Javascript_Student_data {
    String name,branch,roll_no,date,time;

    public Javascript_Student_data(String name, String branch, String roll_no , String date, String time) {
        this.name = name;
        this.branch = branch;
        this.roll_no = roll_no;
        this.date = date;
        this.time = time;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(String roll_no) {
        this.roll_no = roll_no;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}

