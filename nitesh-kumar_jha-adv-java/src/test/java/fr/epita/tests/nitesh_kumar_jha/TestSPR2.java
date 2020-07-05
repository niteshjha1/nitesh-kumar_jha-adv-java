package fr.epita.tests.nitesh_kumar_jha;

import static org.junit.Assert.*;

import javax.inject.Inject;
import javax.inject.Named;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestSPR2 {

	@Inject
	@Named("myFirstBean")
	String text;
	
	@Test
	public void testMyFirstBean() throws Exception {

		Assert.assertNotNull(text);
		System.out.println(text);
		
		
		
	}
	
	

}
