package in.prajwal.billingsoftware.controller;

import in.prajwal.billingsoftware.dto.CategoryRequest;
import in.prajwal.billingsoftware.dto.CategoryResponse;
import in.prajwal.billingsoftware.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/categories")
public class CategoryController {


    private final CategoryService categoryService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CategoryResponse addCategory(@RequestBody CategoryRequest categoryRequest) {
        return categoryService.add(categoryRequest);
    }

    @GetMapping
    public List<CategoryResponse> fetchCategories() {
        return categoryService.read();
    }

    @DeleteMapping("/{categoryId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCategory(@PathVariable String categoryId) {
        try{
            categoryService.delete(categoryId);
        }
        catch (RuntimeException e){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,e.getMessage());
        }
    }
}
