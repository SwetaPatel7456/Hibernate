package com.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private  int pid;
	private  String projectname;
	@ManyToMany
	private List<Emp> emps;
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", projectname=" + projectname + ", emps=" + emps + "]";
	}
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int pid, String projectname, List<Emp> emps) {
		super();
		this.pid = pid;
		this.projectname = projectname;
		this.emps = emps;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProjectname() {
		return projectname;
	}
	public void setProjectname(String projectname) {
		this.projectname = projectname;
	}
	public List<Emp> getEmps() {
		return emps;
	}
	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}
}
