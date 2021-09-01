package br.com.workshopspring.Workshop_Spring.repository;

import br.com.workshopspring.Workshop_Spring.domain.Post;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {
}
