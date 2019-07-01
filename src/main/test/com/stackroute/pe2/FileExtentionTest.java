package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static com.stackroute.pe2.FileExtention.read;
import static org.junit.Assert.*;

public class FileExtentionTest {
    public FileExtention file;
    @Before
    public void setUp(){
        System.out.println("Before");
        file=new FileExtention();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        file=null;
    }
    @Test
    public void givenPathListAllFiles() throws IOException {
        String str=read(new File("/home/sahithi/Desktop/java"));
        assertEquals("File name extention retreivedFile content read",str);
    }

}