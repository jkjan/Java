package com.sd.ch8;
class Hello{
	private String name;
	public Hello(String name){
		this.name=name;
	}
	
	public void sayHello(){
		System.out.println("hello "+name);
	}
	
	public static void main(String[] args){
		Hello[] h=new Hello[5];
		h[0]=new Hello("0");
		h[1]=new Hello("1");
		h[2]=new Hello("2");
		h[3]=new Hello("3");
		h[4]=new Hello("4");
		
		for(int i=0;i<h.length;i++){
			h[i].sayHello();
		}
	}

}