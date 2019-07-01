package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static com.stackroute.pe2.ReadFile.reader;
import static org.junit.Assert.*;

public class ReadFileTest {
    public ReadFile text;

    @Before
    public void setUp() {
        System.out.println("Before");
        text = new ReadFile();

    }
    @After
    public void tearDown() {
        System.out.println("After");
        text = null;
    }
   @Test
   public void givenOneFileShouldReturnLengthAndReadFile() throws IOException {
      String result=text.reader("/home/sahithi/Desktop/sah/file");
        assertEquals("Read",result);
    }
    @Test
    public void givenOneEmptyFileShouldReturnEmptyFile()throws IOException{
       String result=text.reader("/home/sahithi/Desktop/sah/empty");
        assertEquals("Empty File",result);

    }
    @Test
    public void givenOneImageFileShouldReturnError() throws IOException{
       String result=reader("/kamal/desktop");
       assertEquals("File does not exists",result);

   }

}