package com.junhee.mybbs.view;

import com.junhee.mybbs.model.Bbs;

public class BbsDetail {

	public void showNo(long id) {
		System.out.println("글번호 : " + id);
	}

	public void showTitle(String title) {
		System.out.println("제목 : " + title);
	}

	public void showAuthor(String author) {
		System.out.println("작성자 : " + author);
	}

	public void showData(String date) {
		System.out.println("작성일자 : " + date);
	}

	public void showCount(int count) {
		System.out.println("조회수 : " + count);
	}

	public void showContent(String content) {
		System.out.println("내용 : " + content);
	}

	public void endDetail() {
		System.out.println("");
	}
/*
	// id(목록) 보여주기
	// C > P 를 바꾸기 위해선 매개변수(인자)를 뷰랑 끊어야 함.
	public void showDetail(Bbs bbs) {

		System.out.print("글번호 : " + bbs.getId());
		System.out.print("제목 : " + bbs.getTitle());
		System.out.print("작성자 : " + bbs.getAuthor());
		System.out.print("조회수 : " + bbs.getDate());
		System.out.println(bbs.getContent());
		}
**/
}