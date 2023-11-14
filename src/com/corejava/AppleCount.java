package com.corejava;

public class AppleCount {
	
	//Task  Daniel has 3 apples; Amber has 2 apples. 
	//How many apples do Daniel and Amber have together?
    public static void main(String[] args) {
        int danielApples = 3;
        int amberApples = 2;
        
        int totalApples = danielApples + amberApples;
        
        System.out.println("Daniel has " + danielApples + " apples.");
        System.out.println("Amber has " + amberApples + " apples.");
        System.out.println("Together, they have " + totalApples + " apples.");
    }
}