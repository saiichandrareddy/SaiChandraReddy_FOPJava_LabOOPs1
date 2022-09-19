package com.GL.EmailCredentialservice;

import java.util.Random;

import com.GL.Module.Employee;

public class CredentialService {
	public String generateEmail(String firstName,String lastName,String department) {
		return firstName + lastName +'@'+ department + "gl.com";
	}
	public String generatePassword() {
		String Uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String Lowercase = "abcdefghijklmnopqrstuvwxyz";
		String Numbers = "0123456789";
		String specialsym = "!@#$%^&*()_+";
		String Passwordset = Uppercase+Lowercase+Numbers+specialsym;
		char[] Password = new char[8];
		Random rand = new Random();
		for(int i=0 ;i<8;i++) {
			Password[i] = Passwordset.charAt(rand.nextInt(Passwordset.length()));
		}
		return new String(Password);
	}
	public void showCredentials(Employee emp,String Email,String Password) {
		System.out.println("Dear "+emp.getFirstName()+" your generated credentials are ");
		System.out.println("Email   -->" + Email );
		System.out.println("Password -->" + Password);
	}
}
