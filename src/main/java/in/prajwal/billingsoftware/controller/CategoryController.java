package in.prajwal.billingsoftware.controller;

import in.prajwal.billingsoftware.dto.CategoryRequest;
import in.prajwal.billingsoftware.dto.CategoryResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    @PostMapping
    public CategoryResponse addCategory(@RequestBody CategoryRequest categoryRequest) {
        return null;
    }
}
