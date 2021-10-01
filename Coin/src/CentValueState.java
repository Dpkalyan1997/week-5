
public class CentValueState implements CoinState
{

	@Override
	public void cent(CoinContext context) {
		System.out.println("The Value of Cent is 0.01 dollars");
		context.setState(this);
		
	}

	@Override
	public void nickel(CoinContext context) 
	{
		System.out.println("5cents = 1 nickel");
		context.setState(this);
	}

	@Override
	public void dollar(CoinContext context) 
	{
		System.out.println("100cents = 1dollar");
		context.setState(this);
	}
	
    public String toString(){
       return "Cent Value State";
    }
}
