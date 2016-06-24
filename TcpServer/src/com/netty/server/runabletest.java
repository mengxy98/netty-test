package com.netty.server;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;


public class runabletest {
	
	public void  run() {
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new changer(), 2, 5, TimeUnit.SECONDS);
	}
	
	
	
	class changer implements Runnable {
	

		@Override
		public void run() {
			try {
				System.out.println("sssssssssss");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		new runabletest().run();
	}
}
