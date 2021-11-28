class selfDividing
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> al = new ArrayList<>();
        
        for(int i = left;i<=right;i++){
            if(isDivisable(i))
            {
                al.add(i);
            }
            
        }
        return al;
    }
    
    private boolean isDivisable(int num){
        int copy = num;
        
        while(copy > 0){
            int rem = copy % 10;
            copy/=10;
            if(rem == 0 || num % rem!=0)
            {
                return false;
            }
        }
        return true;
    }

}
