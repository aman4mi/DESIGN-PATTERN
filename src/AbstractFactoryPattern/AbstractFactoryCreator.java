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
public class AbstractFactoryCreator {

    public static AbstracFactory getAbstracFactory(String type) {
        if (type.equalsIgnoreCase("bank")) {
            return new BankFactory();
        }
        if (type.equalsIgnoreCase("loan")) {
            return new LoanFactory();
        }
        return null;
    }
}
