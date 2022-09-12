package simplonSky;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import simplonSky.entity.Admin;
import simplonSky.entity.Roles;
import simplonSky.service.AdminService;


@SpringBootTest
class MyJUnitTest {
	
//	@Autowired
//	private PasswordEncoder passwordEncoder;
	
	@Autowired
	AdminService adminService;
	
	@Test 
	public void saveadminTest()  { 

		Admin admin = new Admin();
		admin.setEmail("ayoub@");
		admin.setNom("ayoub");
		admin.setPrenom("oudor");
		admin.setTelephone("0651407776");
		admin.setRoles(Roles.ADMIN);
		admin.setCin("JM1234");
		admin.setPassword("1234");
		adminService.save(admin);
		
	}
//	   public String getEncoderPassword(String password) {
//	        return  passwordEncoder.encode(password);
//	    }

}
