package QuickSort;

public class QuickSort {

	/*
	 * 快速排序
	 * 
	 * @author WLNSSS
	 * 
	 * @version 1.0
	 * 
	 * @param arr[]为要进行排序的数组
	 * 
	 * @param _left为左指针位置
	 * 
	 * @param _right为右指针位置
	 */
	public static void quickSort(int arr[], int _left, int _right) {

		int left = _left, right = _right;
		int temp = 0;

		// 待排序有两个就执行
		if (left <= right) {

			// 找出基准元素
			temp = arr[left];

			// 交替扫描,交换元素，直到left指针和right重合
			while (left != right) {

				// 从右扫描，小于则交换位置
				while (right > left && temp < arr[right]) {
					right--;
				}
				// 交换位置
				arr[left] = arr[right];

				// 从左扫描，大于则交换位置
				while (left < right && temp > arr[left]) {
					left++;
				}
				// 交换位置
				arr[right] = arr[left];

			}

			// 基准元素归位
			arr[right] = temp;

			// 递归排序左右两边
			quickSort(arr, _left, left - 1);
			quickSort(arr, right + 1, _right);
		}
	}

	public static void main(String[] args) {

		int array[] = { 10, 5, 3, 1, 7, 2, 8 };

		System.out.println("排序之前：");

		for (int element : array) {
			System.out.print(element + " ");
		}

		quickSort(array, 0, array.length - 1);

		System.out.println("\n排序之后：");

		for (int element : array) {
			System.out.print(element + " ");
		}

	}

}
