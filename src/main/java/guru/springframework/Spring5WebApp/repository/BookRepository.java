package guru.springframework.Spring5WebApp.repository;

import guru.springframework.Spring5WebApp.Domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
