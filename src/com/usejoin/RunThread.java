package com.usejoin;

class RunThread extends Thread {
	RunThread() {
		start();
	}
	
	public void run() {
		System.out.println("���̵߳������ǣ�" + this.getName() + "���Ѿ���ʼ���У�Ԥ��ִ��3��");
		try {
			Thread.sleep(3 * 1000);	//���߳�����һ��ʱ�䡣
		} catch(InterruptedException e) {
			System.err.println(e.toString());	//�����쳣�ļ�������������쳣�������쳣ԭ��
		}
		System.out.println("���߳�׼����������˳���");
	}
}
