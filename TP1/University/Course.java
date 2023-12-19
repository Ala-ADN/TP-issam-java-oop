package TP1.University;

public class Course {
    private int courseID;
    private String courseName;
    private Instructor instructor;
    public Course(int courseID, String courseName, Instructor instructor) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.instructor = instructor;
    }
    public int getCourseID() {
        return courseID;
    }
    public String getCourseName() {
        return courseName;
    }
    public String getInstructor() {
        return instructor.getFirstName() + " " + instructor.getLastName();
    }
}
