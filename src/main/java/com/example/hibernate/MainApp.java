package com.example.hibernate;

public class MainApp {
    public static void main(String[] args) {
        StudentDao dao = new StudentDao();

        // Create
        dao.createStudent(new Student("Alice", "alice@gmail.com"));
        dao.createStudent(new Student("Bob", "bob@gmail.com"));

        // Read
        System.out.println("Fetching all students: " + dao.listStudents());

        // Update
        Student s = dao.getStudent(1);
        s.setName("Alice Updated");
        dao.updateStudent(s);

        // Delete
        dao.deleteStudent(2);
    }
}
