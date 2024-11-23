package com.sukla.service;

import java.io.File;
import java.io.FileInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sukla.entity.User;
import com.sukla.repo.UserRepository;

@Service
public class UserService
{
	@Autowired
	private UserRepository userRepo;
	
	public void saveUser() throws Exception
	{
		String imagePath="D:\\images\\images.jpeg";
		User user = new User();
		user.setUserName("Suchitra");
		user.setUserEmail("suchitra@gmail.com");
		
		long size = Files.size(Paths.get(imagePath));
		byte[] arr = new byte[(int)size];
		FileInputStream fis = new FileInputStream(new File(imagePath));
		fis.read(arr);
		fis.close();
		user.setUserImage(arr);
		
		userRepo.save(user);
		
	}
}
