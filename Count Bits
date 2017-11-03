package leetPack;

public class CountBits {

	public static int countOnes(int n)
	{
		int ctr = 0;
		while(n>0)
		{
			if(n%2==1)
				ctr++;
			n/=2;
		}
		return ctr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 5;
		int[] arr = new int[num+1];
		for(int i=0;i<=num;i++){
			arr[i] = countOnes(i);
		}
		for(int i:arr){
			System.out.print(i+" ");
		}
	}

}
