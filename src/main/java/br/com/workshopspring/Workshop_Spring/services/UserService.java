package br.com.workshopspring.Workshop_Spring.services;

import br.com.workshopspring.Workshop_Spring.domain.User;
import br.com.workshopspring.Workshop_Spring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }
}
