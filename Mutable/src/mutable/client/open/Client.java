/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mutable.client.open;

import mutable.service.open.Credentials;
import mutable.service.open.Role;

/**
 *
 * @author cenuser
 */
public class Client {
    public static void main(String[] args) {
        boolean[] myPrivileges = {true, true, true, false, false, true};
        Credentials c = new Credentials("Me", Role.MANAGER, myPrivileges);
        // break the conformance test
        System.out.println(c.getPrivilege(3));
        boolean[] p = c.getPrivileges();
        p[3] = true;
        System.out.println(c.getPrivilege(3));
    }
}
