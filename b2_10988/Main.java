package b2_10988;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = "";
        str = br.readLine();
        
        for(int i = 0; i < str.length() / 2; i++) {
        	if(str.charAt(i) != str.charAt(str.length() - i - 1)) {
        		System.out.print("0");
        		return;
        	}
        	
        }
        System.out.print("1");
	}

}
