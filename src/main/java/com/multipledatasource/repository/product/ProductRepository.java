package com.multipledatasource.repository.product;

import com.multipledatasource.model.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Abdur Rahim Nishad
 * @since 2021/28/03
 */
@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
