/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.main;

import command.client.Transaction;
import command.model.BankAccount;
import java.util.logging.Level;
import java.util.logging.Logger;

public class CommandDemo {
    public static void main(String[] args) {
        try {
            BankAccount a1 = new BankAccount();
            BankAccount a2 = new BankAccount();
            a1.deposit(500);
            Transaction t = new Transaction(a1,a2,300);
            t.run();
            System.out.println(a1.getBalance());
            System.out.println(a2.getBalance());
        } catch (Exception ex) {
            Logger.getLogger(CommandDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
