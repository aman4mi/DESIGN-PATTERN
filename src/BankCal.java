/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehedi Hasan Tamim
 */
public class BankCal {

    public static void main(String[] args) {
        Fctory fctory = new Fctory();

        Interest interest = fctory.getInterest("b");
        interest.add();
    }

}

interface Interest {

    void add();
}

class A implements Interest {

    int a = 10;
    int b = 10;

    @Override
    public void add() {
        System.out.println(a + b);
    }
}

class B implements Interest {

    int a = 10;
    int b = 20;

    @Override
    public void add() {
        System.out.println(a + b);
    }
}

class Fctory {

    public Interest getInterest(String choice) {

        if (choice.equalsIgnoreCase("a")) {
            return new A();
        }
        if (choice.equalsIgnoreCase("b")) {
            return new B();
        }
        return null;
    }
}
