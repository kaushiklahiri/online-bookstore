package in.kaushiklahiri.onlinebookstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import in.kaushiklahiri.onlinebookstore.dto.Book;

//@RepositoryRestResource(collectionResourceRel="bookCategories", path="book-category")
//@Repository
@CrossOrigin("*")
public interface BookRepository extends JpaRepository<Book, Long> {

}
