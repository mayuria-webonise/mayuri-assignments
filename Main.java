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
			//System.out.println(h);
			//System.out.println("ex");
			
	    	double minbill= Double.MAX_VALUE; //1000;
	    	int hotel_id=0;
	    	boolean not_found= true;
	    	for(Hotel h1:h)
	    	{
	    		//System.out.println(h1.getShop_id());
	    		//
	    		Menu m=h1.getMenu();

	    		/*if(m.searchItem(item1)==false || m.searchItem(item2)==false )
	    		{
	    			not_found=true;
	    			continue;
	    		}*/
	    		
	    		if(m.searchItem(item1)==true && m.searchItem(item2)==true)
	    		{
	    			Item i1= m.getItem(item1);
	    			Item i2= m.getItem(item2);
	    			//System.out.println(i1+" "+i2);
	    			if(i1==i2)
	    			{
	    				minbill=i1.getPrice();
	    				hotel_id=h1.getShop_id();
	    			}
	    			double bill=i1.getPrice()+i2.getPrice();
	    			if(minbill>bill)
	    			{
	    				minbill=bill;
	    				hotel_id=h1.getShop_id();
	    			}
	    			not_found=false;
	    			
	    		}
	    		//System.out.println(bill);
	    	}
	    	if(not_found==true)
	    	{
	    		System.out.println("Items not found in same hotel");
	    	}
	    	else
	    	System.out.println(minbill+ " "+hotel_id);
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
		m.findMinPrice("jalapeno_poppers", "extreme_fajita");
	}
}