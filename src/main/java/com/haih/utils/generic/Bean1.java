package com.haih.utils.generic;


public class Bean1 {

	private Object obj;
	
	public void setObj(Object obj){
		this.obj = obj;
	}
	
	public Object getObj(){
		return this.obj;
	}
	
	public static void main(String[] args) {
		Bean1 bean1 = new Bean1();
		bean1.setObj("1231");
		int i = 8;
		bean1.setObj(i);
		String string = (String)bean1.getObj();
	}
}
