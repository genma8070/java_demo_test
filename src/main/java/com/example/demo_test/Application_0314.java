package com.example.demo_test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Application_0314 {

	public static void main(String[] args) {
//		String str1 = "1111-111-111";
//		String str2 = "1111-1112111";
//		String str3 = "i dont love java";
////		String pattern = "\\d\\d\\d\\d-\\d\\d\\d-\\d\\d\\d";
////		String pattern = "\\d{4}-\\d{3}-\\d{3}";
//		String pattern = "\\d{4}(-\\d{3})";
//		System.out.println("iiii-iii-iii是電話號碼:  " + str1.matches(pattern));
//		System.out.println("1111-1112111是電話號碼:  " + str2.matches(pattern));
//		System.out.println("i dont love java是電話號碼:  " + str3.matches(pattern));
//
//		String str4 = "(02)-12345678";
//		String str5 = "02-12345678";
//		String pattern1 = "\\(\\d{2}\\)-\\d{8}";
//		String pattern2 = "\\(\\d{2}\\)-\\d{8}|\\d{2}-\\d{8}";
//		System.out.println("(02)-123456678是天龍電話號碼:  " + str4.matches(pattern1));
//		System.out.println("02-123456678天龍是電話號碼:  " + str5.matches(pattern2));
//		System.out.println("i dont love java是電話號碼:  " + str3.matches(pattern));
//
//		String str6 = "Johnson";
//		String str7 = "Johnnason";
//		String str8 = "Johnnanason";
//		String str9 = "John";
//		String pattern3 = "John(na)*son";
//
//		System.out.println("Johnson:  " + str6.matches(pattern3));
//		System.out.println("Johnnason:  " + str7.matches(pattern3));
//		System.out.println("Johnnanason:  " + str8.matches(pattern3));
//		System.out.println("John:  " + str9.matches(pattern3));
		
//		String str10 = "0031-12345678";
//		String str11 = "020-1234567";
//		String str12 = "0-1234567";
//		String str13 = "1263-12634567";
//		String pattern4 = "0[1-9]{1,3}-\\d{7,8}";
//		System.out.println("0031-12345678  " + str10.matches(pattern4));
//		System.out.println("020-1234567  " + str11.matches(pattern4));
//		System.out.println("0-1234567  " + str12.matches(pattern4));
//		System.out.println("1263-12634567  " + str13.matches(pattern4));
		
//		String str10 = "N212345678";
//		String str11 = "n1123456789";
//		String str12 = "n012345678";
//		String str13 = "t112345678";
//		String pattern4 = "[A-Za-z][1-2]\\d{8}";
//		System.out.println("ttt  " + str10.matches(pattern4));
//		System.out.println("ttf  " + str11.matches(pattern4));
//		System.out.println("tft  " + str12.matches(pattern4));
//		System.out.println("ftt  " + str13.matches(pattern4));
//		
//		
		
		String str0 = "A212345678";
		String str1 = "C112345678";
		String str2 = "a212345678";
		String str3 = "c112345678";
		String pattern = "[cgi-zCGI-Z][1-2]\\d{8}";
		System.out.println("ttt  " + str0.matches(pattern));
		System.out.println("ttf  " + str1.matches(pattern));
		System.out.println("tft  " + str2.matches(pattern));
		System.out.println("ftt  " + str3.matches(pattern));

	}
}