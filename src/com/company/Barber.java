package com.company;

public class Barber implements Runnable {
    private Seat seat;
    private int barbNum;
   // private int checkedForClients;

    public Barber (Seat seat, int x)
    {
        this.seat = seat;
        barbNum = x;
       // checkedForClients = 0;
    }

    @Override
    public void run() {
        while(true)
        {
            System.out.println();
            System.out.println("I, BARBER " + barbNum + ", AM THE RUNNING THREAD!");
            System.out.println();
          //  checkedForClients++;
            giveHairCut();
     //       checkIfBarberShopsEmptyTooLong();
        }
    }
/**
    private void checkIfBarberShopsEmptyTooLong() {
        if(checkedForClients >= 8)
        {
            System.out.println();
            System.out.println("I, BARBER " + barbNum + ", CHECKED AT LEAST" +
                    "8 TIMES. I'M CLOSING");
            System.out.println();
            Thread.currentThread().interrupt();
            return;
        }
    } */

    private void giveHairCut() {
        if(!seat.isEmpty())
        {
            System.out.println("I, BARBER " + barbNum + ", AM GIVING A HAIRCUT!");
            try {
                Thread.sleep(3_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
   //         checkedForClients = 0;

        }
    }
}
