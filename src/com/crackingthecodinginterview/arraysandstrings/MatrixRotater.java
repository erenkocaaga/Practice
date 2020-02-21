package com.crackingthecodinginterview.arraysandstrings;

public class MatrixRotater {
	
	static void rotate(int [][] matrix)
	{
		if(matrix.length == 0 || matrix.length != matrix[0].length)
			System.out.println("Matrix is not NxN");
		else
		{
			int n = matrix.length; 
			for(int layer = 0 ; layer<n/2; layer++)
			{
				int first = layer; 
				int last = n-1-layer; 
				for(int i = first;i<last;i++)
				{
					int offset = i -first; 
					int top = matrix[first][i]; 
					matrix[first][i] = matrix[last-offset][first]; 
					matrix[last-offset][first] = matrix[last][last-offset]; 
					matrix[last][last-offset] = matrix[i][last];
					matrix[i][last] = top; 
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
