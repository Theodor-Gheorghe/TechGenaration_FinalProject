package gentech.ecommercebackend.repository;

import gentech.ecommercebackend.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
