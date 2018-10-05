package com.globant.bootcamp;
import java.io.*;
import org.junit.Test;
import static org.junit.Assert.*;
    
public class RecentFileListTest {
	private RecentFileList recentFileList;
    private CreateFile createfile;
    
	@Test
	public void whenInitTheProgramThenTheListIsEmpty () {
		recentFileList = new RecentFileList();
		assertTrue(recentFileList.emptyList());
	}

	@Test
	public void whenFileIsOpenedThenIsAddedToTheList() {
		recentFileList = new RecentFileList();
		createfile = new CreateFile();
		
		File file = createfile.newFile("TestFile1.txt");
		
		recentFileList.add(file);
		assertEquals(file,recentFileList.topFile());
	}
	
	@Test
	public void whenAddExistingFileThenIsNotDuplicated() {
	    recentFileList = new RecentFileList();
	    createfile = new CreateFile();
	    
		File file1 = createfile.newFile("TestFile1.txt");
		File file2 = createfile.newFile("TestFile2.txt");
		File file3 = createfile.newFile("TestFile3.txt");
		File file4 = createfile.newFile("TestFile4.txt");
		
		recentFileList.add(file1);
		recentFileList.add(file2);
		recentFileList.add(file3);
		recentFileList.add(file4);
		recentFileList.add(file1);
		
		assertEquals(4,recentFileList.size());
	}
	
	@Test
	public void whenAddExistingFileThenIsBumpedToTop() {
		recentFileList = new RecentFileList();
		createfile = new CreateFile();
		
		File file1 = createfile.newFile("TestFile1.txt");
		File file2 = createfile.newFile("TestFile2.txt");
		File file3 = createfile.newFile("TestFile3.txt");
		File file4 = createfile.newFile("TestFile4.txt");
		
		recentFileList.add(file1);
		recentFileList.add(file2);
		recentFileList.add(file3);
		recentFileList.add(file4);
		recentFileList.add(file1);
		
		assertEquals(file1,recentFileList.topFile());
	}
	
	@Test
	public void whenAddMoreThan15FilesThenIsRemovedTheOldest() {
		recentFileList = new RecentFileList();
		createfile = new CreateFile();
		
		File file1 = createfile.newFile("TestFile1.txt");
		File file2 = createfile.newFile("TestFile2.txt");
		File file3 = createfile.newFile("TestFile3.txt");
		File file4 = createfile.newFile("TestFile4.txt");
		File file5 = createfile.newFile("TestFile5.txt");
		File file6 = createfile.newFile("TestFile6.txt");
		File file7 = createfile.newFile("TestFile7.txt");
		File file8 = createfile.newFile("TestFile8.txt");
		File file9 = createfile.newFile("TestFile9.txt");
		File file10 = createfile.newFile("TestFile10.txt");
		File file11 = createfile.newFile("TestFile11.txt");
		File file12 = createfile.newFile("TestFile12.txt");
		File file13 = createfile.newFile("TestFile13.txt");
		File file14 = createfile.newFile("TestFile14.txt");
		File file15 = createfile.newFile("TestFile15.txt");
		File file16 = createfile.newFile("TestFile16.txt");
		
		recentFileList.add(file1);
		recentFileList.add(file2);
		recentFileList.add(file3);
		recentFileList.add(file4);
		recentFileList.add(file5);
		recentFileList.add(file6);
		recentFileList.add(file7);
		recentFileList.add(file8);
		recentFileList.add(file9);
		recentFileList.add(file10);
		recentFileList.add(file11);
		recentFileList.add(file12);
		recentFileList.add(file13);
		recentFileList.add(file14);
		recentFileList.add(file15);
		recentFileList.add(file16);
	
		assertEquals(15,recentFileList.size());
	}
    
}
