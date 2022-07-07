package com.Java;

public class method_overloading {

public void facebook (String name) {
	
	System.out.println(name);
}

	public void facebook (int d,int y ,int m)
	{
		System.out.println(d+" "+y+" "+m);
	
}
	public void facebook() {
	System.out.println("name");
	}
	
	public static void main(String[] args) {
		method_overloading o = new method_overloading();
		o.facebook("Eniyan Anto Cletus");
		o.facebook(26, 04, 1997);
	}

}
