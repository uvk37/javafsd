package filehandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class Filehandling {
	public static void createFileUsingNIO() throws IOException{
		Path path= Paths.get("E:\\files\\test123.txt");
		String input="HI";
		byte array[]=input.getBytes();
		Files.write(path, array, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		Path path1 = Paths.get("E:\\files\\test123.txt");	 
		List<String> list = Arrays.asList("\nHELLO", "WELCOME");
		Files.write(path1, list, StandardOpenOption.CREATE, 
		StandardOpenOption.APPEND);
		System.out.println("Data Written Successfully");
		}
		public static void main(String[] args) {
		try {
		createFileUsingNIO();
		} catch (IOException e) { 
		e.printStackTrace();
		}
		}
		
	}


