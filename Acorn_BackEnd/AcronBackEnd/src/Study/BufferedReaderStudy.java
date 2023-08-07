package Study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BufferedReaderStudy {

	public static void main(String[] args) throws IOException {
		/*
		 제한 조건 
		 파일 처리 : BufferedReader(FileReader) 사용 
		 검색어 : 키보드 입력받아 배열에 저장 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("찾고자 하는 단어를 입력 : ");
		String key = br.readLine();
		String tmp = "";
		List<String> input = new ArrayList<>();

		while ((tmp = br.readLine()) != null) {
			input.add(tmp);
		}
		br.close();

		int line = 0;
		for(String s : input) {
			int index = s.indexOf(key) + 1;
			line++;
			if(index != -1) {
				System.out.println((line) + "줄의 " + index + "번째에 있습니다.");
			}
		}

	}

}

