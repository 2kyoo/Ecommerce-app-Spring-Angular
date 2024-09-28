package org.p2kyoo.backend.ecommerce.repository;


import org.p2kyoo.backend.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
