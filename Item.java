import java.util.*;
import java.lang.*;
import java.io.*;
class Item
{
	ArrayList<String> item_names;
	double price;
	Item(ArrayList<String> itemNames)
	{
		this.item_names=itemNames;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return this.price;
	}
	public ArrayList<String> getNames()
	{
		return this.item_names;
	}
}