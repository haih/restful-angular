/**
 * 
 */
package com.haih.utils.generic;

/**
 * @author haih
 *
 */
public class Bean2<T> {
	private T obj;
	
	public void setObj(T obj) {
		this.obj = obj;
	}
	
	public T getObj() {
		return obj;
	}
	
	public static void main(String[] args) {
		Bean2<String> objBean2 = new Bean2<>();
		//int i = 9;
		//objBean2.setObj(i);
		objBean2.setObj("dsfa");
		System.out.println(objBean2.getObj());
	}
}
