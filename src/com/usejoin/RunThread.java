package com.usejoin;

class RunThread extends Thread {
	RunThread() {
		start();
	}
	
	public void run() {
		System.out.println("子线程的名字是：" + this.getName() + "，已经开始运行，预计执行3秒");
		try {
			Thread.sleep(3 * 1000);	//让线程休眠一段时间。
		} catch(InterruptedException e) {
			System.err.println(e.toString());	//返回异常的简短描述，包括异常类名、异常原因
		}
		System.out.println("子线程准备运行完毕退出！");
	}
}
