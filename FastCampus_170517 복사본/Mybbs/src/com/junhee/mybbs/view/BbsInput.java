package com.junhee.mybbs.view;

import java.util.Scanner;

import com.junhee.mybbs.model.Bbs;

public class BbsInput {
	// 이전에 만든 Scanner 객체를 인자로 넣어둠
	public Bbs proccess(Scanner scanner) {

		System.out.println("제목을 입력하세요.");
		String title = scanner.nextLine();
		System.out.println("작성자를 입력하세요.");
		String author = scanner.nextLine();
		System.out.println("내용을 입력하세요.");
		String content = scanner.nextLine();
		
		Bbs bbs = new Bbs();
		bbs.setTitle(title);
		bbs.setAuthor(author);
		bbs.setContent(content);

		return bbs;
	}
}

/*
 * System.out.println(" "); enter = \r\n
 */

// 객체 자체를 bbs에 넘겨줌
