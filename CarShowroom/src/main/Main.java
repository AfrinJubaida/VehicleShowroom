/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author afrin
 */
public class Main {
    public static void main(String[] args) {
        Showroom showroom = new Showroom();
        while(true) {
            System.out.println();
            System.out.println("(a) Add vehicle");
            System.out.println("(b) Remove vehicle");
            System.out.println("(c) Show all vehicle details");
            System.out.println("(d) List vehicles with expected visitor count");
            System.out.println("(e) Exit");
            
            switch(Utility.getChoice("\n Enter your choice: "))
            {
                case 'a':
                    showroom.addVehicle(); 
                    break;
                case 'b':
                    showroom.removeVehicle();
                    break;
                case 'c':
                    System.out.println("List of all vehicles in the showroom:");
                    showroom.listVehicleDetails();
                    break;
                case 'd':
                    System.out.println("List of all vehicles in the showroom:");
                    showroom.listVehicleDetails();
                    System.out.println("Expected visitor count: " + showroom.getExpectedVisitorCount());
                    break;
                case 'e':
                    System.exit(0);
            }
        }
    }
}

