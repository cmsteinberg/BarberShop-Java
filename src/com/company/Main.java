package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main's running");
        Thread thread;
        ArrayList<Thread> threadsList= new ArrayList<>(12);
        ArrayList<Seat> seatList= new ArrayList<>(2);
        seatList.add(new Seat());
        seatList.add(new Seat());
        for (int i = 0; i < 12; i++){
	        if(i < 2)
            {
                thread = new Thread(new Barber(seatList.get(i), i + 1));
                threadsList.add(thread);
                thread.start();
            }
	        else
            {
                thread = new Thread(new Client(seatList, i - 1));
                threadsList.add(thread);
                thread.start();
            }
        }
        System.out.println("Main's done");
    }
}
