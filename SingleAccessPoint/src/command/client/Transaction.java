/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.client;

import command.command.Command2;
import command.command.Depositer;
import command.command.Withdrawer;
import command.model.BankAccount;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cenuser
 */
public class Transaction {
    BankAccount a1;
    BankAccount a2;
    int amount;
    List<Command2> program;
    public Transaction(BankAccount a1, BankAccount a2, int amount) {
        this.a1 = a1;
        this.a2 = a2;
        this.amount = amount;
        program = new ArrayList<>();
        program.add(new Withdrawer());
        program.add(new Depositer());
    }
    
    public void run() throws Exception {
        program.get(0).execute(a1,amount);
        program.get(1).execute(a2,amount);
    }
    
}
