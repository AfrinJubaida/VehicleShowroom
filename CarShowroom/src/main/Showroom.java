/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author afrin
 */
public class Showroom {
    private ArrayList<Vehicle> vehicles;
    private int expectedVisitors;
    
    public void addVehicle() {
        boolean addingVehicle=true;
        while(addingVehicle)
        {
            System.out.println();
            System.out.println("(a) Normal vehicle");
            System.out.println("(b) Heavy vehicle");
            System.out.println("(c) Sports vehicle");
            char ch = Utility.getChoice("Type of vehicle to be added: ");
                    
            Vehicle vehicle = ch == 'a' ? new Vehicle() : ch == 'b' ? new HeavyVehicle() : new SportsVehicle();   
            vehicle.inputFromConsole();
            vehicles.add(vehicle);
            if(vehicle instanceof SportsVehicle) expectedVisitors+=20;
            System.out.println("Vehicle has been added" );
            System.out.println("do you want to add new vehicle : Y,N");
            if(!Utility.promptYes()) {addingVehicle=false;}
        }
    }
    
    public void removeVehicle() {
        listVehicleDetails();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the id of the vehicle to be removed: ");
        int idx = sc.nextInt()-1;
        System.out.println("Are you sure that you want to remove the following vehicle (Y/N)?");
        System.out.println(vehicles.get(idx).toString());
        if (Utility.promptYes()) vehicles.remove(idx);
    }
    
    public void listVehicleDetails() {
        int index =1;
        for(Vehicle v:vehicles){  
            System.out.println(String.valueOf(index++)+") " + v.toString());  
        }  
        
    }
    
    public Showroom() {
        vehicles = new ArrayList<Vehicle>();
        expectedVisitors = 30;
    }
    
    public int getExpectedVisitorCount() { return expectedVisitors; }
}
