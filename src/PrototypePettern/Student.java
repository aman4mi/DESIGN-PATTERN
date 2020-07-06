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
public class Student implements Prototype {

    public String student_Name;
    public int student_id;
    public int year;

    public Student(String student_Name, int student_id, int year) {
        this.student_Name = student_Name;
        this.student_id = student_id;
        this.year = year;
    }

    public String toString() {
        return student_Name + "  " + student_id + "  " + year;
    }

    @Override
    public Prototype getClone() {
        return new Student(student_Name, student_id, year);
    }

}
