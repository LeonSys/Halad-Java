import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import java.util.List;

class UseRepositoryTest {

	@Test
	void testfindAll() {
		
		UseRepository ur = new UseRepository();
		
		
		User u = mock(User.class);
		User u2 = mock(User.class);
		
		ur.save(u);
		ur.save(u2);
		when(u.getName()).thenReturn("Leon");
		
		assertEquals(ur.findAll().get(0).getName(),"Leon");

	}

	
	@Test
	void testfindByEnabledIsTrue() {
		
		UseRepository ur = new UseRepository();
		
		
		User u = mock(User.class);
		User u2 = mock(User.class);
		
		ur.save(u);
		ur.save(u2);
		when(u.getName()).thenReturn("Leon");
		when(u.isEnabled()).thenReturn(true);
		
		assertEquals(ur.findByEnabledIsTrue().get(0).getName(),"Leon");
	}
	
	@Test
	void testgetByNeptunKod() {
		
		UseRepository ur = new UseRepository();
		
		
		User u = mock(User.class);
		
		ur.save(u);
		
		when(u.getName()).thenReturn("Leon");
		when(u.getNeptunkod()).thenReturn("WMRT6F");
		when(u.isEnabled()).thenReturn(true);
		
		assertEquals(ur.getByNektunKod("WMRT6F"),u);
		
		assertEquals(ur.getByNektunKod("wfawfaw"), null);
		
		
		
		
	
	}

}
