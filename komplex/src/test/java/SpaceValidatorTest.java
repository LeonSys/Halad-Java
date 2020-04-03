import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

class SpaceValidatorTest {

	@Test
	void testisValid() {
		
		SpaceValidator sv = new SpaceValidator();
		
		
		User u =mock(User.class);
		User u1 =mock(User.class);
		
		
		when(u.getName()).thenReturn("Leon");
		when(u1.getName()).thenReturn("Leon Programozik");
		
		
		
		assertEquals(sv.isValid(u),true);
		assertEquals(sv.isValid(u1),false);
		
		
	}

}
