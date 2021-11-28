class OddSells 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> rowMap = new HashMap<>();
		HashMap<Integer,Integer> colMap = new HashMap<>();
		int n = 2, m =3;
		int[][] indices = {{0,1},{1,1}};

		for(int indice : indices){
			rowMap.put(indices[0],rowMap.getOrDefault(indices[0],0)+1);
			colMap.put(indices[1],colMap.getOrDefault(indices[1],0)+1);
		}
		int count = 0;

		for(int i =0;i<n;i++){
			for(int j =0;j<m;j++){
				int temp =0;
				temp+= rowMap.getOrDefault(i,0);
				temp+= colMap.getOrDefault(j,0);
				count+=temp%2;
			}
		}
		System.out.println(count);
	}
}
