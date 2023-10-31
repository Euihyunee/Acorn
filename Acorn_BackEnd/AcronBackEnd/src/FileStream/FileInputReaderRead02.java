package FileStream;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileInputReaderRead02 {
	private final static String FILEDIRBASE =
			"C:\\Users\\hbi\\Desktop\\Acorn\\Acorn_BackEnd\\AcronBackEnd\\src\\FileStream\\";
	private final static String sInFileName = FILEDIRBASE + "testdata1.txt";	
	
	public static void main(String[] args) {
		File objInFile = new File(sInFileName); 
		FileReader fir = null;
		
		try {
			fir = new FileReader(objInFile);
			
			int i = fir.read(); 
			while( i != -1) {
				System.out.println((char)i);
				i = fir.read();
			}
			
			fir.close();
		} catch (IOException e) { System.out.println("입출력 에러"); } 
	}
}
