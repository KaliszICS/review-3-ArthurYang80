import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
		Scanner s = new Scanner(System.in);
		System.out.println("In: ");
		s.nextLine();		
		String word = s.nextLine();
		if (word.length() > 0) {
			System.out.println(word.charAt(0));
		} else {
			System.out.println();
		}
		s.close();
	}

	public static void q2() {
		Scanner s = new Scanner(System.in);
		System.out.println("In: ");
		boolean bool = s.nextBoolean();
		System.out.println(!bool);
		s.close();
	}

	public static void q3() {
		Scanner s = new Scanner(System.in);	
	    int num = s.nextInt();
	    if(num > 5) {
			System.out.println("true");
	    } else { 	
			System.out.println("false");
	    }
		s.close();
}

	public static void q4() {
		Scanner s = new Scanner(System.in);
		System.out.println("In: ");
		double num = s.nextDouble();	
		if (num % -2 == 2) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		s.close();	
	}

	public static void q5() {
		Scanner s = new Scanner(System.in);
		System.out.println("In: ");
		String word = s.nextLine();
		if (word.equals( "Hello World")) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		s.close();
	}

	public static void q6() {
		Scanner s = new Scanner(System.in);	
		System.out.println("In: ");
		int num = s.nextInt();
		System.out.println("In: ");
		int num2 = s.nextInt();
		if (num <= num2) {
			System.out.println("True");
		}	else {
			System.out.println("False");
		}
		s.close();
	}

	public static void q7() {
		Scanner s = new Scanner(System.in);
		System.out.println("In: ");
		double num = s.nextDouble();
		System.out.println("In: ");
		double num2 = s.nextDouble();
		if (num > num2) {
			System.out.println("True");
		}	else {
			System.out.println("False");
		}
		s.close();
		}	
}

