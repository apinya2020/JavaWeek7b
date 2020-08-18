package week7b;

public class myJava702 {
	public static void main(String[]args) {
		int a=5;
		int b=10;
		int c=20;
		int d=35;
		int total=a+b;
		int total2=b/a;
		int total3=a*c;
		int total4=a%c;//5/20=0.25
		int total5=d%b;//35/10=3.5
		//precedence operator
		float total6=d*a/b-c;// 35*5/10-20=-2.5
		System.out.println("Total1 = "+ total);
		System.out.println("Total2 = "+ total2);
		System.out.println("Total3 = "+ total3);
		System.out.println("Total4 = "+ total4);
		System.out.println("Total5 = "+ total5);
		System.out.println("Total6 = "+ total6);
	}
}
