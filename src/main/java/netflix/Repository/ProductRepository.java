package netflix.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;  

import org.springframework.data.jpa.repository.JpaRepository;

import netflix.Entities.*;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByNameContainingIgnoreCase(String keyword, Pageable pageable);
    List<Product> findByNameContainingIgnoreCase(String keyword);
}