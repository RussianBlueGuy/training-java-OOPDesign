package lesson8;

public class AccountsReceivable {
	
	private Accounting transactionObject;
	
	public AccountsReceivable(Accounting aTransaction) {
		super();
		this.transactionObject = aTransaction;
	}

	public void postPayment() {
		transactionObject.chargeCustomer();
	}
	
	public void sendInvoice() {
		transactionObject.prepareInvoice();
		// sends the invoice
	}

}
