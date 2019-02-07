/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutable.service;

/**
 *
 * @author cenuser
 */
public class Credentials {
    private String name;    // immutable
    private Role role;
    private boolean[] privileges;
    
    private boolean conforms(int privilege, Role role) {
        // Dummy!
        return true;
    }
    
    public Credentials(String name, Role role, boolean[] privileges) {
        this.name = name;
        this.role = role;
        for (int i = 0; i < privileges.length; i++) {
            if (privileges[i] && (!conforms(i,role))) {
                throw new IllegalArgumentException("Privilege not admissibe!");
            }
        }
        this.privileges = privileges;
    }
    
    public String getName() {
        return name;
    }
    
    public boolean getPrivilege(int index) {
        if (index < 0 || index >= privileges.length) {
            throw new IllegalArgumentException("Illegal privilege: " + index);
        }
        return privileges[index];
    }
    
    public boolean[] getPrivileges() { // <-- terrible!
        return privileges;
    }
}
