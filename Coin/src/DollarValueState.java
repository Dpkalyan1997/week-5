
public class DollarValueState implements CoinState
{

	@Override
	public void cent(CoinContext context) {
		System.out.println("100cents = 1 dollar");
		context.setState(this);
		
	}

	@Override
	public void nickel(CoinContext context) 
	{
		System.out.println("20nickel = 1 dollar");
		context.setState(this);
	}

	@Override
	public void dollar(CoinContext context) 
	{
		System.out.println("The value of dollar is $1");
		context.setState(this);
	}
	
    public String toString(){
       return "Dollar Value State";
    }
}
