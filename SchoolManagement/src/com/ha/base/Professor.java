package com.ha.base;

public class Professor extends Person {

	private String profId;
	private  String profDepID;
	private String profDepName;
	private double profExp;
	
	public Professor() {
		
		Professor p1 = new Professor();
		p1.profId = "P1001";
		p1.profDepID="DP101";
		p1.profDepName = "ECE";
		p1.profExp = 10;
		
		
		Professor p2 = new Professor();
		p2.profId = "P1002";
		p2.profDepID="DP102";
		p2.profDepName = "CSE";
		p2.profExp = 10;
		
		Professor p3 = new Professor();
		p3.profId = "P1003";
		p3.profDepID="DP103";
		p3.profDepName = "Mech";
		p3.profExp = 10;
		
	} 	
//	 public String professorDetail() {
//		 
//		 System.out.println(profId);
//		 System.out.println(profDepID);
//		 System.out.println(profDepName);
//		 System.out.println(profExp);
//		 
//	 }
//	

}
