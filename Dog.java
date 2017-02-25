public class Dog
{
	private DogBreed breed;
	private DogColor color;
	private double price;
	
	public Dog()
	{
		this.breed=breed;
		this.color=color;
		this.price=price;
	}

	public Dog(DogBreed b, DogColor c, double p)
	{
		setBreed(b);
		setColor(c);
		setPrice(p);
	}

	public void setBreed(DogBreed b)
	{
		this.breed=b;
	}
	public void setColor(DogColor c)
	{
		this.color=c;
	}
	public void setPrice(double p)
	{
		this.price=p;
	}
	public DogBreed getBreed()
	{
		return breed;
	}
	public DogColor getColor()
	{
		return color;
	}
	public double getPrice()
	{
		return price;
	}

	public String toString()
	{
		return String.format("%s:%s \n%s:%s\n %s:%.2f\n","Breed",getBreed(),"Color",getColor(),"Price",getPrice());
	}
}
