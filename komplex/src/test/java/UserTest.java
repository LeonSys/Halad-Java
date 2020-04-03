import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class UserTest {

	@Test
	void testUser() {
		
		User user = new User("Leon",true,"WMRT6F");
		User user2 = new User("Balázs",false,"TLO2VA");
		
		assertEquals(user.getName(),"Leon");	
		assertNotEquals(user.getName(),"ssadesgesg");

	
		assertEquals(user.getNeptunkod(),"WMRT6F");
		assertNotEquals(user.getNeptunkod(),"ssadsadsadsad");
		
		assertEquals(user.isEnabled(),true);
		assertNotEquals(user.isEnabled(),false);
		
		assertEquals(user2.isEnabled(),false);
		assertNotEquals(user2.isEnabled(),true);
		

		
		

		
		
	}

}
