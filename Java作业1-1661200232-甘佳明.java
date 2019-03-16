package javaStudy;

import java.util.Scanner;

public class CountLowercase {
	//输入一行数据，统计小写字母的个数
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("请输入一行数据：");
		String str=scan.nextLine();
		
		String strLowercase="";
		
		for(int i=0; i<str.length(); i++){			
			if((str.charAt(i)>='a' && str.charAt(i)<='z')){
				strLowercase+=str.charAt(i);
			}
		}
		
		System.out.println("小写字母的个数为:"+strLowercase.length());
		System.out.println("小写字母的内容为"+strLowercase);		
		
		for(int letter=(int)('a'); letter<=(int)('z');letter++){
			int count=0;
			for(int j=0;j<strLowercase.length();j++){				
				if(strLowercase.charAt(j)==letter){
					count++;
				}			
			}
			if(count!=0){
				System.out.println((char)letter+"有"+count+"个");				
			}
		}
	}
}
