import static org.junit.jupiter.api.Assertions.*;
import java.util.*;


import org.junit.jupiter.api.Test;

import com.capg.DAO.HealthDao;
import com.capg.DAO.HealthDaoImpl;
import com.capg.DTO.DiagnosticCenter;

class HealthTest {
	com.capg.DTO.Test t=new com.capg.DTO.Test("100","256");
	DiagnosticCenter center= new DiagnosticCenter();
	
	@Test
	public void addcenter() {
		HealthDao dao=new HealthDaoImpl();
		String testId=center.getCenterId();
		int a=Integer.parseInt(t.getTestId());
		assertTrue(a>0);
	}

}
