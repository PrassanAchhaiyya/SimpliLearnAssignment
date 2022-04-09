package myPackage;

import java.io.FileWriter;
import java.io.IOException;

public class WritingIntoFiles {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("C:\\Users\\C Prassan\\Desktop\\TablesProgram\\WriteInto.txt",true);
		fw.write("this is madara\ni have returned");
		fw.write("\nMangekyu\nSharingan!!");
		fw.close();

	}

}
