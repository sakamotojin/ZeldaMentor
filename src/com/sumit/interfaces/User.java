package com.sumit.interfaces;

public class User {

    Watch watch;

    public User(Watch watch){
        this.watch = watch;

    }
    public void run(){
        watch.displayTime();
    }
}


