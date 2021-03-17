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
public class HeavyVehicle extends Vehicle {
   // private instance variables
   private double weight;   

    public HeavyVehicle(String model_no, int eng_power, int tire, double weight) {
        super(model_no, EngineType.DIESEL, eng_power, tire);
        this.weight = weight;
    }
    
    public HeavyVehicle() { eng_type = EngineType.DIESEL; }
    
    public double getWeight() {
      return weight;
   }
   public void setWeight(double weight) {
      this.weight = weight;
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
       
       System.out.println("Enter weight: ");
       weight = scanner.nextDouble();
   }
   
   /** Returns a self-descriptive string */
   @Override
   public String toString() {
      return "HeavyVehicle: " + model_no + " + " + eng_type.name() + " + "+ eng_power +" + "+ tire + " + " + weight;
   }
   
   
}
