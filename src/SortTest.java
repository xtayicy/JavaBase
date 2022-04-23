import java.util.Arrays;

import org.junit.Test;

/**
 * 
 * @author harry
 *
 */
public class SortTest {
	@Test
	public void test() {
		int arrs[] = { 6, 3, 1, 4, 5, 2 };
		//mergeSort(arrs, 0, arrs.length - 1);
		insertSort(arrs);
		System.out.println(Arrays.toString(arrs));
	}

	public void mergeSort(int[] arrs, int start, int end) {
		int mid = (start + end) / 2;
		if (start < end) {
			mergeSort(arrs, start, mid);
			mergeSort(arrs, mid + 1, end);

			merge(arrs, start, mid, end);
		}
	}

	public void merge(int[] arrs, int start, int mid, int end) {
		int[] temp = new int[end - start + 1];
		int i = start;
		int j = mid + 1;
		int index = 0;
		while (i <= mid && j <= end) {
			if (arrs[i] < arrs[j]) {
				temp[index++] = arrs[i++];
			} else {
				temp[index++] = arrs[j++];
			}
		}

		while (i <= mid) {
			temp[index++] = arrs[i++];
		}

		while (j <= end) {
			temp[index++] = arrs[j++];
		}

		for (int k = 0; k < temp.length; k++) {
			arrs[k + start] = temp[k];
		}
	}

	public void quickSort(int[] arrs, int start, int end) {
		int i = start;
		int j = end;
		int key = arrs[start];

		while (i < j) {
			while (i < j && arrs[j] > key) {
				j--;
			}

			if (arrs[j] <= key) {
				int temp = arrs[j];
				arrs[j] = arrs[i];
				arrs[i] = temp;

			}

			while (i < j && arrs[i] < key) {
				i++;
			}

			if (arrs[i] >= key) {
				int temp = arrs[i];
				arrs[i] = arrs[j];
				arrs[j] = temp;
			}
		}

		if (i > start) {
			quickSort(arrs, start, i - 1);
		}

		if (j < end) {
			quickSort(arrs, j + 1, end);
		}
	}

	public void bubbleSort(int[] arrs) {
		for (int i = 1; i < arrs.length; i++) {
			for (int j = 0; j < arrs.length - i; j++) {
				if (arrs[j] > arrs[j + 1]) {
					int temp = arrs[j];
					arrs[j] = arrs[j + 1];
					arrs[j + 1] = temp;
				}
			}
		}
	}

	public void selectSort(int[] arrs) {
		for (int i = 0; i < arrs.length; i++) {
			int min = arrs[i];
			for (int j = i + 1; j < arrs.length; j++) {
				if (min > arrs[j]) {
					int temp = min;
					min = arrs[j];
					arrs[j] = temp;
				}
			}

			arrs[i] = min;
		}
	}

	public void insertSort(int[] arrs) {
		for (int i = 1; i < arrs.length; i++) {
			int data = arrs[i];
			for (int j = i - 1; j >= 0; j--) {
				if (arrs[j] > data)
					arrs[j + 1] = arrs[j];
				else
					break;

				arrs[j] = data;
			}
		}
	}
}
