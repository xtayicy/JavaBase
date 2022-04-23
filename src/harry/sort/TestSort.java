package harry.sort;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import org.junit.Test;

/**
 * 
 * @author harry
 *
 */
public class TestSort {
	@Test
	public void testTreeSet() {
		User user1 = new User("tom", 23);
		User user2 = new User("jack", 21);

		TreeSet<User> treeSet = new TreeSet<User>();
		treeSet.add(user1);
		treeSet.add(user2);
		System.out.println(treeSet);
	}

	@Test
	public void testSort() {
		List<User> users = new ArrayList<User>();
		User user1 = new User("tom", 23);
		User user2 = new User("jack", 21);
		users.add(user1);
		users.add(user2);

		Collections.sort(users);

		System.out.println(users);
	}

	@Test
	public void testSort1() {
		List<Person> persons = new ArrayList<Person>();
		Calendar instance = Calendar.getInstance();
		Person person1 = new Person("tom", instance.getTime(), 100D);
		instance.set(Calendar.DAY_OF_MONTH, instance.get(Calendar.DAY_OF_MONTH) - 1);
		Person person2 = new Person("jack", instance.getTime(), 200D);

		persons.add(person1);
		persons.add(person2);

		Collections.sort(persons, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				if (o1.getBirth().equals(o2.getBirth()))
					return o1.getBalance().compareTo(o2.getBalance());

				if (o1.getBalance().equals(o2.getBalance()))
					return o1.getName().compareTo(o2.getName());

				return o1.getBirth().compareTo(o2.getBirth());
			}
		});
		
		System.out.println(persons);
	}
}
