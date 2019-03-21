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
public class ModifyStaffNegative {

    private static void vicious(ImmutableStaff s) {
        ArrayList<Person> members = s.getMembers();
        members.remove(0);
    }

    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Henry", new Address(100, "1st Street", "New York", 10007)));
        list.add(new Person("Hetty", new Address(3210, "A Street W", "San Francisco", 94111)));
        ImmutableStaff s = new ImmutableStaff(list);
        System.out.print(s);

        list.add(new Person("Heidi", new Address(555, "Canal St", "Denver", 80217)));
        System.out.print(s);
        
        vicious(s);
        System.out.print(s);
    }

}
