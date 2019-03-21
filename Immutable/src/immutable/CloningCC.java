/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package immutable;

import immutable.Address;
import immutable.Person;
import immutable.Staff;
import java.util.ArrayList;

/**
 *
 * @author cenuser
 */
public class CloningCC {
    public static void main(String[] args) throws CloneNotSupportedException {
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person("Henry", new Address(100, "1st Street", "New York", 10007)));
        list.add(new Person("Hetty", new Address(3210, "A Street W", "San Francisco", 94111)));
        StaffWithCC s = new StaffWithCC(list);

        StaffWithCC sCloned = new StaffWithCC(s);
        System.out.print("original:\n" + s);
        System.out.print("cloned:\n" + sCloned);

        list.add(new Person("Heidi", new Address(555, "Canal St", "Denver", 80217)));
        System.out.print("original:\n" + s);
        System.out.print("cloned:\n" + sCloned);
    }
}
