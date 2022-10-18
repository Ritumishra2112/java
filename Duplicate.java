package demo;

public class Duplicate
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[] arr= {25,35,25,65,65,34,87,67,34,25,99,88,65};
 
 int i=0,j;
int coun=0;
 while(i<arr.length) {
	 j=i+1;
	 while(j<=arr.length) {
		if(arr[i]==arr[j]) {
			coun++;
				break;
		}
	 j++;
	 }
	 i++;
     }
	}

}
