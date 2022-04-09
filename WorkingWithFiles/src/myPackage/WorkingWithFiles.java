package myPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class WorkingWithFiles {

	public static void main(String[] args) throws IOException {
		//first create file object
		File f=new File("C:\\Users\\C Prassan\\Desktop\\TablesProgram\\myData.txt");
		FileReader fr= new FileReader(f);
		
		//character by character
		/*
		int i=fr.read();
		while(i != -1) {
			System.out.print((char)i);
			i=fr.read();
		}
		fr.close();
		*/
		
		//line by line
		/*
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line != null) {
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
		*/
		
		//Reading all at once using newly introduced Files class
		var result=Files.readAllLines(Paths.get("C:\\Users\\C Prassan\\Desktop\\TablesProgram\\myData.txt"));
		for(var r:result)
			System.out.println(r);
		
	}

}
