package in.kaushiklahiri.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import in.kaushiklahiri.onlinebookstore.dto.BookCategory;

@RepositoryRestResource(collectionResourceRel="bookCategory", path="book-category")
@CrossOrigin("*")
//@Repository
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
