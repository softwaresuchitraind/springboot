package com.sukla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.sukla.entity.Product;
import com.sukla.repo.ProductRepository;

@SpringBootApplication
public class Application
{

	public static void main(String[] args)
	{
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		ProductRepository repository = context.getBean(ProductRepository.class);

		Product p1 = new Product();
		// p1.setPid(103);
		p1.setPname("keyboard");
		p1.setPrice(500.00);

		repository.save(p1);
	}

}
