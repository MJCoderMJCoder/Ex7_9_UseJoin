package com.usejoin;
/*
 * join()����Ҳ���ڿ����̣߳�
 * ����߳�Aֻ�����߳�B��ֹʱ���ܼ���ִ�У����߳�A���Ե����߳�B��join()�������������̡߳����ᡱ��һ��
 * ���߳�A��ִ�У����󱻹����߳�B����ִ�У�ֱ������ֹʱ�߳�A�ص�������״̬����ִ�С�
 * ����join(int time)�������Դ���һ�����ȴ�ʱ��Ĳ��������ڿ��Ƶȴ�ʱ�䡣
 */
public class UseJoin {

	public static void main(String[] args) {
		System.out.println("���߳�����ִ�У����������̣߳�");
		RunThread rthread = new RunThread();
		try {
			//main���̵߳���rthread�̵߳�join()����;�ȴ��߳�rthread������main���߳��ڼ���ִ��
			rthread.join();
			//rthread.join(2000); //���ȴ�2��
		} catch(InterruptedException e) {
			System.err.println(e.toString()); //�����쳣�ļ�������������쳣�������쳣ԭ��
		}
		System.out.println("���߳���ֹ�����̼߳���ִ�У�");
	}

}
