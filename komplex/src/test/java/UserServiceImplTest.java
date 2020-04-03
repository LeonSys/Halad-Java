import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class UserServiceImplTest {

	@Test
	void testsave() {
		
        UserModify userModify = mock(UserModify.class);
        List<Validator> validators = new ArrayList<>();
        
        SpaceValidator sp = mock(SpaceValidator.class);
        LengthValidator lv = mock(LengthValidator.class);
        
        validators.add(sp);
        validators.add(lv);
        
        
        User u = mock(User.class);
        
        
        UserServiceImpl userService = new UserServiceImpl(userModify, validators);
        userModify.save(u);
        
        userService.save(u);
        
        verify(userModify, times(1)).save(u);
        
        
		
		
	}

}
