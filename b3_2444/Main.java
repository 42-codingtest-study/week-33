package b3_2444;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int a = Integer.parseInt(br.readLine());
		    
		for(int i = 0; i < a; i++) {
			for(int j = a - 1; j > i; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2*(i+1) - 1; k++) {
				System.out.print("*");				
			}
			System.out.println();
		}
		for(int i = a - 1; i > 0; i--) {
			for(int j = a - i; j > 0; j--) {
				System.out.print(" ");
			}
			for(int k = i*2-1; k >0; k--) {
				System.out.print("*");				
			}
			System.out.println();
		}
	}
 
}
