package withdecorator;

import java.util.ArrayList;
import java.util.List;
import combinator.Customer;

public class EmailVal implements Validity{
	private Validity validity;
	private Customer customer;
	
	public EmailVal(Customer customer, Validity validity) {
      this.customer = customer;
	  this.validity = validity;	
	}
	
	@Override
	public Validity validations() {
		ArrayList<String> a = new ArrayList<String>();
		if(this.customer.email().contains("@")) {
			return Aggregation.callback("Email Not Valid",this,a);
		}
		 return Aggregation.callback("Email Valid",this,a);
	}
}
