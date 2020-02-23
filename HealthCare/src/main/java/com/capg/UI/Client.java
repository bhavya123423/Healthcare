package com.capg.UI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.capg.DTO.DiagnosticCenter;
import com.capg.DTO.Test;
import com.capg.HealthException.HealthException;
import com.capg.Service.HealthService;
import com.capg.Service.HealthServiceImpl;
public class Client {
	public static void main(String[] args) throws HealthException {
		Scanner scanner=new Scanner(System.in);
		HealthService healthservice=new HealthServiceImpl();
		ArrayList<Test>listofTests =new ArrayList<Test>();
		HashMap<String,Integer> mymap=new HashMap<String,Integer>();
		mymap.put("ECG",1);
	
		mymap.put("ENT",2);
		mymap.put("Thyroid",3);
		int choice=0;
		Test test=new Test();
		while(choice!=4)
		{		
			
		System.out.println("1.Add Center");
		System.out.println("2.Display Center");
		System.out.println("3.Remove Test");
		System.out.println("4.exit");
		System.out.println("Enter choice");
		try{
			choice = scanner.nextInt();
		}
		catch(InputMismatchException e) {
			System.err.println("Input should be in Integer");
			break;}
		 
		
		
		
		switch(choice)
		{
		case 1:
			try
			{
				DiagnosticCenter dc=new DiagnosticCenter();
			System.out.println("Enter center name");
			scanner.nextLine();
			String centerName=scanner.nextLine();
			dc.setCenterName(centerName);
			healthservice.addCenter(dc);
			String centerId=dc.getCenterId();
			System.out.println("centerid="+centerId);
			System.out.println("Center added sucesfully" +centerId);
			}
			catch(Exception er)
			{
				System.err.println(er.getMessage());
			}
			break;
		case 2:
			try
			{
				scanner.nextLine();
			List<DiagnosticCenter>l=healthservice.displaycenter();
			for(DiagnosticCenter d:l)
			{
				String ci=d.getCenterId()+" "+d.getCenterName();
				System.out.println(ci);
			
				List<Test> t=d.getListOfTests();
					for(Test y:t)
				{
					String tid=y.getTestId();
					String tname=y.getTestName();
					System.out.println(tid+"."+tname);
				}			
			}}
			
			catch(Exception err)
			{
				System.err.println(err.getMessage());
			}
			break;
			case 3:
				healthservice.removeTest(test);
				boolean flag= mymap.containsKey(test);
				if(!flag)
				{
					System.out.println("Test is not present");
				}
				break;
			default :
				System.out.println("Thank you");
				
	        	
	
		
		
		}
		
	
		}}}
		
	



