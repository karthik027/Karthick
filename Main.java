import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String args[])throws IOException
	{
		BufferedReader BR=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(BR.readLine());
		if(a>0)
		{
			int b=a%100;
			System.out.println(b);
		}
		else
			if(a<0)
			{
				System.out.println("0");
			}
			
	}

}
