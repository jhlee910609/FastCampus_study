package com.junhee.mybbs.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

import com.junhee.mybbs.MybbsMain;
import com.junhee.mybbs.model.Bbs;
import com.junhee.mybbs.model.BbsLoader;

public class BbsList {

	// mvp 중 view에 해당되는 클래스
	// 목록 데이터 불러와서 화면에 뿌리기
	public void showList(ArrayList<Bbs> datas) {

		for (Bbs bbs : datas) {
			System.out.print(bbs.getId() + "|");
			System.out.print(bbs.getTitle() + "|");
			System.out.print(bbs.getAuthor() + "|");
			System.out.print(bbs.getDate() + "|");
			System.out.println(bbs.getView() + "");
		}
	}

	// 쓰기 이동
	public void goWrite() {

	}

	// 검색 기능
	public void search(String word) {

	}

	// 삭제기능
	// 내가 한 것.
	// 글 목록 삭제
	
	public void removeContent() {
		// 굳이 read(); 할 필요 없이 할 수 
		System.out.print("======[1] 삭제하기 [2] 메뉴로 돌아가기======");
		
		Scanner scan = new Scassssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssssnner(System.in);
		int answer = scan.nextInt(); // 삭제할 id값 ;
		
		BbsLoader loader = new BbsLoader();
		ArrayList<Bbs> pastList = new ArrayList<Bbs>();
		pastList = loader.read();
		
		// myBbs.db 를 리드 함. 배열 전체를 받아옴 
		
		// 리턴을 받는다. pastList
		while(true) {
			if(pastList.)
			
			
		}
		
		
		
		
		ArrayList<Bbs> result = new ArrayList<>();
	}

/*
 * for (int i = 0; i < tempList.size(); i++) { if (deleteNum ==
 * tempList.get(i).getId()) { tempList.remove(i); }
 */

}
