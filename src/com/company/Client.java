package com.company;

public class Client implements Runnable {
    private Seat seat;
    private boolean haircut;
    public Client(){

    }
    public Client(Seat seat){
        haircut = false;
        this.seat = seat;
    }

    @Override
    public void run() {
        while(!haircut)
        {
            checkSeat();
        }
    }

    private void checkSeat() {
        if(seat.isEmpty())
        {
            sitInSeat();
            System.out.println("I AM GETTING A HAIRCUT!");
            haircut = true;
            try {
                Thread.sleep(3_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        else
        {
            waitForSeat();
            System.out.println("i have to wait :(");
            try {
                Thread.sleep(4_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    private void waitForSeat() {
    }

    private void sitInSeat() {
    }
}
