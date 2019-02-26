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
public class Student extends Person {
    private int id;
    public Student(String name, int id) {
        super(name);
        this.id = id;
    }
    public String toString() {
        return name + " " + id;
    }
}
