package com.usejoin;
/*
 * join()方法也用于控制线程：
 * 如果线程A只有在线程B终止时才能继续执行，则线程A可以调用线程B的join()方法，将两个线程“联结”在一起；
 * 即线程A先执行，而后被挂起，线程B接着执行，直到其终止时线程A回到可运行状态继续执行。
 * 另外join(int time)方法可以传入一个最多等待时间的参数，用于控制等待时间。
 */
public class UseJoin {

	public static void main(String[] args) {
		System.out.println("主线程启动执行，并创建子线程！");
		RunThread rthread = new RunThread();
		try {
			//main主线程调用rthread线程的join()方法;等待线程rthread结束后，main主线程在继续执行
			rthread.join();
			//rthread.join(2000); //最多等待2秒
		} catch(InterruptedException e) {
			System.err.println(e.toString()); //返回异常的简短描述，包括异常类名、异常原因
		}
		System.out.println("子线程终止，主线程继续执行！");
	}

}
