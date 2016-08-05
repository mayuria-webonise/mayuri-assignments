class Item
{
	String itemName;
	double price;
	Item(String itemName)
	{
		this.itemName=itemName;
	}
	public void setPrice(double price)
	{
		this.price=price;
	}
	public double getPrice()
	{
		return this.price;
	}
	public String getName()
	{
		return this.itemName;
	}
}