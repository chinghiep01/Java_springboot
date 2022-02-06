package com.example.demo.Calculator;

public class taxcalculator {
  
 static int gross_income; 
 static int super_rate; 
 static int net_income;
 static int income_tax; 

 
    
    static int gross_income(int annual_salary) {
       gross_income =  annual_salary / 12; 
       System.out.println(gross_income);
       return gross_income;
    }

    static int income_tax (int annual_salary , int rate_per_dollar , int limits , int addition_amount ) {
        
        income_tax = (addition_amount + (annual_salary - limits)*rate_per_dollar )/12  ; 
        System.out.println(income_tax);
        return income_tax;
    }
    
    static int net_income(int annual_salary) {
        net_income =  gross_income - annual_salary; 
        System.out.println(net_income);
        return net_income;
    }
    
    static int super_rate (int rate) {
         
      super_rate = gross_income*(rate/100);
      System.out.println(super_rate);
      return super_rate;
    }
  
}
