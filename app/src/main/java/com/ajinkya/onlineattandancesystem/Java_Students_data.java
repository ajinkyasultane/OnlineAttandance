package com.ajinkya.onlineattandancesystem;

public class Java_Students_data
{
    String name, branch,roll_no;

    public Java_Students_data(String name, String branch, String roll_no) {
        this.name = name;
        this.branch = branch;
        this.roll_no = roll_no;
       // Spinner = spinner;

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

//    public String getSpinner() {
//        return Spinner;
//    }
//
//    public void setSpinner(String spinner) {
//        Spinner = spinner;
//    }
}
