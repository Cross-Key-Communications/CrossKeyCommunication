package rocks.zipcode.Service;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import rocks.zipcode.Category.Category;
import rocks.zipcode.Repository.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }


    public Iterable<Category> getAll() {
        return categoryRepository.findAll();
        }

    public Category show(Long id) {
        return categoryRepository.findById(id).get();
    }

    public Category create(Category category) {
        return categoryRepository.save(category);
    }

public Category update (Long id, Category newCategory) {
        Category originalCategory = categoryRepository.findById(id).get();
    originalCategory.setName(newCategory.getName());
    originalCategory.setId(newCategory.getId());
    return categoryRepository.save(originalCategory);
}

public Boolean delete(Long id){
    categoryRepository.deleteById(id);
        return true;
}

}
