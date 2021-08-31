package br.com.workshopspring.Workshop_Spring.repository;

import br.com.workshopspring.Workshop_Spring.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
