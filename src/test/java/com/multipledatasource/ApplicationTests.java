package com.multipledatasource;

import com.multipledatasource.model.user.User;
import com.multipledatasource.repository.product.ProductRepository;
import com.multipledatasource.repository.user.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
@EnableTransactionManagement
class ApplicationTests {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ProductRepository productRepository;
    @Test
    void contextLoads() {
    }
    @Test
    @Transactional("userTransactionManager")
    public void whenCreatingUser_thenCreated() {
        User user = new User();
        user.setName("sss");
        user = userRepository.save(user);
        assertNotNull(userRepository.findById(user.getId()));
    }
}
