package fr.epita.tests.nitesh_kumar_jha;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import fr.epita.exam.nitesh_kumar_jha_adv_java.Person;
import fr.epita.exam.nitesh_kumar_jha_adv_java.PersonReader;


@RunWith(JUnit4.class)
public class TestJUN2 {
	
	private List<Person> personList;
    private String testFile;
    
    
    @Before
    public void setup() {
        System.out.println("Running Before class");
        personList = new ArrayList<Person>();
        testFile="C:\\Users\\NITESH JHA\\Documents\\projects\\nitesh-kumar_jha-adv-java\\data1.csv";

    }

    @Test
    public void testReadCsvFile() throws IOException {
        personList = PersonReader.readCsvFile(testFile);
        Assert.assertEquals(1,personList.size());
        Assert.assertEquals("nitesh",personList.get(0).getName());
    }
    @Test
    public void testReadGetsortedList(){
        Person person=new Person(14,5,"xyz","M",55);
        Person person1=new Person(14,6,"nitesh","M",50);
        personList.add(person);
        personList.add(person1);
        List<Person> sortedList=PersonReader.getSortedList(personList);
        Assert.assertEquals(2,personList.size());
        Assert.assertEquals("nitesh",sortedList.get(0).getName());
    }
    
    @After
    public void tearDown() {
        System.out.println("Running TearDown");
    }

	

}
