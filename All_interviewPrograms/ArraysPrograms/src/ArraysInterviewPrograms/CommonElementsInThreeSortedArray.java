package ArraysInterviewPrograms;

public class CommonElementsInThreeSortedArray {
	public static void main(String[] args) {
		int[]arr1= {1,5,10,20,40,80};
		int[]arr2= {1,5,10,6,40,80};
		int[]arr3= {1,4,10,20,40,80};
		
		CommonElements(arr1,arr2,arr3);
	}

	private static void CommonElements(int[] arr1, int[] arr2, int[] arr3) {
		// TODO Auto-generated method stub
		int x = 0,y = 0,z=0;
		
		while(x<arr1.length&&y<arr2.length&&z<arr3.length) {
			if(arr1[x]==arr2[y]&&arr2[y]==arr3[z]) {
				System.out.println(arr1[x]);
				x++;
				y++;
				z++;
			}
			else if(arr1[x]>arr2[y]) {
				y++;
			}
			else if(arr2[y]>arr3[z]) {
				z++;
			}
			else {
				x++;
			}
		}
	}
}
