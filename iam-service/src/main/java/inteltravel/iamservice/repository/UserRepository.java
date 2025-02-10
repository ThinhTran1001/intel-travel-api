package inteltravel.iamservice.repository;

import inteltravel.iamservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<String, User> {
}
