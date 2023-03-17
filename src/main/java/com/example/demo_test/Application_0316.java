package com.example.demo_test;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Application_0316 {

	public static void main(String[] args) throws IOException {
		String[] pwd = { "123456789", "1234567" };
		for (int i = 0; i < pwd.length; i++) {
			try {
				pwdCheck(pwd[i]);
			} catch (Exception e) {
				System.out.println("Error! " + e);
				e.printStackTrace();
			}
		}
	}

	public static void pwdCheck(String pwdStr) throws Exception{
		if (pwdStr.length() >= 5 && pwdStr.length() <= 8) {
			System.out.println("成功: " + pwdStr);
		} else {
			System.out.println("失敗: " + pwdStr);
			throw new Exception("長度不符");
		}
	}

}