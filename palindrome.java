class palindrome{
	static boolean palin(String str){
		if(str == null || str.isEmpty()){
			return false;
		}
		int left =0;
		int right =str.length()-1;
		while(left < right){
			if(str.charAt(left)!=  str.charAt(right)){
				return false;
			}
			else{
				left++;
				right--;
			}
		}
		return true;
	}
public static void main(String[] args){
	String str = "racecar";
	if(palin(str)){
		System.out.println("It is a palindrome");
	}
	else{
		System.out.println("It is not a palindrome");
	}
}
}
