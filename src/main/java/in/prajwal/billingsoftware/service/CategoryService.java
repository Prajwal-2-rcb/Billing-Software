package in.prajwal.billingsoftware.service;

import in.prajwal.billingsoftware.dto.CategoryRequest;
import in.prajwal.billingsoftware.dto.CategoryResponse;

import java.util.List;

public interface CategoryService {

     CategoryResponse add(CategoryRequest categoryRequest);

     List<CategoryResponse> read();

     void delete(String categoryId);
}
