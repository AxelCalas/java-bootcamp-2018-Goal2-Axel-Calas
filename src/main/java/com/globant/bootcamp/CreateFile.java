package com.globant.bootcamp;
import java.io.*;

public class CreateFile {
    public File newFile(String fileName){
        File file = null;
        try{
            file = new File(fileName);
        } catch (Exception exception){
            System.out.println("ERROR: The file could not be created");            
        }
        return file;
    }   
}

