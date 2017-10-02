package com.assignment1.jlin7_countbook2;

import java.util.Date;

/**
 * Created by Kenny on 2017/10/2.
 */

public class Counter {
    private String name;
    private int initCount;
    private int currentCount;
    private String comment;
    private Date date;

    public Counter(String name, int initCount, int currentCount, String comment){
        this.name=name;
        this.initCount=initCount;
        this.currentCount=currentCount;
        this.comment=comment;
        date=new Date();
    }


}
