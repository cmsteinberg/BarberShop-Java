package com.company;

import java.util.ArrayList;

public class Client implements Runnable {
    private ArrayList<Seat> seats;
    private boolean haircut;
    private int clientNum;
    public Client(){

    }
    public Client(ArrayList<Seat> seats, int x){
        haircut = false;
        this.seats = seats;
        clientNum = x;
    }

    @Override
    public void run() {
        while(!haircut)
        {
            System.out.println();
            System.out.println("I, CLIENT " + clientNum + ", AM THE RUNNING THREAD!");
            System.out.println();
            checkSeats();
        }
    }

    private void checkSeats() {
        for (int i = 0; i < seats.size(); i++)
        {
            if(!haircut && seats.get(i).isEmpty())
            {
                seats.get(i).setEmpty(false);
                getHaircut(i);
            }
        }
        if(!haircut)
        {
            waitForSeat();
        }
    }
    private void waitForSeat() {
        System.out.println("i , client " + clientNum + ", have to wait :(");
        try {
            Thread.sleep(4_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private void getHaircut(int seatNum) {
        System.out.println("I, CLIENT " + clientNum + ", AM GETTING A HAIRCUT IN SEAT " + (seatNum + 1));
        try {
            Thread.sleep(3_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("I, CLIENT " + clientNum + ", AM LEAVING!");
        haircut = true;
        seats.get(seatNum).setEmpty(true);
    }
}
