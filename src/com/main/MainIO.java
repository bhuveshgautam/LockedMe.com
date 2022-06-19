package com.main;

import java.io.IOException;
import java.util.Scanner;

import com.IOOperation.Operations;

public class MainIO {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the path of directory");
		String dir= sc.nextLine();                             //taking the path of directory as input from the user
		Operations operationsobj = new Operations(dir);         //creating an object of Operations class
		
		while(true)
		{
			System.out.println("Menu --> 1: Show files in ascending Order -- 2: File Operations -- 3: Close the file Operations");
			System.out.println("Enter 1,2,3 to choose from the Menu");
			int option = sc.nextInt();
			switch(option)
			{
			case 1: operationsobj.showFilesAscending();            //calling the showFilesAscending() function
			break;
			case 2: 
				while(true)                    //loop won't break till the user chooses to
				{
					System.out.println("Submenu --> 1: Add a file -- 2: Delete a file -- 3: Search a file -- 4: Close Submenu");
					System.out.println("Enter 1,2,3,4 to choose from the Submenu");
					int subopt = sc. nextInt();
					
					if(subopt==1)
						operationsobj.createFile();                 //calling the createFile() function
					else if(subopt==2)
						operationsobj.deleteFile();					//calling the deleteFile() function
					else if(subopt==3)
						operationsobj.searchFile();					//calling the seachFile() function
					else if(subopt==4)
						break;		                                //break out of while loop
				}
			break;
			case 3:
				System.exit(0);
				
			}
		}
	}

}
