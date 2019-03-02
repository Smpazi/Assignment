package createappwithintefacespring.service;

import createappwithintefacespring.LoanInterest;

import java.util.ArrayList;

public class SmallBusinesses implements LoanInterest {
    private String name;
    private String registerNum;
    private double loanAmount;

    public SmallBusinesses(String nm, String regNum, double amt){
        name =nm;
        registerNum = regNum;
        loanAmount = amt;
    }
    public String toString(){
        return "\nName: "+name+"\nRegNum: "+registerNum+"\nAmount: "+loanAmount;
    }

    @Override
    public double getInterest() {
        double loanDue;
        loanDue = loanAmount*0.15;
        return loanDue;
    }

    public static void main(String[]args){
        ArrayList<LoanInterest> loanObjects = new ArrayList<>();

        loanObjects.add(new SmallBusinesses("Salomi","mp123",800));


        for (LoanInterest loanObject : loanObjects) {
            System.out.print(loanObject);
            System.out.print("\npayment due: " + loanObject.getInterest() + "\n");
        }

    }

}
