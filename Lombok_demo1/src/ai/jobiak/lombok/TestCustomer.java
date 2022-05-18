package ai.jobiak.lombok;

public class TestCustomer {

	public static void main(String[] args) {

		Customer c = new Customer();
		c.setCustid(111L);
		c.setName("Naveen");
		c.setBalance(10000);
		System.out.println(c);
	}

}
