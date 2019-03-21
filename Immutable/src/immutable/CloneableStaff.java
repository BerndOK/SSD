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
public class CloneableStaff implements Cloneable {
    private ArrayList<Person> members;

    public CloneableStaff(ArrayList<Person> members) {
        this.members = members;
    }
    
    public ArrayList<Person> getMembers() { return members; }
    
    public String toString() {
        String result = "";
        for (Person p : members) {
            result += p + "\n";
        }
        return result;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        CloneableStaff result = (CloneableStaff)super.clone();
        result.members = (ArrayList<Person>)members.clone();
        return result;
    }
}
