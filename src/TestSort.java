import java.util.Arrays;

/**
 * 
 * @author harry
 *
 */
public class TestSort {
	public static void main(String[] args) {
		int[] arrs = {4,1,3,2,5};
		//quickSort(0,arrs.length - 1,arrs);
		
		insertSort(arrs);
		System.out.println(Arrays.toString(arrs));
	}
	
	public static void insertSort(int[] arrs){
		for(int i = 1;i < arrs.length;i++){
			int data = arrs[i];
			for(int j = i - 1;j >= 0;j--){
				if(arrs[j] > data)
					arrs[j + 1] = arrs[j];
				else
					break;
				
				arrs[j] = data;
			}
		}
	}
	
	public static void bubbleSort(int[] arrs) {
		for (int i = 1; i < arrs.length; i++) {
			for (int j = 0; j < arrs.length - i; j++) {
				if(arrs[j] > arrs[j + 1]){
					int temp = arrs[j];
					arrs[j] = arrs[j + 1];
					arrs[j + 1] = temp;
				}
			}
		}
	}
	
	public static void quickSort(int left,int right,int[] arrs){
		int index;
		
		if(left < right){
			index = partion(arrs,left,right);
			
			quickSort(left,index - 1,arrs);
			
			quickSort(index + 1,right,arrs);
		}
	}
	
	public static int partion(int[] arrs,int i,int j){
		int key = arrs[i];
		
		while(i < j){
			while(i < j && arrs[j] >= key){
				--j;
			}
			
			if(i < j){
				arrs[i++] = arrs[j];
			}
			
			while(i < j && arrs[i] <= key){
				++i;
			}
			
			if(i < j){
				arrs[j--] = arrs[i];
			}
		}
		
		arrs[i] = key;
		
		return i;
	}
}
