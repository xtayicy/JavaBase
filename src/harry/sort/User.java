package harry.sort;

/**
 * 
 * @author harry
 *
 */
public class User implements Comparable<User>{
	private String username;
	private Integer age;

	@Override
	public String toString() {
		return "User [username=" + username + ", age=" + age + "]";
	}

	public User(String username, Integer age) {
		super();
		this.username = username;
		this.age = age;
	}

	public User() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public int compareTo(User o) {
		if(this.username.equals(o.getUsername())){
			return o.age - this.age;
		}
		
		return username.compareTo(o.getUsername());
	}
}
