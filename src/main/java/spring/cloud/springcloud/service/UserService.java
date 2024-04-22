package spring.cloud.springcloud.service;

import org.springframework.stereotype.Service;
import spring.cloud.springcloud.model.User;
import spring.cloud.springcloud.repository.UserRepository;

import java.util.NoSuchElementException;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository){
        this.repository = repository;
    }

    public User findById(Long id){
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    public User create(User user){
        if(user.getId() != null && repository.existsById(user.getId())){
            throw new IllegalArgumentException("This user is already exists.");
        }
        return repository.save(user);
    }

}
