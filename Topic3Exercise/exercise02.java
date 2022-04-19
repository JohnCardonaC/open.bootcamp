package com.company;

public class Main {

    public static void main(String[] args) {


        coche doorsNumber = new coche();
        doorsNumber.SumDoors();
        System.out.println("El coche tiene: " + doorsNumber.numDoors + " puertas");

    }

}


class coche {
    public int numDoors = 4;

    public void SumDoors (){
        this.numDoors++;
    }

}
