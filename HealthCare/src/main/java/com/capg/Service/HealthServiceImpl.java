package com.capg.Service;
import java.util.Date;
import java.util.List;
import java.util.Random;
import com.capg.DAO.HealthDao;
import com.capg.DAO.HealthDaoImpl;
import com.capg.DTO.DiagnosticCenter;
import com.capg.DTO.Test;
import com.capg.HealthException.HealthException;
public class HealthServiceImpl implements HealthService{
    private HealthDao healthDao;
	public HealthServiceImpl()
	{
	 healthDao = new HealthDaoImpl();
	}
	public boolean validateName(String testName) throws HealthException {
		boolean flag =false;
		flag=testName.matches("[a-zA-Z]+");
		return flag;
		}

	public boolean addCenter(DiagnosticCenter center) throws HealthException {
		String name = center.getCenterName();
		boolean flag =name.matches("[a-zA-Z]+");
		if(!flag)
		{
	   throw new HealthException("Center name should contain only alphabets");
		}
		Random random = new Random();
		int centerid = random.nextInt(100)+1000;
		String s=Integer.toString(centerid);
		center.setCenterId(s);
		healthDao.addCenter(center);
		return false;
	}
	public boolean removeTest(Test test) throws HealthException {
		return healthDao.removeTest(test);
	}

	public List<DiagnosticCenter> displaycenter() throws HealthException {
		return healthDao.displaycenter();
}
}
	