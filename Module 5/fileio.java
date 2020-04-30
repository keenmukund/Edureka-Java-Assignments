package module5;

import java.io.*;

public class fileio {

	public static void main(String[] args){
		try {
			FileInputStream fi = new FileInputStream("assignment.txt");
			FileOutputStream fo = new FileOutputStream("assignsoln.txt");
			int i;
			while((i=fi.read())!=-1) {
				fo.write(i);
			}
			fi.close();
			fo.close();
			System.out.println("Answers have been read from assignment.txt and written into assignsol.txt");
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
