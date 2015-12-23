/**
 * 
 */
package com.haih.rml;

/**
 * @author haih
 *
 */
public enum ProcessIdEnum {

	TEST(100);
	 
	private final int processId;
	
	private ProcessIdEnum(int processId){
		this.processId = processId;
	}

	public int getProcessId(){
		return processId;
	}
}
