
public class Account {
	
	private int id;
	private String holder;
	private long number, agency;
	private double limit, balance;
	
	public Account () {
		super();
	}
	
	public Account (int id, Long number, Long agency, String holder, double limit, double balance) {
		super();
		this.id = id;
		this.number = number;
		this.agency = agency;
		this.holder = holder;
		this.limit = limit;
		this.balance = balance;
	}
	
	public Account (long number, long agency, String holder, double limit, double balance) {
		super();
		this.number = number;
		this.agency = agency;
		this.holder = holder;
		this.limit = limit;
		this.balance = balance;
	}
	
	public int getId () { return this.id; }
	
	public void setId (int id) { this.id = id; }
	
	public long getNumber () { return this.number; }
	
	public void setNumber (long number) { this.number = number; }
	
	public long getAgency () { return this.agency; }
	
	public void setAgency (long agency) { this.agency = agency; }
	
	public String getHolder () { return this.holder; }
	
	public void setHolder (String holder) { this.holder = holder; }
	
	public double getLimit () { return this.limit; }
	
	public void setLimit (double limit) { this.limit = limit; }
	
	public double getBalance () { return this.balance; }
	
	public void setBalance (double balance) { this.balance = balance; }
	
	

}
