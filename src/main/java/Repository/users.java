package Repository;

import Model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface users extends JpaRepository<UserModel, Long> {
}
