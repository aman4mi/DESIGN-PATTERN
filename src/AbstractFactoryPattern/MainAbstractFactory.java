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
public class MainAbstractFactory {

    public static void main(String[] args) {
        String bracBankName = "brac";
        String oneBank = "one";
        AbstracFactory bankAbstracFactory = AbstractFactoryCreator.getAbstracFactory("bank");
        Bank bracBank = bankAbstracFactory.getBank(bracBankName);
        bracBank.bankName();
        
//        System.out.println("");
        String homeLoanType = "homeloan";
        AbstracFactory loanAbstracFactory = AbstractFactoryCreator.getAbstracFactory("loan");
        Loan loan = loanAbstracFactory.getLoan(homeLoanType);
        loan.loanRate();
//        System.out.println("");
    }
}
