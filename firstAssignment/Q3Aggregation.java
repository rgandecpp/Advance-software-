package firstAssignment;

class Instructor {
    private String firstName;
    private String lastName;
    private String officeNumber;

    public Instructor(String firstName, String lastName, String officeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    // Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}

class Textbook {
    private String title;
    private String author;
    private String publisher;

    public Textbook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}

class Course {
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String courseName, Instructor instructor, Textbook textbook) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    // Print function
    public void print() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
        System.out.println("Textbook: " + textbook.getTitle() + " by " + textbook.getAuthor());
    }
}

public class Q3Aggregation {
    public static void main(String[] args) {
        // Single instructor and textbook
        Instructor instructor1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook textbook1 = new Textbook("Clean Code", "Robert C. Martin", "Prentice Hall");
        Course course1 = new Course("Advanced Software Engineering", instructor1, textbook1);
        course1.print();

        System.out.println();

        // Two instructors and textbooks
        Instructor instructor2 = new Instructor("Daisy", "Tang", "7-102");
        Instructor instructor3 = new Instructor("Gilbert", "Young", "9-104");
        Textbook textbook2 = new Textbook("Cloud Computing, Complete AWS", "John, Sam, Jack and Crystal", "Darelene");
        Textbook textbook3 = new Textbook("Advance algo design", "Dan sun", "Ruchitha");
        Course course2 = new Course("Cloud Computing", instructor2, textbook2);
        Course course3 = new Course("Advance algorithm design", instructor3, textbook3);
        course2.print();
        System.out.println();
        course3.print();
    }
}
