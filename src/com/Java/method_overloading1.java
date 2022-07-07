package com.Java;

public class method_overloading1 {
	public void instagram (String name) {
		System.out.println("name="+name);
		}
		public void instagram (int date, int month, int year ) {
			System.out.println(date+" "+month+" "+year);
		}
			public void instagam (char gender) {
				System.out.println("gender="+gender);
				
				}
			public static void main (String []argu) {
				method_overloading1 m = new method_overloading1();
				m.instagram( "Eniyan anto cletus ");
				m.instagram(26, 04, 1997);
				m.instagam('m');
			}

}
