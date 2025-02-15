class Amount {
	private String currency;
	private int amount;
	
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount that) throws CurrenciesDoNotMatchException {
		if (!this.currency.equals(that.currency)) {
			// throwing a Checked exception. For unchecked exceptions rather than extending from Exception class, simply extend from the Runtime exception class and remove the throws clause.
			throw new CurrenciesDoNotMatchException("Currencies Don't Match. " + this.currency + " & " + that.currency);
		}
		this.amount = this.amount + that.amount;
	}
	
	@Override
	public String toString() {
		return "Amount [currency=" + currency + ", amount=" + amount + "]";
	}
	
}

class CurrenciesDoNotMatchException extends Exception {
	
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);
	}
	
}

public class CustomExceptionsRunner {

	public static void main(String[] args) throws CurrenciesDoNotMatchException {
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 20);
		
		amount1.add(amount2);
		System.out.println(amount1);
	}

}
