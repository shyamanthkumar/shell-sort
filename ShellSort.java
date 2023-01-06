class ShellSort
{
	public void sort(int arr[])
	{
		int n=arr.length;
		for(int gap=n/2;gap>0;gap/=2)
		{
			for(int i=gap;i<n;i++)
			{
				int key=arr[i];
				int j=i;
				while(j>=gap && arr[j-gap]>key)
				{
					arr[j]=arr[j-gap];
					j-=gap;
				}
				arr[j]=key;
			}
		}
	}
	public static void main(String args[])
	{
		int arr[]={10,7,2,5,6,1,11,8};
		ShellSort s=new ShellSort();
		s.sort(arr);
		for(int i:arr)
			System.out.print(i+" ");
	}
}