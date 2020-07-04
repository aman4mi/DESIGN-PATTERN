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
interface Bank {

    void bankName();

    default int numberOfEmployee(int number) {
        return number;
    }
}
