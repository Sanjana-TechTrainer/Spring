package technoserve.c2tc.b5.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import technoserve.c2tc.b5.entities.Student;
import technoserve.c2tc.b5.repo.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentRepo sr;

	@Override
	public void addStudent(Student s) {
		sr.save(s);
		
	}

	@Override
	public Student getStudent(int uid) {
		return sr.findById(uid).get();
	}
	
	@Override
	public List<Student> getAllStudent() {
		return sr.findAll();
	}

	@Override
	public Student updateStudent(Student s) {
		sr.save(s);
		return s;
	}

	@Override
	public String deleteStudent(int uid) {
		Student s=sr.findById(uid).get();
		sr.delete(s);
		return "The student with uid="+uid+" is succesfully deleted;";
	}

}
