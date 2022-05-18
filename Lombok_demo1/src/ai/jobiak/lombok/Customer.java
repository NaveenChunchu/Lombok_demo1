package ai.jobiak.lombok;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@ToString
public class Customer {

	@Setter
	@Getter
	private long custid;
	@Setter
	@Getter
	private String name;
	@Setter
	@Getter
	private double balance;
	

	
	
}
