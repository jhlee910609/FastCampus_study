package com.junhee.lang.java;

import java.lang.reflect.Proxy;

import factoryMethod.FactoryMethod;
import mail.Mail;
import mail.Server;
import observer.Publisher;
import observer.Subscriber;

public class PatternMain {
	
	public static void main(String[] args) {
		
		Proxy mailProxy = new Proxy();
		 
		// 편지글 작성
		Mail mail = new Mail();
		
		// 서버를 통해 메일발송 
		mailProxy.sender(mail);
		
//		FactoryMethod Factory = new TVFactory();
//		Product product = factory.m;
//				
		// 1. 발행자 생성
		Publisher publisher = new Publisher();
		publisher.addObserver(new Subscriber("이준희"));
		publisher.addObserver(new Subscriber("송희진"));
		publisher.addObserver(new Subscriber("하하호호"));
		
		new SubScriber("이준희", publisher);
		
		
		
		
				

	}
	
}
