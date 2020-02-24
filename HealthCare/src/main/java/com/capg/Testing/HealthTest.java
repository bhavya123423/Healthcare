package com.capg.Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capg.DAO.HealthDaoImpl;
import com.capg.DTO.DiagnosticCenter;

class HealthTest {
	DiagnosticCenter center= new DiagnosticCenter("tesla","250",null,null);
	HealthDaoImpl dao=new HealthDaoImpl();
	
	@Test
	public void addCenter() {
	    String centerId=center.getCenterId();
		int a=Integer.parseInt(center.getCenterId());
		assertTrue(a>0);
	
	
	}

}
