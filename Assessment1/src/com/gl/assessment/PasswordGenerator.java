package com.gl.assessment;
import java.util.Random;

public class PasswordGenerator {
	
	
	 String generatePassword() {
		
		String capital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String small = "abcdefghijklmnopqrstuvwxyz";
		String number = "01234567890";
		String symbol = "!@#$%*_.";
		
		String pass = capital+small+number+symbol;
		
		Random random = new Random();
		
		
		String password = "";
		
		for(int i=0;i<8;i++)
		{
		
		password += pass.charAt(random.nextInt(pass.length()));
		
		}
		
		return password;
		
		
	}
	
	

}
