
public class CoinValueTest {

	public static void main(String[] args) {
		CoinContext cc=new CoinContext();
		CentValueState cent=new CentValueState();
		cent.cent(cc);
		cent.nickel(cc);
		cent.dollar(cc);
		System.out.println(cc.getState().toString());
		
		NickleValueState n=new NickleValueState();
		n.nickel(cc);
		n.cent(cc);
		n.dollar(cc);
		System.out.println(cc.getState().toString());
		
		DollarValueState d = new DollarValueState();
		d.dollar(cc);
		d.cent(cc);
		d.nickel(cc);
		System.out.println(cc.getState().toString());

	}

}
