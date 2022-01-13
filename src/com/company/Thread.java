package com.company;

public class Thread {

    Thread thread = new Thread(new Runner());
    thread.start();
}

class Runner implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 200; i++) {
            try {
                thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" Hello from Thread" + i);

        }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 200; i++) {
            try {
                thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(" Hello from Thread" + i);

        }
    }
    MyThread mythread = new MyThread();
    myThread.start();



}class  MyThread extends Thread {
    private bollean running = true;
    public  void run()
        while (true){
            System.out.println("Hello");
        try{Thread.sleep(500);

        }catch (InterruptedException e )
            printStracTrace();

    }
}
