class ReverseString 
{
	public static void main(String[] args) 
	{
		char[] ch = {'h','e','l','l','o'};
		int j = ch.length-1;
		int i =0;

		while(i<j){
			char t  = ch[i];
			ch[i++] = ch[j];
			ch[j--] = t;
		}
		for(int k=0;k<ch.length;k++){
			System.out.print(ch[k]+" ");
		}
		
	}
}
