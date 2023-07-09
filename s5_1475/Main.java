package s5_1475;
/*
 * string N = { 1, 2, 2 } 
 * set_num = 1  
 * for x - 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.Arrays;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N= br.readLine();
		
		int six_num = 0;
		int nin_num = 0;
		int[] arr = new int[9];
		Arrays.fill(arr, 0);
		for(char x : N.toCharArray()) {
			if(x == '6') {
				six_num++;
			}
			else if(x=='9') 
				nin_num++;
			else
				++arr[Character.getNumericValue(x)];
		 	
		}
		if((six_num + nin_num) % 2 == 1) 
			arr[6] = (six_num + nin_num) / 2 + 1;
		else
			arr[6] = (six_num + nin_num) / 2 ;
		
		
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			max = Math.max(max, arr[i]);
		}
		
		
		System.out.print(max);
		
	}

}
