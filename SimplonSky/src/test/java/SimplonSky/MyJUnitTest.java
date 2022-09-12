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
	public void adminTest()  { 

		Admin admin = new Admin();
		/**********save**********/
//		admin.setEmail("ayoub@gmail.com");
//		admin.setNom("ayoub");
//		admin.setPrenom("oudor");
//		admin.setTelephone("0651407776");
//		admin.setRoles(Roles.ADMIN);
//		admin.setCin("JM1234");
//		admin.setPassword("1234");
//		adminService.save(admin);
		
		admin.setEmail("youssef@gmail.com");
		admin.setNom("youssef");
		admin.setPrenom("oudor");
		admin.setTelephone("0666666666");
		admin.setRoles(Roles.RESPONSABLEBILLETS);
		admin.setCin("AB1234");
		admin.setPassword("A1B2B3");
		
		adminService.save(admin);
		/**********update**********/
//		admin.setPassword("123456789");
//		adminService.update(admin, 1);
		/**********delete**********/
		/**********get by id**********/
		/**********list**********/
	}
//	   public String getEncoderPassword(String password) {
//	        return  passwordEncoder.encode(password);
//	    }

}
