package technoserve.c2tc.b5.Service;

import java.util.List;

import technoserve.c2tc.b5.entities.Student;

public interface StudentService {
	public void addStudent(Student s);

	public Student getStudent(int uid);

	public List<Student> getAllStudent();

	public Student updateStudent(Student s);

	public String deleteStudent(int uid);
}
