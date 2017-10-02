/*
set counter info
increment/decrement/reset functions
 */

package com.assignment1.jlin7_countbook2;

import java.util.Date;

/**
 * Created by Kenny on 2017/10/2.
 */

public class Counter {
    static public String name;
    public int initCount;
    public int currentCount;
    public String comment;
    private Date date;

    public Counter(String name, int initCount, int currentCount, String comment){
        this.name=name;
        this.initCount=initCount;
        this.currentCount=currentCount;
        this.comment=comment;
        date=new Date();
    }

    static public String getName(){
        return name;
    }

    public void reset (int initCount, int currentCount){
        currentCount=initCount;

    }

    public void increment(int currentCount){
        currentCount++;
    }

    public void decrement(int currentCount){
        if(currentCount-- > 0){
            currentCount--;
        }else if(currentCount-- == 0){
            currentCount--;
        }else{
            currentCount=0;
        }

    }


}
