package myPackage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ExampleApplication {

	public static void main(String[] args) throws IOException {
		// java code to read employee details from file
		var allLines = Files.readAllLines(Paths.get("C:\\Users\\C Prassan\\Desktop\\TablesProgram\\EmployeeData.txt"));
		String empId;
		boolean isFound=false;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter employee id");
		empId=obj.nextLine();
		for(var line:allLines)
		{
			var data=line.split(",");
			if(data[1].equals(empId))
			{
				System.out.println("Name :"+data[0]);
				System.out.println("Salary :"+data[2]);
				isFound=true;
				break;
			}
		}
		if(isFound==false) {
			System.out.println("Employee id not found");
			
		}
		obj.close();

	}

}
