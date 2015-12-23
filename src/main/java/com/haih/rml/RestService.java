/**
 * 
 */
package com.haih.rml;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author haih
 *
 */
public class RestService {

	public static void process(){
		ExecutorService servicePool = Executors.newFixedThreadPool(1);
		RestTask task = new RestTask();
		RestTask2 task2 = new RestTask2();
		servicePool.execute(task2);
		servicePool.execute(task);
	}
	
	public static void main(String[] args) {
		process();
	}
}
