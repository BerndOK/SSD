/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BadArray;

import java.util.ArrayList;

/**
 *
 * @author cenuser
 */
public class BadArrayDemo {
    public static void main(String[] args) {
        Pet[] shelter1 = new Dog[15];
        shelter1[0] = new Cat();
        
        // ArrayList<Pet> shelter2 = new ArrayList<Dog>();
        // shelter2.add(new Cat());
    }
}
