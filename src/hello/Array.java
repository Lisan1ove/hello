package hello;
                            //判断字符串元素出现的个数！！  采用charAt遍历   类似数组遍历
public class Array {
	
	public static int charMethod(String str, char ch) {
		int cnt = 0;
		for(int i = 0; i < str.length();i++) {
			if(str.charAt(i) == ch)  
				cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.print(charMethod("asdfdgdgfhj",'d'));
	}

}
