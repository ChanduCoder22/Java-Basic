package com.gl.association;
class Person {
	  String name;
	  Passport passport;
	  Person(String name, Passport passport) {
	    this.name = name;
	    this.passport = passport;
	    
	  }
	}
class Passport {
	String passportNo;
	Passport(String passportNo) {
		this.passportNo = passportNo;
	}
}


	/*
	 * class Passport extends Person { String passportNo; Passport(String name,
	 * String passportNo) { super(name); this.passportNo = passportNo; } }
	 */

public class Association {

	public static void main(String[] args) {
		//Passport obj = new Passport("Divya", "99884444");
		Passport passport = new Passport("99884444");
		Person ram = new Person("Ram",passport);// passport is object reference
		System.out.println(ram.name + " is a person with a passport number: " + 
						   passport.passportNo);

	}

}
