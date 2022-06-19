package com.IOOperation;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Operations {
	
	String dir;
	File fileobj;
	
	
	public Operations(String dir)       //parameterised constructor would initialise the dir and file object
	{
		this.dir=dir;
		File fileobj = new File(dir);
		this.fileobj=fileobj;
		
	}
	
	public void showFilesAscending()
	{
		
		File files[] = fileobj.listFiles();                          //storing files in ascending order in in array of File obj
		for(File fileitr:files)                                       //iterating over each file and printing name
		{
			System.out.println(fileitr.getName());
		}
	}
	
	public void createFile() throws IOException
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file name");
		String filename=sc.next();                                     //taking file name to be created as input
		String ndir = dir+"//";
		//for display
		String path=ndir+filename;                                      //storing path of file to created
		System.out.println(path);
		
		//create a File object
		File fileobj=new File(path);                                    //creating File obj
		boolean isCreated=fileobj.createNewFile();                      //creating the file
		if(isCreated==true) {
			System.out.println("file is created");
		}
		else {
			System.out.println("file is not created");
		}

	}
	
	public void deleteFile() 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file name");
		String filename=sc.next();               //taking file name to be deleted as input
		//for display
		String ndir = dir+"//";
		String path=ndir+filename;
		System.out.println(path);
		
		//create a File object
		File fileobj=new File(path);              //creating File obj
		
		boolean isDeleted = fileobj.delete();    //deleting the file
		if(isDeleted==true) {
			System.out.println("file is deleted");
		}
		else {
			System.out.println("error in deleting the file");
		}
		
	}
	
	public void searchFile()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file name");
		String filename=sc.next();            //taking file name to be searched as input
		int flag=0;
		File files[]=fileobj.listFiles();      //storing files in ascending order in in array of File obj
		for(File fitr:files) {                 //iterating over each file linear search
			if(fitr.getName().equals(filename))        //if current file name matches the file to be searched 
			{
				flag=1;
				break;
			}
			else {
				flag=0;
			}
		}
		
		
		if(flag==1) {
			System.out.println("found the file");
		}
		else{
			System.out.println("file not found");
		}
		
	}

		
		

}
