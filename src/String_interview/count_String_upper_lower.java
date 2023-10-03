package String_interview;

public class count_String_upper_lower {
public static void main(String[] args) {
	String str = "I Love India";
	String upper="";
	String lower ="";
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(ch>=65 && ch<=90) {
			upper+=ch;
		}else {
			lower+=ch;
		}
	}
	System.out.println(upper);
	System.out.println(lower);
}
}
