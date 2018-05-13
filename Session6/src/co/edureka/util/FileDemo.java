package co.edureka.util;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		
//		File file = new File("/Users/ishantkumar/Downloads/app_icon.png");
		File file = new File("/Users/ishantkumar/Downloads","app_icon.png");
		
		File file1 = new File("/Users/ishantkumar/Downloads","myappicon.png");
		//file1.delete();
		
		//File file = new File("/Users/ishantkumar/Downloads","Courses");
		if(file.exists()){
			if(file.isFile()){
				System.out.println("File "+file.getName()+" Exists !!");
				File newFile = new File("/Users/ishantkumar/Downloads","myappicon.png");
				file.renameTo(newFile);
				System.out.println(file.getName()+" renamed to "+newFile.getName());
			}
			
			if(file.isDirectory()){
				System.out.println("Directory "+file.getName()+" Exists !!");
				
				String[] names = file.list();
				for(String nm : names){
					System.out.println(nm);
				}
				
			}
		}else{
			System.out.println(file.getName()+" does not Exists !!");
		}

	}

}
