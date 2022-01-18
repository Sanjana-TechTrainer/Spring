package technoserve.c2tc.b5.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Entity
public class Student {
	@Id
	private int uid;
	private String name;
	public int getUid() {
		return uid;
	}
	public String getName() {
		return name;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
