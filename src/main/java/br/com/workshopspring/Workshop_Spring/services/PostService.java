package br.com.workshopspring.Workshop_Spring.services;

import br.com.workshopspring.Workshop_Spring.domain.Post;
import br.com.workshopspring.Workshop_Spring.repository.PostRepository;
import br.com.workshopspring.Workshop_Spring.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public List<Post> findAll() {
        return repo.findAll();
    }

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
}
