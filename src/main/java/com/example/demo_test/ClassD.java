package com.example.demo_test;

public class ClassD {
	private ClassC classc = new ClassC();
	private String num;

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public ClassD(String num) {
		super();
		this.num = num;
	}

	public ClassC getClassc() {
		return classc;
	}

	public void setClassc(ClassC classc) {
		this.classc = classc;
	}

	public ClassD(ClassC classc) {
		super();
		this.classc = classc;
	}

	public ClassD() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void printInfo() {
		System.out.println("數:" + num);

		System.out.println("城市:" + classc.getCity());
		System.out.println("省:" + classc.getState());
		System.out.println("國:" + classc.getCountry());

	}

}
