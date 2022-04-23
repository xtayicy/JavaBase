
/**
 * 
 * @author harry
 *
 */
public class TestPalindrome {
	public static void main(String[] args) {
		System.out.println(palinromeNumber(1234321));
	}
	
	public static boolean palinromeNumber(int num){
		String ori = String.valueOf(num);
		boolean flag = true;
		for(int i = 0,j;i < ori.length();i++){
			j = ori.length() - i - 1;
			if(i == j){
				break;
			}
			
			if(ori.charAt(i) != ori.charAt(j)){
				flag = false;
				break;
			}
		}
		
		return flag;
	}
}
