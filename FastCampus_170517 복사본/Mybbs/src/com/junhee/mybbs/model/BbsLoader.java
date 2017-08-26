package com.junhee.mybbs.model;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

import com.junhee.mybbs.util.FileUtil;

public class BbsLoader {

	final String DATABASE_DIR = "/Users/JunHee/myBbs/";
	// 매직 넘버가 없으면 플레인 텍스트 파일로 컴파일됨
	// 파이널로 고정해서 상수화, 아래서 수정 불가.
	final String DATABASE_NAME = "mybbs.db";
	final String COLUMN_SEPERATOR = "@@"; // 한 칸 단위
	final String RECORD_SEPERATOR = "\r\n"; // 한 줄 단위 \n = 뉴라인
	// 카운트 넘버만 세는 데이터를 따로 모아줌
	//
	final String DATABASE_COUNT = "mybbscount.db";

	// MVP 디자인 패턴에서 'Model' 부분 작업

	/**
	 * 저장소에서 데이터를 읽어옴
	 * 
	 * @return 리턴값이 무엇인지 설명
	 */
	// read함수 한 글자씩 읽고, 저장. 읽고, 저장. 반복

	public ArrayList<Bbs> read() {

		ArrayList<Bbs> result = new ArrayList<>();

		// 1. 파일 존재 유무 검사
		File database = new File(DATABASE_DIR + DATABASE_NAME);
		if (database.exists()) {
			// 2. 있으면 파일을 읽어서 줄단위로 Bbs에 저장하고
			// 2.1 파일에 빨대를 꽂아서 읽을 준비를 함

			BufferedReader br;
			try {
				br = new BufferedReader(new InputStreamReader(new FileInputStream(database), "UTF-8"));
				String temp = "";
				// BufferedRead의 readLine : 줄 단위로 읽어와서 저장.
				// 아래 로직 결국 temp가 null인지 아닌지 알 수 있음.
				while ((temp = br.readLine()) != null) {

					String[] bbsTemp = temp.split(COLUMN_SEPERATOR);
					// Bbs 에 담고
					Bbs bbs = new Bbs();
					bbs.setId(Long.parseLong(bbsTemp[0]));
					bbs.setTitle(bbsTemp[1]);
					bbs.setAuthor(bbsTemp[2]);
					bbs.setDate(bbsTemp[3]);
					bbs.setView(Integer.parseInt(bbsTemp[4]));
					bbs.setContent(bbsTemp[5]);

					// 완성된 Bbs 를 result에 add한다. (반복)
					result.add(bbs);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			// Bbs를 다시 result에 add한다.
			// 3.
		}
		return result;
	}

	/**
	 * 저장소에 데이터를 저장
	 * 
	 * @param value
	 * 
	 */

	// 어떤 값에 대해 작성해야하기 때문에 인자필요.
	public void write(Bbs bbs) {

		// bbs에 있는 데이터를 텍스트 파일에 저장.
		// 1. 디렉토리가 있는지 검사하고 없으면 생
		FileUtil.makeDirectoryIfNotExist(DATABASE_DIR);
		// 1.1 파일이 있는지 검사하고 없으면 생성
		File database = FileUtil.getFile(DATABASE_DIR + DATABASE_NAME);

		// 2.2 bbs의 내용을 횡으로 펼친다.
		String oneData = bbs.getId() + COLUMN_SEPERATOR + bbs.getTitle() + COLUMN_SEPERATOR + bbs.getAuthor()
				+ COLUMN_SEPERATOR + bbs.getDate() + COLUMN_SEPERATOR + bbs.getView() + COLUMN_SEPERATOR
				+ bbs.getContent() + RECORD_SEPERATOR;

		// 3. 휭으로 펼쳐진 데이터를 파일의 제일 마지막줄에 저장함.
		// 3.1 FileWriter 객체를 사용해서 기존 데이터에 계속 더해쓴다.
		try {
			// FileWriter writer = new FileWriter(database, true)
			// ㄴ 두 번째 인지가 append를 허용할 것인지 여부
			Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(database, true), "UTF-8"));
			writer.append(oneData);
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public long readCount() {
		long result = 0;
		// 1. 위와 마찬가지로 디렉토리와 파일이 있는지 검사하고 없으면 먼저 생성해준다.
		// 1.1 디렉토리 검사 및 생성
		FileUtil.makeDirectoryIfNotExist(DATABASE_DIR);
		// 1.2 파일이 있는지 검사하고 없으면 생성
		File database = FileUtil.getFile(DATABASE_DIR + DATABASE_COUNT);

		try {
			FileReader fr = new FileReader(database);// 1. 읽기위한 얇은 빨대꽂기
			BufferedReader br = new BufferedReader(fr); // 2. 굵은 빨대(로 감싸주기)
			String number = br.readLine(); // 3. 한 줄만 읽어오기
			// 로직
			// 4. 읽어온 데이터에 아무 것도 없으면 result에 1 setting.
			if (number == null) {
				result = 1;
				// 5. 데이터가 있으면 숫자로 변환하고 +1 을 해서 result 에 셋팅
			} else {
				long tempNumber = Long.parseLong(number);
				result = tempNumber + 1;
			}
			fr.close();
			// 6. 데이터베이스에 최종 카운트를 저장한다.
			FileWriter fw = new FileWriter(database);
			fw.write(result + "");
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
}

/**
 * 저장소에 데이터를 저장
 * 
 * @param value
 * 
 */

// 어떤 값에 대해 작성해야하기 때문에 인자필요.
