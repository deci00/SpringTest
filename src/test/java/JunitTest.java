

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import se.cirillo.main.NameService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/spring/application-config.xml")
public class JunitTest {
	
	
	
	String name = "Dennis";
	
	@Autowired
	NameService nameService;
	
	@Test
	public void getNameTest() {
		Assert.assertEquals(name, nameService.getName());
	}

}
