package com.multipledatasource;

import com.multipledatasource.repository.product.ProductRepository;
import com.multipledatasource.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class Application {

//    @Autowired
//    private BookRepository bookRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    public void addData2DB() {
//        userRepository.saveAll(Stream.of(new User(744, "John"), new User(455, "Pitter")).collect(Collectors.toList()));
//        productRepository.saveAll(Stream.of(new Product(1, "Apple", 100), new Product(2, "Orange", 300)).collect(Collectors.toList()));
//        User user = new User();
//        user.setName("Nishad");
//        user = userRepository.save(user);
//        bookRepository.saveAll(
//                Stream.of(new Book(111, "Core Java"), new Book(222, "Spring Boot")).collect(Collectors.toList()));
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
