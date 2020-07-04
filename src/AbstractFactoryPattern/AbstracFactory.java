/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactoryPattern;

/**
 *
 * @author Mehedi Hasan Tamin
 */
interface AbstracFactory {

    Bank getBank(String bankName);

    Loan getLoan(String loanType);
}
