package com.example.demotestMongodb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableMongoRepositories(basePackages = "com.repository")
public class DemotestMongodbApplication {

//	@Autowired
//	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemotestMongodbApplication.class, args);
	}

//	@PostConstruct
//	public void populateData() {
//		ProductEntity product1 = new ProductEntity();
//		product1.setName("iPhone 12");
//		product1.setPrice(549.99);
//		product1.setDescription("Very nice iPhone!");
//
//		ProductEntity product2 = new ProductEntity();
//		product2.setName("MacBook Pro 2023");
//		product2.setPrice(2149.99);
//		product2.setDescription("Very nice MacBook Pro!");
//
//		productRepository.save(product1);
//		productRepository.save(product2);
//	}
}
