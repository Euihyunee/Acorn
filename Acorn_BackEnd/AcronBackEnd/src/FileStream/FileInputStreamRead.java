package FileStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamRead {
	private final static String FILEDIRBASE = 
			"C:\\Users\\hbi\\Desktop\\Acorn\\Acorn_BackEnd\\AcronBackEnd\\src\\FileStream\\";
	
	public static void main(String[] args) {
		String sFileName = FILEDIRBASE + "testdata.txt";

		// 파일시스템 관리자에게 iNode 요청해서
		// 파일시스템과 하드디스크 사이에 연결된 채널(스트림)정보 얻어옴
		File objFile = new File(sFileName); 
		try {
			FileInputStream fis = new FileInputStream(objFile);
			int iBiteStreamCnt = fis.available();
			while(iBiteStreamCnt>0) {
				System.out.print((char)fis.read());
				iBiteStreamCnt = fis.available();
			}
		} catch (FileNotFoundException e) {
			System.out.println("해당 파일이 존재하지 않습니다.");
//			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("입출력 에러");
			e.printStackTrace();
		}
	}

}
