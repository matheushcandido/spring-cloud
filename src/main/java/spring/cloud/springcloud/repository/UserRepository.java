package spring.cloud.springcloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.cloud.springcloud.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
