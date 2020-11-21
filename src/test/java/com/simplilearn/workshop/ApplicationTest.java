package com.simplilearn.workshop;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.simplilearn.workshop.Application;

public class ApplicationTest {

	private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
	
	@Before
	public void setupStreams() {
		System.setOut(new PrintStream(outputContent));
	}
	
	public void testApplicationMai()
	{
		Application.main(null);
		try
		{
		    assertEquals("Hello world! welcome to Java" + System.getProperty("line.seperator"), outputContent.toString());
		}
		catch(Exception e)
		{
			fail("\"message\" is not \"Hello world! welcome to Java\"");
		}
	}
	
	@Test
	public void test() {
		try
		{
			new Application(); 
		}
		catch(Exception e)
		{
			fail("Constructor Failed");
		}
	}
	
    @After
	public void cleanupStreams()
	{
		System.setOut(null);
	}
}
