package ArraysInterviewPrograms;

public class DupElementsApproah1 {
	public static void main(String[] args) {
		int[]arr= {1,2,2,3,4,6 };
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
				System.out.println("duplicates are "+arr[i]);
				flag=true;
				}
			}
		}
		if(flag==false) {
			System.out.println("not duplicates not found");
		}
	}
}