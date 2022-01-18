package technoserve.c2tc.b5.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import technoserve.c2tc.b5.Service.StudentService;
import technoserve.c2tc.b5.entities.Student;

@RestController
public class Controller {
	@Autowired
	StudentService ss;
	@PostMapping("/addStudent")
	public void addStudent(@RequestBody Student s)
	{
		ss.addStudent(s);
	}
	@GetMapping("/getStudent/{uid}")
	public Student getStudent(@PathVariable int uid)
	{
		return ss.getStudent(uid);
	}
	@GetMapping("/getStudents")
	public List<Student> getAllStudent()
	{
		return ss.getAllStudent();
	}
	@PutMapping("/updateStudent")
	public Student updateStudent(@RequestBody Student s)
	{
		return ss.updateStudent(s);
	}
	@DeleteMapping("/deleteStudent/{uid}")
	public String deleteStudent(@PathVariable int uid)
	{
		return ss.deleteStudent(uid);
	}
}
