package com.example.demo.Entity.table;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class Tax {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;

  private String  taxable_income;

  private Double  addition_charge;
  
  private Double  charge_every_one_dollar;

  
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String get_TaxableIncome() {
    return taxable_income;
  }

  public void set_TaxableIncome(String taxable_income) {
    this.taxable_income = taxable_income;
  }

  public Double get_addition_charge() {
    return addition_charge;
  }

  public void set_additonal_charge(Double addition_charge) {
    this.addition_charge = addition_charge;
  }

  public Double get_charge_every_one_dollar() {
    return charge_every_one_dollar;
  }

  public void set_charge_every_one_dollar(Double charge_every_one_dollar) {
    this.charge_every_one_dollar = charge_every_one_dollar;
  }


  
}