/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototypePettern;

/**
 *
 * @author Mehedi Hasan Tamim
 */
public class PrototypeMain {

    public static void main(String[] args) {
        Student s1 = new Student("tamim", 12, 0);
        System.out.println(s1.toString());

        Student s2 = (Student) s1.getClone();
        System.out.println(s2.student_Name);
    }
}
