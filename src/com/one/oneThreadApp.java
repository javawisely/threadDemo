package com.one;

public class oneThreadApp {

	 /**
	  * 1.main ��run������ִ�У�˵�� ���̵߳������첽��
	  * 2. main��runÿ�����н����һ��˵���߳������������
	  * @param args
	  */
	public static void main(String[] args) {
		oneThread r = new oneThread();
		r.start();
		
		System.out.println("main");
	}

}

class oneThread extends Thread {

	@Override
	public void run() {
		System.out.println("has run");
	}

}