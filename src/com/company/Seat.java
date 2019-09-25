package com.company;

public class Seat {
    private boolean isEmpty;

    public Seat(){
        isEmpty = true;
    }
    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
