package guru.springframework.Spring5WebApp.repository;

import guru.springframework.Spring5WebApp.Domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {

}
