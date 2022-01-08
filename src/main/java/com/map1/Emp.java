package com.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Emp {
	@Id
    private int empid;
    private String name;
    
    @ManyToMany
    //@JoinTable(
    //name = "emp_learn",
    //joinColumns = {@JoinColumn(name = "eid")},
    //inverseJoincolumns = {@JoinColumn(name = "pid")}
    //)
    private List<Project> projects;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public List<Project> getProjects() {
		return projects;
	} 
	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}
	public Emp(int empid, String name, List<Project> projects) {
		super();
		this.empid = empid;
		this.name = name;
		this.projects = projects;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [empid=" + empid + ", name=" + name + ", projects=" + projects + "]";
	}
}
