package homework13;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class text {
	public static void main(String[]args)throws IOException{
		System.out.println("�п�J���");
		
		//@SuppressWarnings("unused")
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		//@SuppressWarnings("unused")
		int num = Integer.parseInt(br.readLine());
		
		if(num == 1) {
			System.out.println("��J���O1");
		}
		if(num == 2) {
			System.out.println("��J���O2");
		}
		else {
			System.out.println("�п�J1��2");
		}
	}

}
