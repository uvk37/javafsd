package filehandling;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ReadFile {
	public static void readDataUsingNIO() throws IOException 
	{ 
	List<String> list=Collections.emptyList(); 
	Path path= Paths.get("E:\\files\\test123.txt"); 
	list= Files.readAllLines(path,StandardCharsets.UTF_8); 
	Iterator<String> it= list.iterator(); 
	while(it.hasNext()) { 
	System.out.println(it.next()); 
	} 
	} 
	public static void main(String[] args) { 
	try { 
	readDataUsingNIO(); 
	} catch (IOException e)
	{ 
	System.out.println("File not found"); 
	} 
	}


}
