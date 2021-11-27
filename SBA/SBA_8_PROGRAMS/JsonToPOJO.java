package sba8;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToPOJO {

	@Test
	public void test_0() throws IOException,JsonProcessingException {
		
		File file = new File("src/test/java/New/user1.json");
		
		ObjectMapper om = new ObjectMapper();
		Book book = om.readValue(file, Book.class);
		System.out.println("Book ID: "+book.getBookid());
		System.out.println("Book Name: "+book.getBookname());
		System.out.println("Author: "+book.getAuthor());
		System.out.println("Book Price: "+book.getPrice());
		
	}
}
