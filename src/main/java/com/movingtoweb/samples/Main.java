package com.movingtoweb.samples;

public class Main implements MainI {

    public static void main(String[] args) throws InterruptedException {
        new Main().start();
    }

    public void start() throws InterruptedException {

        //Register the instance of Main to a singleton Class
        CallBackPlaceHolder.getInstance().register(this);
        System.out.println("Registered Main class to PlaceHolder");
        //Fire the event
        ApiTrigger apiTrigger = new ApiTrigger();
        apiTrigger.start();
        System.out.println("Event Fired");

        //Do other work
        while(true){
            System.out.println("Inside Main. Fired every 10 seconds");
            Thread.sleep(10000);
        }
    }

    public void receiveCallBacK() {
        System.out.println("Received CallBack in Main. Do other processing here..");
    }
}

