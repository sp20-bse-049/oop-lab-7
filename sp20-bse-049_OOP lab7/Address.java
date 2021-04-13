
package lab.pkg7;

import java.util.logging.Logger;


public class Address {
    private int street;
    private int house;
    private String city;
    private int code;

    public Address(int street, int house, String city, int code) {
        this.street = street;
        this.house = house;
        this.city = city;
        this.code = code;
    }
    public void setStreet(int street){
        this.street = street;
    }
    public int getStreet(){
        return street;
    }
     public void setHouse(int house){
        this.house = house;
    }
    public int getHouse(){
        return house;
    }
     public void setCode(int code){
        this.code = code;
    }
    public int getCode(){
        return code;
    }
    
     public void setCity(String city){
        this.city = city;
    }
    public String getcity(){
        return city;
    }
}
   

