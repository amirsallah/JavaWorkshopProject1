public class Student {
    // the student’s first name
    private String firstName;

    // the student’s last name
    private String lastName;

    // the student ID
    private String id;

    //the grade
    private int grade;


    public Student(String fName, String lname, String sID) {
        firstName = fName;
        lastName = lname;
        id = sID;
        grade = 0;
    }

    //     @return firstName field
    public String getFirstName() {
        return this.firstName;
    }

    //     @param firstName set first name of a student
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    //     @param lastName set last name of a student
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //     @return lastName field
    public String getLastName() {
        return lastName;
    }

    //     @return grade field
    public int getGrade() {
        return grade;
    }

    //     @param grade set grade number of a student
    public void setGrade(int grade) {
        this.grade = grade;
    }

    //     @return id number field
    public String getId() {
        return id;
    }

    //    @param id set id number of a student
    public void setId(String id) {
        this.id = id;
    }


    // Print the student’s last name and ID number to the output terminal.
    public void print() {
        System.out.println(lastName + ", student ID: "
                + id + ", grade: " + grade);
    }
}