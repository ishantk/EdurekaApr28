package co.edureka.fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

class Student{
	
	int roll;
	String name;
	String email;
	
	Student(){
		
	}
	
	Student(int r, String n, String e){
		roll = r;
		name = n;
		email = e;
	}
	
	@Override
	public String toString() {
		return roll+","+name+","+email+"\n";
	}
}

public class FileIO {

	void readFromFile(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads","DateTimeDemo.java");
			
			FileInputStream fis = new FileInputStream(file); // Read operation as bytes...
			
			int i = 0;
			char ch = ' ';
			int count = 0;
			
			while((i = fis.read()) != -1){ // -1 represents EOF
				ch = (char)i;
				if(ch == 'D')
					count++;
				
				System.out.print(ch);
			}
			
			System.out.println("==D occurs "+count+" times==");
			
			fis.close(); // release the memory resources
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	void readFromFileAgain(){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads","DateTimeDemo.java");
			
			if(file.exists()){
			
				FileReader reader = new FileReader(file); // Read the file as text
				BufferedReader buffer = new BufferedReader(reader); // IO Chaining
				
				String line = "";
				int importCount = 0;
				
				while((line = buffer.readLine()) != null){
					System.out.println(line);
					
					if(line.startsWith("import"))
						importCount++;
				}
				
				System.out.println(importCount+" imports found in "+file.getName());
				
				buffer.close();
				reader.close(); // release the memory resources
				
			}else{
				System.out.println(file.getName()+" does not exists..");
			}
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	void writeInFile(){
		try {
			
			
			File file = new File("/Users/ishantkumar/Downloads","hello.txt");
			
			//FileOutputStream fos = new FileOutputStream(file); // Read operation as bytes...
			FileOutputStream fos = new FileOutputStream(file, true); // Read operation as bytes and append the data...
			
			String quote = "\nBe Exceptional";
			
			fos.write(quote.getBytes()); // Write Operation happens as in bytes 
			
			fos.close(); // release the memory resources
			
			System.out.println("==Data Written in "+file.getName()+"==");
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	void writeInFileAgain(){
		try {
			
			Student s1 = new Student(101,"John","john@example.com");
			Student s2 = new Student(102,"Jennie","jennie@example.com");
			
			
			//File file = new File("/Users/ishantkumar/Downloads","Hello.java");
			File file = new File("/Users/ishantkumar/Downloads","students.csv");
			
			FileWriter writer = new FileWriter(file);
			//FileWriter writer = new FileWriter(file,true); Append Mode
			
			//String data = "public class Hello{\n\n\tpublic static void main(String[] args){\n\n\t}\n\n}";
			//String moreData = "=======";
			
			writer.write(s1.toString());
			writer.write(s2.toString());
			
			writer.close(); // release the Memory
			
			System.out.println("==Data Written in "+file.getName()+"==");
			
			// ObjectOutputStream and ObjectInputStream
			
		} catch (Exception e) {
			System.out.println("Some Exception: "+e);
		}
	}
	
	public static void main(String[] args) {
		FileIO io = new FileIO();
		//io.readFromFile();
		//io.readFromFileAgain();
		//io.writeInFile();
		io.writeInFileAgain();
	}

}
