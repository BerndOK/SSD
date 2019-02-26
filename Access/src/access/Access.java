/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package access;

/**
 *
 * @author cenuser
 */
public class Access {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s = new Student("John",23);
        System.out.println(s);
        
        Person p = new Person("Henry");
        System.out.println(p.name);
    }
    
}
