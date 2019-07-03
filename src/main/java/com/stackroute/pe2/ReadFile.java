package com.stackroute.pe2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//This class is used to read the content of the file.
public class ReadFile {
    public static String reader(String file1) throws IOException {
    File file=new File(file1);
        String result="";
    if(!file.exists()){
        result= "File does not exists";

    }
    //It will go to the file path and reads the content of the given file.
    FileReader fr=new FileReader(file);
    int i,count=0;
    while((i=fr.read())!=-1){
        count++;
    }
    if(count==0)
        result="Empty File";
    else
        result="Read";
    return result;
    }
}
