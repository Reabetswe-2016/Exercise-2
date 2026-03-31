/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package encapsulation;

/**
 *
 * @author Reabe
 */
public class car {
    private String companyName;
    private String ModelName;
    private int year;
    private double mileage;
    
    public Car (String companyName)
            this. companyName = companyName;
            this. modelName = modelName;
            this. year = year;
            this. mileage = mileage;
}
    public String getcompanyName(){
        return companyName; 
    }
    public void setcompanyName(String companyName){
        this.companyName = companyName;
    }
    public  String getmodelName(){
        return modelName;
    }
    public void setmodelName(String modelName){
        this.ModelName = modelName ;
    }
    public int getyear (){
        return year;
    }
    public void setyear (int year){
        this.year = year; 
    }
    public double getmileage (){
        return mileage;
    }
public class Main {
    public static void main(String[] args){
        Car car = new Car();
        
        car.setcompanyName("Toyota");
        car.setModelName("Starlet");
        car.setyear(2022);
        
        system.out.println("company: " + car.getcompanyName());
        system.out.println("modelname: " + car.getModelName());
        system.out.println("year: " + car.getYear());
        system.out.println("mileage: " + car.getmileage());
    }
}  
    
    