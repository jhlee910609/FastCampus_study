package com.junhee.mybbs.util;

import java.io.File;
import java.io.IOException;

// util - 속성은 없고 기능(메서드)만 있는 ㅇㅇ 
// 유틸성이 있는 인터페이스는 static(전역)을 붙혀서 인터페이스화 시킴. 
public class FileUtil {

	// IOS
	public static void makeDirectoryIfNotExist(String database) {
		File dir = new File(database);
		if (!dir.exists()) {
			dir.mkdirs();/// 검사한 경로상의 모든 디렉토리 생성해줌
		}
	}

	public static File getFile(String path) {
		File database = new File(path);
		if (!database.exists()) {
			makeFile(database);
			database = new File(path);
		}
		return database;
	}

	public static void makeFile(File database) {
		try {
			
			database.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
