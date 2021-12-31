package in.greatlearning.Employee_Management.repositories;

import in.greatlearning.Employee_Management.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    User getByUsername(String username);
    User getByPassword(String password);
}
