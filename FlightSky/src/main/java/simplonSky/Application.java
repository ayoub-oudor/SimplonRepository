package simplonSky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {
	


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	                                                    
//	@Autowired
//	AdminService adminService;
	
//	public void run(String... args) throws Exception {
//		Admin admin = new Admin();
//		admin.setEmail("ayoub@");
//		admin.setNom("ayoub");
//		admin.setPrenom("oudor");
//		admin.setTelephone("0651407776");
//		admin.setRoles(Roles.ADMIN);
//		admin.setCin("JM1234");
//		admin.setPassword("1234");
//		adminService.save(admin);
//	}
}
