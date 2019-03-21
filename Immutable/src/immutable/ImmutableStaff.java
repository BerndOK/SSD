/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immutable;

import java.util.ArrayList;

/**
 *
 * @author cenuser
 */
public class ImmutableStaff {
    private final ArrayList<Person> members;

    public ImmutableStaff(ArrayList<Person> members) {
        this.members = (ArrayList<Person>)members.clone();
    }
    
    public ArrayList<Person> getMembers() { return (ArrayList<Person>)members.clone(); }
    
    public String toString() {
        String result = "";
        for (Person p : members) {
            result += p + "\n";
        }
        return result;
    }
}
