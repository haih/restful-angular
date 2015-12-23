/**
 * 
 */
package com.haih.rml;

/**
 * @author haih
 *
 */
public class RestTask2 implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		int i = 10;
		for (int j = 0; j < 3; j++) {
			try {
				System.out.println(i);
				i++;
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
