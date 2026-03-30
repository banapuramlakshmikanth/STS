package com.project.STS.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "placement_status")
public class PlacementStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double readinessScore;
    private String hiringChance;
    private String recommendedRole;

    @OneToOne
    @JoinColumn(name = "student_id")
    private User user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getReadinessScore() {
		return readinessScore;
	}

	public void setReadinessScore(Double readinessScore) {
		this.readinessScore = readinessScore;
	}

	public String getHiringChance() {
		return hiringChance;
	}

	public void setHiringChance(String hiringChance) {
		this.hiringChance = hiringChance;
	}

	public String getRecommendedRole() {
		return recommendedRole;
	}

	public void setRecommendedRole(String recommendedRole) {
		this.recommendedRole = recommendedRole;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public PlacementStatus(Long id, Double readinessScore, String hiringChance, String recommendedRole, User user) {
		super();
		this.id = id;
		this.readinessScore = readinessScore;
		this.hiringChance = hiringChance;
		this.recommendedRole = recommendedRole;
		this.user = user;
	}

	public PlacementStatus() {
		super();
		// TODO Auto-generated constructor stub
	}
    
}
