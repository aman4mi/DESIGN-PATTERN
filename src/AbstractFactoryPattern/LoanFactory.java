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
public class LoanFactory implements AbstracFactory {

    @Override
    public Bank getBank(String bankName) {

        return null;
    }

    @Override
    public Loan getLoan(String loanType) {
        if (loanType.equalsIgnoreCase("homeloan")) {
            return new HomeLoan();
        }
        if (loanType.equalsIgnoreCase("studyloan")) {
            return new StudyLoan();
        }
        return null;
    }
}
