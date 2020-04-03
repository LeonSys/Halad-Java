import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
class LengthValidatorTest {

	@Test
	void testIsValid() {
		LengthValidator lv = new LengthValidator();
		User u =mock(User.class);
		User u1 =mock(User.class);
		
		when(u.getName()).thenReturn("Leon");
		when(u1.getName()).thenReturn("Leonkaprogramozik");
		
		assertEquals(lv.isValid(u),false);
		assertEquals(lv.isValid(u1),true);
	}

}
