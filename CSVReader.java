/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class CSVReader{

    ArrayList <Item> a=null;
    ArrayList <Hotel> h=null;
    public ArrayList<Hotel> parseCSV(String csvFile)
    {
    	BufferedReader br=null;
        String line=null;
        try{
        	br=new BufferedReader(new FileReader(csvFile));
        }
        catch(Exception e){}

        try{
        	a= new ArrayList<Item>();
        	h=new ArrayList<Hotel>();
        	ArrayList<Integer > arrayid= new ArrayList<Integer>();
        	ArrayList<String> item_names= null;
        	Item i=null;
        	Hotel h1=null;
        	Menu m=null;
        	
        		while((line=br.readLine())!=null)
        		{
        			//String line =br.readLine();
        			item_names = new ArrayList<String>();
        			String[] splitData = line.split("\\s*,\\s*");
        			
        			int id= Integer.parseInt(splitData[0]);
        			double price= Double.parseDouble(splitData[1]);
        			
        			for(int j=2;j<splitData.length;j++)
        			{
        				item_names.add(splitData[j]);
        			}
        		
        			
        			i=new Item(item_names);
    				i.setPrice(price);

    				//System.out.println(i.price);
 				
    				/*if(arrayid.isEmpty())
    				{
    					mnot_found=false;= new Menu();
    					h1=new Hotel();
        				h1.setShop_id(id);
        				arrayid.add(id);
        				m.addItemToMenu(i);	
        		Medical Policy		h.add(h1);
        				h1.setMenu(m);
    				}*/
    				
    				
        			if(arrayid.contains(id)==true)
        			{
        				m.addItemToMenu(i);	
        				
        			}       				
        
        			else
        			{
        				m=new Menu();
        				h1=new Hotel();
        				h1.setMenu(m);
        				h1.setShop_id(id);
        				arrayid.add(id);
        				m.addItemToMenu(i);	
        				h.add(h1);
        				
        			}
        			
 					
        		}
        
    	}catch(Exception e){ System.out.println(""+e);}
        return h;
    }
    
    /*public void parseCSV(String csvFile,String item){
        BufferedReader br=null;
        String line=null;
        try{
        	br=new BufferedReader(new FileReader(csvFile));
        }
        catch(Exception e){}

        try{
        	a= new ArrayList<Item>(int);
        	Item i=null;
        while((line=br.readLine())!=null)
        {
            //String line =br.readLine();
            //System.out.println(line);
            String[] splitData = line.split("\\s*,\\s*");
            if(splitData[2].equals(intitem))

            {
                i=new Item(item);
                i.setShop_id(Integer.parseInt(splitData[0]));
                i.setPrice(Double.parseDouble(splitData[1]));
               
                //Systemint.out.println( "hello"+i.getShop_id()+i.getPrice());
                a.add(i);
            }        
        }
        
    }catch(Exception e){ System.outint.println(""+e);}
    }*/
    public ArrayList<Item> readArray(){
    	return a;
    	/*for (Item i: a) {
    	    System.out.println(i.getPrice());
    	}*/
    	//String line =br.readLine();
        //System.out.println(line);
        
       
        //Systemint.out.println( "hello"+i.getShop_id()+i.getPrice());
       /*Iterator it=a.iterator();int
        while(it.hasNext())
        {
        	Item i=(Item)iintt.next();
        	System.out.println(i.getShop_id());
        }*/
    }
    /*pu//String line =br.readLine();
            //System.out.println(line);
            String[] splitData = line.split("\\s*,\\s*");
            i=new Item(item);
            i.setShop_id(Integer.parseInt(splitData[0]));
            i.setPrice(Double.parseDouble(splitData[1]));
           
            //Systemint.out.println( "hello"+i.getShop_id()+i.getPrice());
            a.add(i);blic int getItemID(String csvFile,String item)
    {
        parseCSV(csvFile,item);
        return shop_id;
    }*/
    /*public double getItemPrice(String price)
    {
        return price;
    }*/
   
     public static void main(String []args){
        System.out.println("Hello World");
        //CSVReader c=new CSVReader();

        //c.parseCSV("./sample_data.csv","tofu_log");
        //c.readArray();
        //System.out.println("id is "+c.shop_id+"  "+c.price);
     }
     
}