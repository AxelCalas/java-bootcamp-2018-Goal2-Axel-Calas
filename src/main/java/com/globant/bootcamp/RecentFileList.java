package com.globant.bootcamp;
import java.util.ArrayList;
import java.io.*;

public class RecentFileList {
    private ArrayList<File> fileList;
    static final int MAX_SIZE = 15;
    
    public RecentFileList(){
        fileList = new ArrayList<File>();
    }
    
    public boolean emptyList() {
        return fileList.isEmpty();
    }
    
    public void add(File name) {
        if(fileList.contains(name)) {
            fileList.remove(name);
        } else if (fileList.size() == MAX_SIZE) {
            fileList.remove(0);
        }
        fileList.add(name);   
    }
    
    public int size() {
        return fileList.size();
    }
    
    public File topFile() {
        int size = fileList.size();
        size = size - 1;
		return fileList.get(size);
    }
    
}
