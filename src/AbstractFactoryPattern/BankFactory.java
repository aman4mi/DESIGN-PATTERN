/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

/**
 *
 * @author Mehedi Hasan Tamim
 */
public class BankFactory implements AbstracFactory {

    @Override
    public Bank getBank(String bankName) {
        if (bankName.equalsIgnoreCase("brac")) {
            return new BracBank();
        }
        if (bankName.equalsIgnoreCase("one")) {
            return new OneBank();
        }
        return null;
    }

    @Override
    public Loan getLoan(String loanType) {
        return null;
    }

}
