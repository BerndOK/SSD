/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immutable;

/**
 *
 * @author cenuser
 */
public class Address {
    private final int houseNumber;
    private final String street;
    private final String city;
    private final int zip;
    
    public Address(int houseNumber, String street, String city, int zip) {
        this.houseNumber = houseNumber;        
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    /**
     * @return the houseNumber
     */
    public int getHouseNumber() {
        return houseNumber;
    }

    /**
     * @return the street
     */
    public String getStreet() {
        return street;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @return the zip
     */
    public int getZip() {
        return zip;
    }
    
    public String toString() {
        return "" + houseNumber + " " + street + ", " + city + ", " + zip;
    }
}
