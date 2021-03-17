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
public class SportsVehicle extends Vehicle {
   // private instance variables
   private String manufacturer;   

    public SportsVehicle(String model_no, int eng_power, int tire, String manufacturer) {
        super(model_no, EngineType.OIL, eng_power, tire);
        manufacturer = new String(manufacturer);
    }
    
    public SportsVehicle() { eng_type = EngineType.OIL; }
   
    public String getManufacturer() {
      return manufacturer;
   }
   public void setManufacturer(String manufacturer) {
      this.manufacturer = manufacturer;
   }
   
   @Override
   public void inputFromConsole() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter the vehicle info:");
       
       System.out.println("Enter model no.: ");
       model_no = scanner.next();
       
       System.out.println("Enter engine power: ");
       eng_power = scanner.nextInt();
       
       System.out.println("Enter tire size: ");
       tire = scanner.nextInt();
       
       System.out.println("Enter manufaturer: ");
       manufacturer= scanner.next();
   }
    
   /** Returns a self-descriptive string */
   @Override
   public String toString() {
      return "SportsVehicle: " + model_no + " + " + eng_type.name() + " + "+ eng_power +" + "+ tire + " + " + manufacturer;
   }
   
}

