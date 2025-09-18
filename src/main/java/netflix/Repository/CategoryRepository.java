package netflix.Repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;  

import org.springframework.data.jpa.repository.JpaRepository;

import netflix.Entities.*;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Page<Category> findByNameContainingIgnoreCase(String keyword, Pageable pageable);
    List<Category> findByNameContainingIgnoreCase(String keyword);
}