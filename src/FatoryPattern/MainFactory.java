package FatoryPattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mehedi Hasan Tamim
 */
public class MainFactory {

    public static void main(String[] args) {
        String bracName = "BRaC";
        String oneName = "One";

        Bank bracBank = BankFactory.getBank(oneName);
        bracBank.bankName();
//        System.out.println("" + bracBank.numberOfEmployee(100));

//        Bank oneBank = BankFactory.getBank(oneName);
//        oneBank.bankName();
//        System.out.println("" + oneBank.numberOfEmployee(70));
    }

}
