package com.project.STS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.STS.entity.Project;
import com.project.STS.entity.StudentDetails;
import com.project.STS.entity.TestResult;
import com.project.STS.service.StudentService;

@RestController
@RequestMapping("/api/student")
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Save or Update Student Details
    @PostMapping("/details")
    public StudentDetails saveStudentDetails(@RequestBody StudentDetails details) {
        return studentService.saveStudentDetails(details);
    }

    // Get Student Details
    @GetMapping("/details/{userId}")
    public StudentDetails getStudentDetails(@PathVariable Long userId) {
        return studentService.getStudentDetails(userId);
    }

    // Add Project
    @PostMapping("/project")
    public Project addProject(@RequestBody Project project) {
        return studentService.addProject(project);
    }

    // Get Projects
    @GetMapping("/projects/{userId}")
    public List<Project> getProjects(@PathVariable Long userId) {
        return studentService.getProjects(userId);
    }

    // Add Test Result
    @PostMapping("/test")
    public TestResult addTestResult(@RequestBody TestResult testResult) {
        return studentService.addTestResult(testResult);
    }

    // Get Test Results
    @GetMapping("/tests/{userId}")
    public List<TestResult> getTestResults(@PathVariable Long userId) {
        return studentService.getTestResults(userId);
    }
}

