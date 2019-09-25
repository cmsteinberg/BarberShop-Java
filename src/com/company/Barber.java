package com.company;

public class Barber implements Runnable {
    private Seat seat;

    public Barber (Seat seat){
        this.seat = seat;
    }

    @Override
    public void run() {
        giveHairCut();

    }

    private void giveHairCut() {
        if(!seat.isEmpty())
        {
            System.out.println("I AM GIVING A HAIRCUT!!");
            try {
                Thread.sleep(3_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
