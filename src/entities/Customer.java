package entities;

public class Customer extends User{
	private String firstName;
	private String lastName;
	private int birthOfYear;
	private String tckn;
	
	public Customer(int id, String email, String password, String firstName, String lastName, int birthOfYear,
			String tckn) {
		super(id, email, password);
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthOfYear = birthOfYear;
		this.tckn = tckn;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBirthOfYear() {
		return birthOfYear;
	}

	public void setBirthOfYear(int birthOfYear) {
		this.birthOfYear = birthOfYear;
	}

	public String getTckn() {
		return tckn;
	}

	public void setTckn(String tckn) {
		this.tckn = tckn;
	}
	
	
	
}
