/*
Darren Douglas
Java
SelfPrinting.java
*/

public class SelfPrinting {
  public static void main(String[] args) {
	char q = 34;		
	char c = 44;
	String[] myCode = {
"public class SelfPrinting {",
"public static void main(String[] args) {;",
"char q = 34",
"char c = 44",
"String[] myCode = {;",
"};",
"for (int i = 0; i < 3; i++) {",
"System.out.println(myCode[i]);",
"for (int i = 0; i < 6; i++) {",
"System.out.println(q+myCode[i]+q+c);",
"for (int i = 4; i < myCode.length; i++) {",
"System.out.println(myCode[i]);",
"}", 
"}",
"}"};

		for (int i = 0; i < 5; i++) {
			System.out.println(myCode[i]);	
		}	

		for (int i = 0; i < myCode.length ; i++) {
			
			System.out.println(q+myCode[i]+q+c);
		}

		for (int i = 5; i < myCode.length; i++) {
			System.out.println(myCode[i]);
		}
		
	}
}
