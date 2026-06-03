package in.prajwal.billingsoftware.repository;

import in.prajwal.billingsoftware.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface categoryRepository extends JpaRepository<CategoryEntity, Long> {
}
