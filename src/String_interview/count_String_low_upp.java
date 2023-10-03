package String_interview;

public class count_String_low_upp {
	public static void main(String[] args) {
			String str = "I Love India";
	int upp=0;
	int  low =0;
	for(int i=0;i<str.length();i++) {
		char ch = str.charAt(i);
		if(ch>=65 && ch<=90) {
			upp++;
		}else {
			low++;
		}
	}
	
	System.out.println("upperchar"+upp);
	System.out.println("lowerchar"+low);
	}
}

