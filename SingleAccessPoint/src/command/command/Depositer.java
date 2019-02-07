/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package command.command;

import command.model.BankAccount;

/**
 *
 * @author cenuser
 */
public class Depositer implements Command2<BankAccount,Integer> {
    @Override
    public Object execute(BankAccount acc, Integer amount) throws Exception {
        acc.deposit(amount);
        return true;
    }   
}