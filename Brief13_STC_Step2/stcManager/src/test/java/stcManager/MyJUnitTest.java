package stcManager;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import stcManager.entity.Admin;
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

}
