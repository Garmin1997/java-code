package javaStudy;

import java.util.Scanner;

public class CountLowercase {
	//����һ�����ݣ�ͳ��Сд��ĸ�ĸ���
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("������һ�����ݣ�");
		String str=scan.nextLine();
		
		String strLowercase="";
		
		for(int i=0; i<str.length(); i++){			
			if((str.charAt(i)>='a' && str.charAt(i)<='z')){
				strLowercase+=str.charAt(i);
			}
		}
		
		System.out.println("Сд��ĸ�ĸ���Ϊ:"+strLowercase.length());
		System.out.println("Сд��ĸ������Ϊ"+strLowercase);		
		
		for(int letter=(int)('a'); letter<=(int)('z');letter++){
			int count=0;
			for(int j=0;j<strLowercase.length();j++){				
				if(strLowercase.charAt(j)==letter){
					count++;
				}			
			}
			if(count!=0){
				System.out.println((char)letter+"��"+count+"��");				
			}
		}
	}
}
