package com.prodapt.WA2;

public class TestController {

	public static void main(String[] args) {
Employee obj=new Employee("Meher", 21, "ASE Delivery");
HR_Manager o1=new HR_Manager();
obj=o1.dispRecords(obj);
o1.processRecords();

Employee x=new Employee("Sravanth", 21, "ASE Delivery");
x=o1.dispRecords(x);
o1.processRecords();

Employee z=new Employee("Ramesh", 50, "Delivery Head");
z=o1.dispRecords(z);
o1.processRecords();

Employee b=new Employee("Suresh", 47, "Project Manager");
b=o1.dispRecords(b);
o1.processRecords();

Employee a=new Employee("Mahesh", 57, "Team Lead");
a=o1.dispRecords(a);
o1.processRecords();


	}

}
