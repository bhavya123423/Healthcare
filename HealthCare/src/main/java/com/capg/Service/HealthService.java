package com.capg.Service;
import java.util.List;
import com.capg.DTO.DiagnosticCenter;
import com.capg.DTO.Test;
import com.capg.HealthException.HealthException;
public interface HealthService {
	public	boolean validateName(String testName) throws HealthException;
	 public	boolean addCenter(DiagnosticCenter center) throws HealthException;
	 public	boolean removeTest(Test test) throws HealthException;
	 public List<DiagnosticCenter>displaycenter()throws HealthException;
}