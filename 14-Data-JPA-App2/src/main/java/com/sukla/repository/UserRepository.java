package com.sukla.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sukla.entity.User;

public interface UserRepository extends CrudRepository<User, Integer>
{
	/*
	public List<User> findByCountry(String cname);

	// retrieve the user whose age is 36
	public List<User> findByAge(Integer age);

	// retrieve the user whose age is greater than 20
	public List<User> findByAgeGreaterThanEqual(Integer age);

	public List<User> findByCountryIn(List<String> cname);
	//select * from USER_MASTER where user_country="India" and user_age =25;
	public List<User> findByCountryAndAge(String cname, Integer age);
	//select * from USER_MASTER where user_country="India" and user_age =25 and user_gender="Male";
	public List<User> findByCountryAndAgeAndGender(String cname, Integer age,String gender);
	*/
	
	@Query(value = "from User")
	public List<User> getAllUsersHql();
	
	@Query(value = "select * from USER_MASTER", nativeQuery = true)
	public List<User> getAllUsersSql();
	
	@Query(value="From User where country=:cname")
	public List<User> getAllUsersByCountry(String cname);
	
	@Query(value="From User where country=:cname and age=:age")
	public List<User> getAllUsersByCountryAndAge(String cname,Integer age);

}
