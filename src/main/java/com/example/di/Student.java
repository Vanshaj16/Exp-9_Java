package com.example.di;

public class Student {
    private Course course;

    // Constructor injection
    public Student(Course course) {
        this.course = course;
    }

    public void showInfo() {
        System.out.println("🎓 Student bean created successfully!");
        course.displayCourse();
    }
}
