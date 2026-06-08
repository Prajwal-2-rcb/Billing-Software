package in.prajwal.billingsoftware.service;

import in.prajwal.billingsoftware.dto.CategoryRequest;
import in.prajwal.billingsoftware.dto.CategoryResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface CategoryService {

     CategoryResponse add(CategoryRequest categoryRequest, MultipartFile multipartFile) throws IOException;

     List<CategoryResponse> read();

     void delete(String categoryId);
}
