/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import exceptions.library.Library;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cenuser
 */
public class Exceptions {

    public static void main(String[] args) {
        try {
            Library l = new Library();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
