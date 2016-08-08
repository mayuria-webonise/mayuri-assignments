import java.util.*;
import java.lang.*;

import java.io.*;
class Main
{
	ArrayList <Hotel>h=new ArrayList<Hotel>();
	 public void findMinPrice(String item1,String item2)
	    {
		 
	    	CSVReader c1=new CSVReader();
	    	h= c1.parseCSV("./sample_data.csv");
			System.out.println(h);
			System.out.println("ex");
			
	    	double minbill=1000;
	    	int hotel_id=0;
	    	for(Hotel h1:h)
	    	{
	    		//System.out.println(h1.getShop_id());
	    
	    		Menu m=h1.getMenu();

	    		if(m.searchItem(item1)==false )
	    		{
	    			continue;
	    		}
	    		
	    		if(m.searchItem(item1)==true && m.searchItem(item2)==true)
	    		{
	    			Item i1= m.getItem(item1);
	    			Item i2= m.getItem(item2);
	    			double bill=i1.getPrice()+i2.getPrice();
	    			if(minbill>bill)
	    			{
	    				minbill=bill;
	    				hotel_id=h1.getShop_id();
	    				
	    			}
	    			
	    					
	    		}
	    		//System.out.println(bill);
	    	}
	    	System.out.println(minbill);
	    	/*i1= c1.readArray();
	    	i2= c2.readArray();
	    	
	    	double total=0;
	    	for(Item i: i1)
	    	{
	    		int id1= i.getShop_id();
	    		for(Item j: i2)
	    		{
	    			int id2=j.getShop_id();
	    			if(id1==id2)
	    			{
	    				total=i.getPrice()+j.getPrice();
	    				break;
	    			}
	    		}
	    	}
	    	System.out.println(total);
	    	
	    	*/
	    }
	 public static void main(String []ar) {
		Main m= new Main();
		m.findMinPrice("burger", "tofu_log");
	}
}