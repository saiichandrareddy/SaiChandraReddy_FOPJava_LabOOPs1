package com.GL.MainApplication;

import java.util.Scanner;

import com.GL.EmailCredentialservice.CredentialService;
import com.GL.Module.Employee;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee("Saichandrareddy", "Katukuri");
		CredentialService cs = new CredentialService();
		String generatedemail;
		String generatedpassword;
		System.out.println("Please enter the department from the following ");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int Input = sc.nextInt();
		sc.close();
		switch(Input) {
		case 1 :{
			generatedemail = cs.generateEmail(emp.getFirstName(),emp.getLastName(),"tech");
			generatedpassword = cs.generatePassword();
			cs.showCredentials(emp, generatedemail, generatedpassword);break;
		}
		case 2 :{
			generatedemail = cs.generateEmail(emp.getFirstName(),emp.getLastName(),"admin");
			generatedpassword = cs.generatePassword();
			cs.showCredentials(emp, generatedemail, generatedpassword);break;
		}
		case 3 :{
			generatedemail = cs.generateEmail(emp.getFirstName(),emp.getLastName(),"Hr");
			generatedpassword = cs.generatePassword();
			cs.showCredentials(emp, generatedemail, generatedpassword);break;
		}
		case 4 :{
			generatedemail = cs.generateEmail(emp.getFirstName(),emp.getLastName(),"Legal");
			generatedpassword = cs.generatePassword();
			cs.showCredentials(emp, generatedemail, generatedpassword);break;
		}
		}
	}

}
