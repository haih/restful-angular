/**
 * 
 */
package com.haih.utils.generic;

/**
 * @author haih
 *
 */
public abstract class Bean3<I extends InData,O extends OutData>{
	public I indata;
	
	public O outData;
	
	public I getI(){
		return indata;
	}
	
	public O getO() {
		return outData;
	}
}
