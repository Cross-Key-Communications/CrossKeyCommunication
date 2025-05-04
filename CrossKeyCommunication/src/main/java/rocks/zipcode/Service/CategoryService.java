package rocks.zipcode.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import rocks.zipcode.Category.Category;
import rocks.zipcode.Repository.CategoryRepository;

@Service
public class CategoryService {

    private CategoryRepository repository;
    @Autowired
    public CategoryService(CategoryRepository repository){
        this.repository = repository;
    }


    public Iterable<Category> index() {
        return repository.findAll();
    }

    public Category show(Long id) {
        return repository.findById(id).get();
    }

    public Category create(Category category) {
        return repository.save(category);
    }

public Category update (Long id, Category newCategoryData) {
        Category originalCategory = repository.findById(id).get();
    originalCategory.setName(newCategoryData.getName());
    originalCategory.setId(newCategoryData.getId());
    return repository.save(originalCategory);
}

public Boolean delete(Long id){
        repository.deleteById(id);
        return true;
}

}
