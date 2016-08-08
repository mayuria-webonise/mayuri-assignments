import java.util.ArrayList;

class Menu
{
	public ArrayList <Item> a=null;
	public Menu()
	{
		a=new ArrayList<Item>();
	}
	public void addItemToMenu(Item i)
	{
		a.add(i);
	}
	public Item getItem(String name){
		for(Item i: a)
		{
			ArrayList<String> iname=i.getNames();
			for(String s: iname)
			{
				if(s.equals(name))
				{
					return i;
					
				}
			}
			
		}
		return null;
	}
	public boolean searchItem(String name)
	{
		for(Item i: a)
		{
			ArrayList<String> iname=i.getNames();
			for(String s: iname)
			{
				if(s.equals(name))
				{
					return true;
					
				}
			}
		}
		return false;
		
		
	}
	/*public void getItemList()
	{
		CSVReader c=new CSVReader();
		a=new ArrayList <Item>();
		a=c.readArray();
		for(Item i: a)
		{
			System.out.println("food"+i.getName());
			System.out.println("food"+i.getPrice());
		}
	}*/
}