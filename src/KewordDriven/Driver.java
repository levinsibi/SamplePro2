package KewordDriven;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Driver {

	public Method method[];
	public ActionKeyword act;
	String st[];
	Driver() throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		act=new ActionKeyword();
		ExcelRead read=new ExcelRead();
		method=act.getClass().getDeclaredMethods();
		 st=read.getmethods();
		 for(int i=0;i<st.length;i++)
		 {
			 System.out.println(st[i]);
			 Execute(st[i]);
		 }
	}
	public void Execute(String st) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		for(int i=0;i<method.length;i++)
		{
			if(st.equals(method[i].getName()))
			{
				method[i].invoke(act);
			}
		}
	}
	
	public static void main(String[]args) throws IOException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		Driver driver=new Driver();
	}
}
