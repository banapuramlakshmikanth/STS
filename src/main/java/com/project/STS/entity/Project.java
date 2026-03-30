package com.project.STS.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "projects")
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(length = 1000)
    private String description;

    private String githubLink;
    private String deployedLink;
    private String techStack;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getGithubLink() {
		return githubLink;
	}

	public void setGithubLink(String githubLink) {
		this.githubLink = githubLink;
	}

	public String getDeployedLink() {
		return deployedLink;
	}

	public void setDeployedLink(String deployedLink) {
		this.deployedLink = deployedLink;
	}

	public String getTechStack() {
		return techStack;
	}

	public void setTechStack(String techStack) {
		this.techStack = techStack;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Project(Long id, String title, String description, String githubLink, String deployedLink, String techStack,
			User user) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.githubLink = githubLink;
		this.deployedLink = deployedLink;
		this.techStack = techStack;
		this.user = user;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}

