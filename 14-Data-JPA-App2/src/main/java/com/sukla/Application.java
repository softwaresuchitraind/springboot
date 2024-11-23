package com.sukla;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sukla.entity.User;
import com.sukla.repository.UserRepository;

@SpringBootApplication
public class Application
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserRepository repository = context.getBean(UserRepository.class);

		/*
		 * User u1 = new User(101,"Ramu","Male",25,"India"); //repository.save(u1); User
		 * u2 = new User(102,"Raju","Female",26,"USA"); User u3 = new
		 * User(103,"Sam","Female",27,"Canada"); User u4 = new
		 * User(104,"kesh","male",36,"Africa");
		 * 
		 * repository.saveAll(Arrays.asList(u2,u3,u4));
		 * 
		 * Optional<User> byId = repository.findById(103);
		 */
		/*
		 * if(byId.isPresent()) { System.out.println(byId.get()); }
		 */

		// Iterable<User> allById = repository.findAllById(Arrays.asList(102,103,104));

		/*
		 * Iterable<User> allById = repository.findAll();
		 * 
		 * allById.forEach(emp->
		 * 
		 * { System.out.println(emp); } );
		 */

		/*
		 * long count = repository.count(); System.out.println(count);
		 * 
		 * boolean existsById = repository.existsById(103);
		 * System.out.println("Existed Id "+existsById);
		 */

		// repository.deleteById(103);

		// repository.deleteAllById(Arrays.asList(102,104));

		/*
		 * List<User> findbycountry = repository.findByCountry("India");
		 * findbycountry.forEach(user -> { System.out.println(user); });
		 */
		/*
		 * List<User> findbyage = repository.findByAge(36); findbyage.forEach(user -> {
		 * System.out.println(user); });
		 */
		/*
		 * List<User> byAgeGreaterThanEqual = repository.findByAgeGreaterThanEqual(27);
		 * byAgeGreaterThanEqual.forEach(user -> { System.out.println(user); });
		 */
		/*
		 * List<User> byCountryIn =
		 * repository.findByCountryIn(Arrays.asList("India","USA"));
		 * byCountryIn.forEach(user->{ System.out.println(user); });
		 */
		/*
		 * List<User> byCountryAndAge = repository.findByCountryAndAge("India", 25);
		 * byCountryAndAge.forEach(user->{ System.out.println(user); });
		 */
		/*
		 * List<User> byCountryAndAge = repository.findByCountryAndAgeAndGender("India",
		 * 25,"Male"); byCountryAndAge.forEach(user->{ System.out.println(user); });
		 */

		List<User> allUsersHql = repository.getAllUsersHql();

		allUsersHql.forEach(user ->
		{
			System.out.println(user);
		}

		);
		System.out.println("============================");

		List<User> allUsersSql = repository.getAllUsersSql();

		allUsersSql.forEach(user ->
		{
			System.out.println(user);
		}

		);
		
		System.out.println("============================");

		List<User> allUsersbyCountry = repository.getAllUsersByCountry("India");

				allUsersbyCountry.forEach(user ->
		{
			System.out.println(user);
		}

		);
	}

}
