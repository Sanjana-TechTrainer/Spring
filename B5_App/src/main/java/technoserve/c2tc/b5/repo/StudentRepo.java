package technoserve.c2tc.b5.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import technoserve.c2tc.b5.entities.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
	

}
