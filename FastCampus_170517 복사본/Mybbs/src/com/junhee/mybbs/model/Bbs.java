package com.junhee.mybbs.model;

public class Bbs {

	// 필드에 게시판 각각 항목 정의
	private long id;
	private String title;
	private String content;
	private String author;
	private String date;
	int view;

	// Source - getter와 setter 메소드 생성
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;

	}
	
	public void plusView(int view){
		this.view = view + 1;
	}

}
