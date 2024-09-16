package com.mumin.main;

import com.mumin.beans.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("com/mumin/resources/applicationContext.xml");
    Employee empOne = (Employee) context.getBean("employeeOne");
    empOne.displayInfo();
  }

}
