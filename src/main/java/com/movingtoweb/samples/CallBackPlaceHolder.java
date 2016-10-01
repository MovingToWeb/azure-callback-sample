package com.movingtoweb.samples;

public class CallBackPlaceHolder {

    private static CallBackPlaceHolder instance;
    private MainI main;

    private CallBackPlaceHolder() {
    }

    public static CallBackPlaceHolder getInstance() {
        if (instance == null) {
            instance = new CallBackPlaceHolder();
        }
        return instance;
    }

    public void register(MainI main) {
        this.main = main;
    }


    public void finish() {
        System.out.printf("CallBack Completed");
        main.receiveCallBacK();
    }
}
