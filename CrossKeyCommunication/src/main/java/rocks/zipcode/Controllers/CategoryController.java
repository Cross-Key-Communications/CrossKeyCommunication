package rocks.zipcode.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rocks.zipcode.Category.Category;
import rocks.zipcode.Repository.CategoryRepository;
import rocks.zipcode.Service.CategoryService;

//import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/category")
public class CategoryController {

    private CategoryService service;
private CategoryRepository categoryRepository;

    @Autowired
    public CategoryController(CategoryService service, CategoryRepository categoryRepository) {
        this.service = service;
        this.categoryRepository = categoryRepository;
    }

    @GetMapping
    @ResponseBody
    public Iterable<Category>getAllCategories(){
        return service.getAll();
    }

//@GetMapping(value = "/category")
//public ResponseEntity<Iterable<Category>> index(){
//        return new ResponseEntity<>(service.index(), HttpStatus.OK);
//}

//get a category by ID
@GetMapping(value = "/category/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable Long id){
        return new ResponseEntity<>(service.show(id), HttpStatus.OK);
}
@PostMapping(value = "/category")
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        return new ResponseEntity<>(service.create(category), HttpStatus.OK);
}
@PutMapping(value = "/category/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable Long id, @RequestBody Category category ) {
return new ResponseEntity<>(service.update(id, category), HttpStatus.OK);
}
@DeleteMapping(value = "/category/{id}")
public ResponseEntity<Boolean>destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
}




}
