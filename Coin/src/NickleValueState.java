
public class NickleValueState implements CoinState
{

	@Override
	public void cent(CoinContext context) {
		System.out.println("5cents = 1 nickel");
		context.setState(this);
		
	}

	@Override
	public void nickel(CoinContext context) 
	{
		System.out.println("The value of Nickel is 0.05 dollars");
		context.setState(this);
	}

	@Override
	public void dollar(CoinContext context) 
	{
		System.out.println("20nickel = 1dollar");
		context.setState(this);
	}
	
    public String toString(){
       return "Nickel Value State";
    }
}

