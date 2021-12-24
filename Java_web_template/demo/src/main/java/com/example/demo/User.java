package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class User {
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;

  private String fname;

  private String  lname;
  
  private String  payment_date;

  private  Integer  p_a_salary;

  private  Float  super_rate; 
 
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getfName() {
    return fname;
  }

  public void setfName(String fname) {
    this.fname = fname;
  }

  public String getlName() {
    return lname;
  }

  public void setlName(String lname) {
    this.lname = lname;
  }

  public String get_payment_date() {
    return payment_date;
  }

  public void set_payment_date(String payment_date) {
    this.payment_date = payment_date;
  }

  public Integer get_anual_salary() {
    return p_a_salary;
  }

  public void set_anual_salary(Integer p_a_salary) {
    this.p_a_salary = p_a_salary;
  }

  
  public Float get_super_rate() {
    return super_rate;
  }

  public void set_super_rate(Float super_rate) {
    this.super_rate = super_rate;
  }
  
  
}