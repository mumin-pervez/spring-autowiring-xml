package com.mumin.beans;

public class Employee {
  private int empId;
  private String empName;
  private Address address; // Dependency of Address class

  public int getEmpId() {
    return empId;
  }

  public void setEmpId(int empId) {
    this.empId = empId;
  }

  public String getEmpName() {
    return empName;
  }

  public void setEmpName(String empName) {
    this.empName = empName;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }
  public void displayInfo(){
    System.out.println("Id : "+empId);
    System.out.println("Name : "+empName);
    System.out.println("Address : "+address);
  }
}
