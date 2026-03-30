package com.project.STS.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.STS.entity.Project;
import com.project.STS.entity.StudentDetails;
import com.project.STS.entity.TestResult;
import com.project.STS.repository.ProjectRepository;
import com.project.STS.repository.StudentDetailsRepository;
import com.project.STS.repository.TestResultRepository;

@Service
public class StudentService {

    @Autowired
    private StudentDetailsRepository studentDetailsRepository;

    @Autowired
    private ProjectRepository projectRepository;

    @Autowired
    private TestResultRepository testResultRepository;

    // Save or Update Student Details
    public StudentDetails saveStudentDetails(StudentDetails details) {
        return studentDetailsRepository.save(details);
    }

    // Get Student Details
    public StudentDetails getStudentDetails(Long userId) {
        return studentDetailsRepository.findByUserId(userId).orElse(null);
    }

    // Add Project
    public Project addProject(Project project) {
        return projectRepository.save(project);
    }

    // Get Student Projects
    public List<Project> getProjects(Long userId) {
        return projectRepository.findByUserId(userId);
    }

    // Add Test Result
    public TestResult addTestResult(TestResult testResult) {
        return testResultRepository.save(testResult);
    }

    // Get Test Results
    public List<TestResult> getTestResults(Long userId) {
        return testResultRepository.findByUserId(userId);
    }
}
