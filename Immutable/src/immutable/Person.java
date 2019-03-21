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
public class Person {
    private final String name;
    private final Address address;
    
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the address
     */
    public Address getAddress() {
        return address;
    }
    
    public String toString() {
        return "Name: " + name + " Address: " + address;
    }
    
}
