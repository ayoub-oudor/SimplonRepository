package stcManager;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import stcManager.security.AppUser;
import stcManager.security.Role;
import stcManager.security.Users;
import stcManager.service.ActiviteService;
import stcManager.service.AdminService;
import stcManager.service.ExerciceService;
import stcManager.service.ParticipentService;
import stcManager.service.ResponsableService;

//@RunWith(SpringRunner.class)
//@DataJpaTest
class MyJUnitTest {

	@Autowired 
	private AdminService adminS;
	@Autowired
	private ResponsableService responsableS;
	@Autowired
	private ParticipentService participentS;
	@Autowired
	private ExerciceService exerciceS;
	@Autowired
	private ActiviteService activiteS;
	
	
	
	@Test
	public void saveAdminTest() {
//		Admin admin = Admin.builder().idadmin(1L).email("emailTest@gmail.com").nom("nomTest").prenom("prenomTest").login("Test").password("passTest").telephone("06111111").etat("active").build();
//		adminS.save(admin);
//		Assertions.assertThat(admin.getIdadmin()).isGreaterThan(0);
	}
	
	@Test
	public void addUSer() {
		Users user = new Users();
		user.setRole(Role.ADMIN);
	}
}
