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
public class SingleTonMain {

    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getSingleTon();
        System.out.println(singleTon);

        SingleTon singleTon1 = SingleTon.getSingleTon();
        System.out.println(singleTon1);

        SingleTon singleTon2 = SingleTon.getSingleTon();
        System.out.println(singleTon2);
    }
}
