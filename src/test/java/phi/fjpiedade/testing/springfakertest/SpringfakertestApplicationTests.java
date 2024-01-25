package phi.fjpiedade.testing.springfakertest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringfakertestApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	void testCreateUser() {

		var user = Factories.createNewUser();
		System.out.println(user);

		//var user = new User("e.takando","password","Ensei Tankado", "ensei.tankado@phi.pt");
		userService.createUser(user);
		var userFound = userService.findByUsername(user.username());
		assertEquals(user, userFound);
	}

	//https://github.com/DiUS/java-faker

}
