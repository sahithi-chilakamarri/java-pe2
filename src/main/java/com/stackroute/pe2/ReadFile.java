package com.stackroute.pe2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static String reader(String file1) throws IOException {
    File file=new File(file1);
    if(!file.exists()){
        return "File does not exists";

    }
    FileReader fr=new FileReader(file);
    String result="";
    int i,count=0;
    while((i=fr.read())!=-1){
        System.out.println((char)i);
        count++;
    }
        System.out.println("length="+count);
    if(count==0)
        result="Empty File";
    else
        result="Read";
    return result;
    }
}
