package QuickSort;

public class QuickSort {

	/*
	 * ��������
	 * 
	 * @author WLNSSS
	 * 
	 * @version 1.0
	 * 
	 * @param arr[]ΪҪ�������������
	 * 
	 * @param _leftΪ��ָ��λ��
	 * 
	 * @param _rightΪ��ָ��λ��
	 */
	public static void quickSort(int arr[], int _left, int _right) {

		int left = _left, right = _right;
		int temp = 0;

		// ��������������ִ��
		if (left <= right) {

			// �ҳ���׼Ԫ��
			temp = arr[left];

			// ����ɨ��,����Ԫ�أ�ֱ��leftָ���right�غ�
			while (left != right) {

				// ����ɨ�裬С���򽻻�λ��
				while (right > left && temp < arr[right]) {
					right--;
				}
				// ����λ��
				arr[left] = arr[right];

				// ����ɨ�裬�����򽻻�λ��
				while (left < right && temp > arr[left]) {
					left++;
				}
				// ����λ��
				arr[right] = arr[left];

			}

			// ��׼Ԫ�ع�λ
			arr[right] = temp;

			// �ݹ�������������
			quickSort(arr, _left, left - 1);
			quickSort(arr, right + 1, _right);
		}
	}

	public static void main(String[] args) {

		int array[] = { 10, 5, 3, 1, 7, 2, 8 };

		System.out.println("����֮ǰ��");

		for (int element : array) {
			System.out.print(element + " ");
		}

		quickSort(array, 0, array.length - 1);

		System.out.println("\n����֮��");

		for (int element : array) {
			System.out.print(element + " ");
		}

	}

}
