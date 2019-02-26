/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statics;

/**
 *
 * @author cenuser
 */
public class Main {
    public static void main(String[] args) {
        TopClass.saySomething();
        SubClass.saySomething();
        TopClass tc = new SubClass();
        tc.saySomething();
    }
}
