import java.io.*;

public class Count {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char c[]=str.toCharArray();
		
		int count;

		System.out.println("大写字母");
		for(char ch = 'A';ch<='Z';ch++)
		{
			count = 0;
			for(int i=0;i<c.length;i++)
			{
				if(ch==c[i])
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.out.println("字符串中 "+ch+" 有："+count+" 个");
			}
		}
		
		System.out.println("小写字母");
		for(char ch = 'a';ch<='z';ch++)
		{
			count = 0;
			for(int i=0;i<c.length;i++)
			{
				if(ch==c[i])
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.out.println("字符串中 "+ch+" 有："+count+" 个");
			}
		}
		
		System.out.println("数字");
		for(char ch = '0';ch<='9';ch++)
		{
			count = 0;
			for(int i=0;i<c.length;i++)
			{
				if(ch==c[i])
				{
					count++;
				}
			}
			if(count!=0)
			{
				System.out.println("字符串中 "+ch+" 有："+count+" 个");
			}
		}
	}

}
