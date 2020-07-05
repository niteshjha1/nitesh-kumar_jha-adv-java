package fr.epita.exam.nitesh_kumar_jha_adv_java;

	import com.fasterxml.jackson.databind.MappingIterator;
	import com.fasterxml.jackson.dataformat.csv.CsvMapper;
	import com.fasterxml.jackson.dataformat.csv.CsvSchema;

	import java.io.FileReader;
	import java.io.IOException;
	import java.io.Reader;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class PersonReader {
	    private static List<Person> personList;
	    public static void main(String args[]) throws IOException {
	        String fileName="C:\\Users\\NITESH JHA\\Documents\\projects\\nitesh-kumar_jha-adv-java\\data.csv";
	        personList=readCsvFile(fileName);
	        System.out.println("Befor sorting person Data is ");
	        for(Person person:personList){
	            System.out.println(person);
	        }
	        System.out.println("<-------------------------------------->");
	        System.out.println("After sorting person Data is ");
	        personList=getSortedList(personList);
	        for(Person person:personList){
	            System.out.println(person);
	        }
	    }
	    public static List<Person> readCsvFile(String fileName) throws IOException {
	        CsvMapper csvMapper = new CsvMapper();
	        CsvSchema schema = csvMapper.schemaFor(Person.class).withHeader().withLineSeparator("\n").withColumnSeparator(',');
	        personList = new ArrayList<Person>();
	        
	        
	        Reader reader = new FileReader(fileName);
	        MappingIterator<Person> mi = csvMapper.readerFor(Person.class).with(schema).readValues(reader);
	        while (mi.hasNext()) {
	            Person current = mi.next();
	            personList.add(current);
	        }
	        return personList;
	    }
	    @SuppressWarnings("unchecked")
		public static List<Person> getSortedList(List<Person> list){
	        Collections.sort(list,new WeightComparator());
	        return list;
	    }
	}
