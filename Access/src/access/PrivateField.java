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
public class PrivateField {
    private String name;
    public PrivateField(String name) {
        this.name = name;
    }
    public void setName(PrivateField other) {
        name = other.name;
    }
}
