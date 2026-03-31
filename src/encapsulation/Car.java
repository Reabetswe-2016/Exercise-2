/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Bean.java to edit this template
 */
package encapsulation;


/**
 *
 * @author Reabe
 */
public class Car {
    private String companyName;
    private String ModelName;
    private int year;
    private double mileage;
    
    public Car (String companyName, String modelName, int year, double mileage){
            this. companyName = companyName;
            this. ModelName = modelName;
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
        return ModelName;
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
}
class Main {
    public static void main(String[] args){
        
        String name = "Toyota";
        Car car = new Car(name);
        car.setModelName("Starlet");
        car.setyear(2022);
        
        System.out.println("company: " + car.getcompanyName());
        System.out.println("model name: " + car.getmodelName());
        System.out.println("year: " + car.getYear());
        System.out.println("mileage: " + car.getmileage());
    }
}  