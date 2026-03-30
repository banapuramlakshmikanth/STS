package com.project.STS.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_details")
public class StudentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phone;
    private String collegeName;
    private String branch;
    private String degree;
    private Double cgpa;
    private Integer graduationYear;

    private String githubLink;
    private String linkedinLink;

    @Column(length = 1000)
    private String skills;

    @Column(length = 1000)
    private String certifications;

    @Column(length = 1000)
    private String achievements;

    @Column(length = 1000)
    private String internshipDetails;

    @Column(length = 1000)
    private String careerObjective;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public Double getCgpa() {
		return cgpa;
	}

	public void setCgpa(Double cgpa) {
		this.cgpa = cgpa;
	}

	public Integer getGraduationYear() {
		return graduationYear;
	}

	public void setGraduationYear(Integer graduationYear) {
		this.graduationYear = graduationYear;
	}

	public String getGithubLink() {
		return githubLink;
	}

	public void setGithubLink(String githubLink) {
		this.githubLink = githubLink;
	}

	public String getLinkedinLink() {
		return linkedinLink;
	}

	public void setLinkedinLink(String linkedinLink) {
		this.linkedinLink = linkedinLink;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getCertifications() {
		return certifications;
	}

	public void setCertifications(String certifications) {
		this.certifications = certifications;
	}

	public String getAchievements() {
		return achievements;
	}

	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}

	public String getInternshipDetails() {
		return internshipDetails;
	}

	public void setInternshipDetails(String internshipDetails) {
		this.internshipDetails = internshipDetails;
	}

	public String getCareerObjective() {
		return careerObjective;
	}

	public void setCareerObjective(String careerObjective) {
		this.careerObjective = careerObjective;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public StudentDetails(Long id, String phone, String collegeName, String branch, String degree, Double cgpa,
			Integer graduationYear, String githubLink, String linkedinLink, String skills, String certifications,
			String achievements, String internshipDetails, String careerObjective, User user) {
		super();
		this.id = id;
		this.phone = phone;
		this.collegeName = collegeName;
		this.branch = branch;
		this.degree = degree;
		this.cgpa = cgpa;
		this.graduationYear = graduationYear;
		this.githubLink = githubLink;
		this.linkedinLink = linkedinLink;
		this.skills = skills;
		this.certifications = certifications;
		this.achievements = achievements;
		this.internshipDetails = internshipDetails;
		this.careerObjective = careerObjective;
		this.user = user;
	}

	public StudentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
