package rocks.zipcode.Repository;

//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rocks.zipcode.Category.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {












}
