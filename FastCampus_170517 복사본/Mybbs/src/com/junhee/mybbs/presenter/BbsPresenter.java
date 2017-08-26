package com.junhee.mybbs.presenter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

import com.junhee.mybbs.model.Bbs;
import com.junhee.mybbs.model.BbsLoader;
import com.junhee.mybbs.view.BbsDetail;
import com.junhee.mybbs.view.BbsInput;
import com.junhee.mybbs.view.BbsList;

public class BbsPresenter {
	// 데이터 임시 저장소.
	ArrayList<Bbs> datas;
	final boolean START = true;
	final boolean FINISH = false;
	boolean runFlag = START;

	// 객체도 필드값으로 선언

	public Scanner scanner;
	public BbsInput input;
	public BbsList list;
	public BbsDetail detail;
	public BbsLoader loader;
	long number = 0;

	// 생성자는 리턴 타입 없어도 됨.
	// 하지만 모든 메서드는 리턴 타입 있어야 함. (void라도 써야함)
	// 생성자 - BbsPresenter 객체 생성 시, 동시에 초기
	public BbsPresenter() {

		init();
	}

	/**
	 * 초기화 함수 : 사용할 객체들을 미리 메모리에 로드해둠
	 */

	private void init() {
		datas = new ArrayList<>();
		scanner = new Scanner(System.in);
		input = new BbsInput();
		list = new BbsList();
		detail = new BbsDetail();
		loader = new BbsLoader();
	}

	public void start() {
		// 옛날 사람들이 선호하는 방식
		// init();
		// 커맨드의 입력값 저장
		while (runFlag) {
			System.out.println("--------- 프로그램이 시작되었습니다.---------");
			System.out.println("명령어를 입력하세요. [ l : 목록, w : 쓰기, r : 상세보기 ]");
			String command = scanner.nextLine();

			// while문 안의 new 사용
			// 목록 안에서 데이터를 만들 때, new 사용 가능.
			switch (command) {
			case "l":
				// datas의 리스트를 보여줌
				datas = loader.read();
				list.showList(datas);
				list.removeContent();
				
				
				break;

			case "w":
				write();
				break;

			case "r":
				goDetail();
				break;
			}
		}
	}

	public void write() {
		// datas.add(input.process(scanner));
		Bbs bbs = input.proccess(scanner);
		// 기준이 필요한 변수는 static 변수로 사용.

		// 고침 ------ number = number+1
		// 데이터가 줄면 문제가 있음.
		// number = number + 1;
		number = loader.readCount();
		bbs.setId(number);
		bbs.setDate(getDate());

		loader.write(bbs);
		// datas.add(bbs);
	}

	private String getDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		long currentTime = System.currentTimeMillis();
		return sdf.format(currentTime);

	}

	// 상세보기 로 이동. (위에서 만든 목록)
	// Bbs 클래스 필드값 long id;
	public void goDetail() {
		System.out.println("글번호를 입력하세요.");
		String temp = scanner.nextLine();
		long id = Long.parseLong(temp);
		for (Bbs bbs : datas) {
			if (bbs.getId() == id) {
				// 뷰와 프레젠터 종속 관계 끊기
				// 종속 관계가 없고, 독립적인 메서드 일 수록 좋은 코딩.
				detail.showNo(bbs.getId());
				detail.showTitle(bbs.getTitle());
				detail.showAuthor(bbs.getAuthor());
				detail.showData(bbs.getDate());
				detail.showCount(bbs.getView());
				detail.showContent(bbs.getContent());
				detail.endDetail();

				// break; // 조건문에 부합되면 반복문을 중지함.
				break;
			}
		}
	}
	// 카운트뷰 보류 : 눌렀을 떄, 뷰 수치 증가하 메서드 ------ !

	public void end() {
		System.out.println("--------- 프로그램이 종료됩니다.---------");
		runFlag = false;

	}
	
	
}
