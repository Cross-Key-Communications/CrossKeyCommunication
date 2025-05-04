package rocks.zipcode.Controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import rocks.zipcode.Category.Category;
import rocks.zipcode.Service.CategoryService;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Controller
public class CategoryController {

    private CategoryService service;

    @Autowired
    public CategoryController(CategoryService service) {
        this.service = service;
    }
@GetMapping(value = "/category")
public ResponseEntity<Iterable<Category>> index(){
        return new ResponseEntity<>(service.index(), HttpStatus.OK);
}

@GetMapping(value = "/category/{id}")
    public ResponseEntity<Category> show(@PathVariable Long id){
        return new ResponseEntity<>(service.show(id), HttpStatus.OK);
}
@PostMapping(value = "/category")
    public ResponseEntity<Category> create(@RequestBody Category category) {
        return new ResponseEntity<>(service.create(category), HttpStatus.OK);
}
@PutMapping(value = "/category/{id}")
    public ResponseEntity<Category> update(@PathVariable Long id, @RequestBody Category category ) {
return new ResponseEntity<>(service.update(id, category), HttpStatus.OK);
}
@DeleteMapping(value = "/category/{id}")
public ResponseEntity<Boolean>destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
}




}
