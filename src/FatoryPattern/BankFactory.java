/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FatoryPattern;

/**
 *
 * @author Mehedi Hasan Tamim
 */
public class BankFactory {

    public static Bank getBank(String type) { //  if you want. you can define none staic method
        if(type.equalsIgnoreCase("brac")){
            return new BracBank();
        }
         if(type.equalsIgnoreCase("ucb")){
             return new UcbBank();
        }
          if(type.equalsIgnoreCase("one")){
              return new OneBank();
        }
         
        return null;
    }
}
