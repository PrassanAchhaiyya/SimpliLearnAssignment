package myPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable{
	public String name;
	public int id;
	public int salary;
	public Employee(String name,int id,int salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}
	
}

public class Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/*Employee emp=new Employee("Mdara",2,3000);
		
		FileOutputStream fout=new FileOutputStream("C:\\Users\\C Prassan\\Desktop\\TablesProgram\\emp.txt");
		
		ObjectOutputStream out= new ObjectOutputStream(fout);
		
		out.writeObject(emp);
		
		out.close();
		
		System.out.println("Object saved");*/
		
		FileInputStream fin=new FileInputStream("C:\\Users\\C Prassan\\Desktop\\TablesProgram\\emp.txt");
		ObjectInputStream in = new ObjectInputStream(fin);
		Employee emp = (Employee)in.readObject();
		System.out.println(emp.name+"\n"+emp.salary+"\n"+emp.id);
	}

}
