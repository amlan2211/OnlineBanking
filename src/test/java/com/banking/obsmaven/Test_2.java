package com.banking.obsmaven;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

public class Test_2 
{ 
	@Test
	public void Test()
	{
		String s="my name is prakash";
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			if(s.charAt(i)!=' ')
			{
				rev=rev+s.charAt(i);
			}
		}
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
            {
				rev=rev.substring(0, i)+" "+rev.substring(i, rev.length());
            }
		}
		System.out.println(rev);
	}
	@Test
	public void Mappim()
	{
		 // Creating an empty HashMap 
        Map<String, String> hm 
            = new HashMap<String, String>(); 
  
        // Inserting pairs in above Map 
        // using put() method 
        hm.put("FIRST Name","John"); 
        hm.put("Last Name", "Nash"); 
        hm.put("Phone Number","555555555"); 
        hm.put("email", "amlankmishra@gmail.com"); 
  
        // Traversing through Map using for-each loop 
        for (Map.Entry<String, String> me : 
             hm.entrySet()) 
        { 
  
          
            System.out.print(me.getKey() + ":"); 
//            System.out.println(me.getValue()); 
	}
	}
}
