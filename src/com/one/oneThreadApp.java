package com.one;

public class oneThreadApp {

	 /**
	  * 1.main 比run方法先执行，说明 多线程调用是异步的
	  * 2. main和run每次运行结果不一致说明线程运行是随机的
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