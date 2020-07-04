/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mehedi Hasan Tamim
 */
public class GenerateBill {

    public static void main(String[] args) {
        PlanFactory factory = new PlanFactory();
        int bill = 10;
        String planType = "DomesticPlan";
        FctoryPattern fctoryPattern = factory.getFctoryPattern(planType);
        fctoryPattern.calculateBill(bill);
        fctoryPattern.getRate();
    }
}

abstract class FctoryPattern {

    protected double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(rate * units);
    }
}

class DomesticPlan extends FctoryPattern {

    @Override
    public void getRate() {
        rate = 3.50;
    }
}

class CommercialPlan extends FctoryPattern {

    @Override
    public void getRate() {
        rate = 7.50;
    }
}

class InstitutionalPlan extends FctoryPattern {

    @Override
    public void getRate() {
        rate = 5.50;
    }
}

class PlanFactory {

    public FctoryPattern getFctoryPattern(String planType) {

        if (planType == null) {
            return null;
        }

        if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
            return new DomesticPlan();
        }

        if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
            return new CommercialPlan();
        }

        if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
            return new InstitutionalPlan();
        }

        return null;
    }

}
