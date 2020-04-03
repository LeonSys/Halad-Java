import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

class UserControllerTest {

	@Test
	void testSave() {
		
		NeptunCodeGenerator ncg = mock(NeptunCodeGenerator.class);
		UserService us = mock(UserService.class);
		UserDto userDto = mock(UserDto.class);
		
		UserController uc = new UserController(us,ncg);
		
		
	}

}
