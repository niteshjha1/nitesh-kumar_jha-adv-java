package fr.epita.tests.nitesh_kumar_jha;

import javax.inject.Inject;
import javax.inject.Named;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.epita.exam.nitesh_kumar_jha_adv_java.HibernateCheck;





@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/applicationContext.xml")
public class TestHIB1 {
	
	@Inject
	@Named("sessionFactory")
	SessionFactory sessionFactory;

	@Test
	public void testHibernateSessionFactory() throws Exception {

		Assert.assertNotNull(sessionFactory);
		
		//given
		Session session = sessionFactory.openSession();
		HibernateCheck question = new HibernateCheck();
		String expected = "What is Hibernate?";
		question.setContent(expected);
		
		//when
		session.save(question);
		
		
		//then
		HibernateCheck retrievedQuestion = session.get(HibernateCheck.class, question.getId());
		Assert.assertEquals(expected, retrievedQuestion.getContent());
		
		session.close();
		
	}

}
