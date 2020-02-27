package com.cjc.bufferedwriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTxt {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
FileReader f=new FileReader("student.txt");
BufferedReader b=new BufferedReader(f);
Student stu[]=new Student[10];
int count =0;
String Line=b.readLine();
while(Line!=null)
{
	Student s =new Student();
	String[] ss =Line.split(",");
	s.setId(Integer.parseInt(ss[0]));
	s.setName(ss[1]);
	s.setAddr(ss[2]);
	stu[count]=s;
	count++;
	Line =b.readLine();
	}
b.close();
for(int i=0;i<stu.length;i++)
{
System.out.print(stu[i].getId());
System.out.print(stu[i].getAddr());
System.out.print(stu[i].getName());
System.out.println();

}
	}

}
