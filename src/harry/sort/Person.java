package harry.sort;

import java.util.Date;

/**
 * 
 * @author harry
 *
 */
public class Person {
	private String name;
	private Date birth;
	private Double balance;

	@Override
	public String toString() {
		return "Person [name=" + name + ", birth=" + birth + ", balance=" + balance + "]";
	}

	public Person(String name, Date birth, Double balance) {
		super();
		this.name = name;
		this.birth = birth;
		this.balance = balance;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
}
