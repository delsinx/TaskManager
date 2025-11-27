package Repository;

import Model.TasksModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface tasks extends JpaRepository<TasksModel,Long> {
}
