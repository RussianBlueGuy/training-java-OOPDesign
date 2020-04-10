package lesson8;

import java.util.Date;
import java.util.List;

public class CustomerTransaction implements Accounting, Reporting {
	
	private List<Product> products;
	private Customer customer;
	
	public CustomerTransaction(Customer customer, List<Product> products) {
		super();
		this.customer = customer;
		this.products = products;
	}

	// methods for reporting
	@Override
	public String getName() {
		return customer.getName();
	}
	
	@Override
	public Date getDate() {
		return new Date();
	}
	
	@Override
	public String productBreakDown() {
		String reportListing = null;
		for (Product product : products) {
			reportListing += product.getProductName();
		}
		return reportListing;
	}
	
	// methods for accounts receivable
	@Override
	public void prepareInvoice() {
		System.out.println("invoice prepared...");
	}
	
	@Override
	public void chargeCustomer() {
		System.out.println("charged the customer...");
	}

}
