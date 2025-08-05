package EMSCode.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import EMSCode.Entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {

}