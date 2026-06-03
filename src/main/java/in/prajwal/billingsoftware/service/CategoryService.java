package in.prajwal.billingsoftware.service;

import in.prajwal.billingsoftware.dto.CategoryRequest;
import in.prajwal.billingsoftware.dto.CategoryResponse;

public interface CategoryService {

     CategoryResponse add(CategoryRequest categoryRequest);
}
