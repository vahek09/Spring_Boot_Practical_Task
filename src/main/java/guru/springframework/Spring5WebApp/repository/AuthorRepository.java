package guru.springframework.Spring5WebApp.repository;

import guru.springframework.Spring5WebApp.Domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
