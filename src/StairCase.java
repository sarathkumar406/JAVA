class StairCase 
{
	public static void main(String[] args) 
	{
		int n = 5;

    for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                 if(j<n-1-i){
                    System.out.print(" ");
                }else{
                    System.out.print("#");
                }
            }
            System.out.println("");
        }
	}

	int k =1;
	int a =1;
	System.out.println(k^a);
}
