package String_interview;

public class ternaryoperater {
public static void main(String[] args) {
	int a = 40;
	int b= 30;
	int c= 20;
//	int max=(a>b)?a:b;
	int max=(a>b)?(a>c?a:c):(b>c?b:c);
	System.out.println(max);
}
}
