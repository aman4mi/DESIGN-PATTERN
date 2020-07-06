/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SingleTon;

/**
 *
 * @author Mehedi Hasan Tamim
 */
public class SingleTon {

    private static SingleTon singleTon = new SingleTon();

    private SingleTon() {
    }

    public static SingleTon getSingleTon() {

        return singleTon;
    }
}
