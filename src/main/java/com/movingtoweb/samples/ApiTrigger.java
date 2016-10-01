package com.movingtoweb.samples;

import jdk.nashorn.internal.codegen.CompilerConstants;

public class ApiTrigger extends Thread {

    @Override
    public void run() {

        //Other API codes
        CallBackClass callback = new CallBackClass();
        try {
            apicall(callback);
        } catch (InterruptedException e) {
            System.out.println("InterupptedException..." + e);
        }
    }

    private void apicall(CallBack callback) throws InterruptedException {
        callback.call();
    }
}

class CallBackClass implements CallBack {

    public void call() throws InterruptedException {
        System.out.println("CallBackClass::waiting for 30 seconds to respond..");

        Thread.sleep(30000);
        System.out.println("CallBackClass::Going to finish callback, completed 30 seconds..");
        CallBackPlaceHolder.getInstance().finish();
    }
}

interface CallBack {
    void call() throws InterruptedException;
}
