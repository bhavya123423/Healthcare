package com.capg.DAO;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import com.capg.DTO.Appointment;
import com.capg.DTO.DiagnosticCenter;
import com.capg.DTO.Test;
import com.capg.HealthException.HealthException;
public class HealthDaoImpl implements HealthDao {
HashMap<String,DiagnosticCenter> centerMap;
HashMap<String,Appointment> appointmentMap;
		public HealthDaoImpl()
		{
			centerMap=new HashMap<String,DiagnosticCenter>();
			/*appointmentMap=new HashMap<String,Appointment>();*/
			DiagnosticCenter center= new DiagnosticCenter("apollo","8001", null,null);
			List<Test>list=new ArrayList<Test>();
			Test test=new Test();
			test.setTestId("1000");
			test.setTestName("blood test");
			list.add(test);
			Test test1=new Test();
			test1.setTestId("1001");
			test1.setTestName("blood group");
			list.add(test1);
			Test test2=new Test();
			test2.setTestId("1002");
			test2.setTestName("blood pressure");
			list.add(test2);
			center.setListOfTests(list);
			centerMap.put(center.getCenterId(), center);
			
		}
	@Override
	public boolean addCenter(DiagnosticCenter center) throws HealthException 
		{
		if(centerMap.containsKey(center.getCenterName()))
			try
			{
				throw new HealthException("center already exist");
			}
			catch(HealthException e)
			{
				e.printStackTrace();
			}
			else
			{
				List<Test>list=new ArrayList<Test>();
				Test test=new Test();
				test.setTestId("1000");
				test.setTestName("blood test");
				list.add(test);
				Test test1=new Test();
				test1.setTestId("1001");
				test1.setTestName("blood group");
				list.add(test1);
				Test test2=new Test();
				test2.setTestId("1002");
				test2.setTestName("blood pressure");
				list.add(test2);
				center.setListOfTests(list);
			    centerMap.put(center.getCenterId(), center);
			    
		}
	return true; 
		}
	@Override
	public boolean removeTest(Test testId) throws HealthException {
		HashMap<String,Integer> mymap=new HashMap<String,Integer>();
		mymap.put("ECG",1);
        mymap.put("ENT",2);
		mymap.put("Thyroid",3);
		System.out.println(mymap);
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the test to be removed");
		String t=scanner.next();
		 mymap.remove(t);
		System.out.println(mymap);
		return true;
	}
	@Override
	public List<DiagnosticCenter> displaycenter() throws HealthException {
		Collection<DiagnosticCenter> col=centerMap.values();
		List<DiagnosticCenter> list=new ArrayList<DiagnosticCenter>(col);
		return list;
	}
}
	