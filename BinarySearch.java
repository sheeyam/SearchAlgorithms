
public class BinarySearch {
	
	int binarySearch(int arr[], int l, int u, int key) {
		if(u >= l) {
			int mid = l + (u-l)/2;
			if(arr[mid] == key) {
				return mid;
			} else {
				if(arr[mid] > key) {
					return binarySearch(arr, l, mid-1, key);
				}else {
					return binarySearch(arr, mid+1, u, key);
				}
			}	
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = { 12, 45, 7, 88, 28 };
		BinarySearch bSearch = new BinarySearch();
		int q = 7;
		int result = bSearch.binarySearch(arr, 0, arr.length -1, q);
		
		if(result == -1) {
			System.out.println("Searched Number Not Available");
		} else {
			System.out.println("Searched Number found at index: " + result);
		}
	}
}
