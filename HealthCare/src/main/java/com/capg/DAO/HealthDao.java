package com.capg.DAO;
import java.util.List;
import com.capg.DTO.DiagnosticCenter;
import com.capg.DTO.Test;
import com.capg.HealthException.HealthException;
public interface HealthDao {
	 public	boolean addCenter(DiagnosticCenter center) throws HealthException;
	 public	boolean removeTest(Test test) throws HealthException;
	 public List<DiagnosticCenter>displaycenter()throws HealthException;
	

	 
}