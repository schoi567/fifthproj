package simplilearn.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import simplilearn.entity.*;

public interface TodoRepository extends JpaRepository<Todo, Long>  {
	List<Todo> findByUsername(String username); 
	Todo findById(long id);
}
