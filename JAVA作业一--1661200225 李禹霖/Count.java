import java.io.*;

public class Count {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char c[]=str.toCharArray();
		
		int count;

		System.out.println("��д��ĸ");
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
				System.out.println("�ַ����� "+ch+" �У�"+count+" ��");
			}
		}
		
		System.out.println("Сд��ĸ");
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
				System.out.println("�ַ����� "+ch+" �У�"+count+" ��");
			}
		}
		
		System.out.println("����");
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
				System.out.println("�ַ����� "+ch+" �У�"+count+" ��");
			}
		}
	}

}
