/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import injection.*;
import java.util.Scanner;

public class Injection {

    private static String getString(Scanner inp) {
        System.out.print("Customer ID (empty 0 to exit): ");
        return inp.nextLine();
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String custID = getString(inp);
        while (!custID.equals("")) {
            try {
                System.out.println(CustomerAdmin.getCustomer(custID));
            } catch (Exception ex) {
                System.out.println("Not found!");
            }
            custID = getString(inp);
        }
        inp.close();
    }
}
