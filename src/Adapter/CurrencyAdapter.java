package Adapter;

public class CurrencyAdapter {

	private String currency;
	
	public CurrencyAdapter(String currency) {
		this.currency=currency;
	}
	
	public String getIncome(int income) {
		if(currency.equals("USD")) {
			return "$ "+income;
		}
		else if(currency.equals("IDR")) {
			income = income *15000;
			return "Rp. "+income;
		}
		else if (currency.equals("YEN")) {
			income = income*136;
			return "¥ " + income;
		}
		return null;
	}

}
