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
public class Vehicle {
    
    public enum EngineType {
        OIL, GAS, DIESEL
    }
    
    public EngineType eng_type;
    public String model_no;
    public int eng_power,tire;
   
   /** Constructs a Vehicle instance  */
   public Vehicle(String model_no, EngineType eng_type, int eng_power, int tire) {
      this.model_no = model_no;
      this.eng_type = eng_type;
      this.eng_power = eng_power;
      this.tire = tire;
   }
   public Vehicle() {}
   public String getModel(){
       return model_no;
   }
   
   public String getEngType() {
      return eng_type.name();
   }
   
   public int getEngPower() {
      return eng_power;
   }
   
   public int getTire(){
       return tire; 
   }
   
   public void setEngType(EngineType eng_type) {
      this.eng_type = eng_type;
   }
   
   public void setEngPower(int eng_power) {
      this.eng_power = eng_power;
   }
   
   public void setTire(int tire) {
      this.tire = tire;
   }
   
   public void inputFromConsole() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter the vehicle info:");
       
       System.out.println("Enter model no.: ");
       model_no = scanner.next();
       
       System.out.println("Choose engine type (1-3): ");
       System.out.println("(1) Oil");
       System.out.println("(2) Gas");
       System.out.println("(3) Diesel");
       eng_type = EngineType.values()[scanner.nextInt()];
       
       System.out.println("Enter engine power: ");
       eng_power = scanner.nextInt();
       
       System.out.println("Enter tire size: ");
       tire = scanner.nextInt();
   }
   
   /** Returns a self-descriptive string */
   @Override
   public String toString() {
      return model_no + "(Normal + "+ eng_type.name() + " + "+ eng_power +" + "+ tire +")";
   }
      
    
}

