import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class text {
	public static void main(String[]args)throws IOException
	{
		System.out.println("�п�J�@�Ӿ��");
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		int res = Integer.parseInt(str1);
		
		for(int i = 1;i <= 10;i++) {
			System.out.println("��"+i+"�����B�z");
			if(i == res)
				break;
		}
	}

}
