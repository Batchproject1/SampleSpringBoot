package com.javatpoint.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY, region = "local")
@Table(name = "project")

public class Project {
	@Id
	// @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "desc")
	private String desc;

	@Column(name = "sprint")
	private String sprint;

	public Project() {

	}

	public Project(int id, String desc, String sprint) {
		this.id = id;
		this.desc = desc;
		this.sprint = sprint;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getSprint() {
		return sprint;
	}

	public void setSprint(String sprint) {
		this.sprint = sprint;
	}
	
	@Override
	public String toString() {
		return "Project [id=" + id + ", desc=" + desc + ", sprint=" + sprint + "]";
	}

}
