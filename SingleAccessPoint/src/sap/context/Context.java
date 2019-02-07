/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sap.context;

import java.util.HashMap;

public class Context {
    private final HashMap<String,Boolean> permitted = new HashMap<>();
    public void add(String prop) {
        permitted.put(prop,true);
    }
    public boolean get(String prop) {
        return permitted.get(prop) != null;
    }
}
