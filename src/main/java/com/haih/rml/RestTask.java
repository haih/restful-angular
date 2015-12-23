/**
 * 
 */
package com.haih.rml;

/**
 * @author haih
 *
 */
public class RestTask implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	@Override
	public void run() {
		int i = 0;
		while(true){
			System.out.println(i);
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
