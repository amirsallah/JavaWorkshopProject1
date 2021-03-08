public class Lab {
    private Student[] students;
    private int avg;
    private String day;
    private int capacity;
    private int currentSize;

    public Lab(int cap, String d) {
        capacity = cap;
        day = d;
        currentSize = 0;
        students = new Student[cap];
    }

    //    Placing the student on a chair
    public void enrollStudent(Student std) {
        if (currentSize < capacity) {
            students[currentSize] = std;
            currentSize++;
        } else {
            System.out.println("Lab is full!!!");
        }
    }

    public void print() {
        for (int temp = 0; students[temp] != null; ++temp)
            students[temp].print();
        calculateAvg();
        System.out.println("average:" + avg);
    }

    //  @return student information field
    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    // @return average of grades field
    public int getAvg() {
        return avg;
    }

    // calculate average of grades
    public void calculateAvg() {
        int sum = 0;
        int temp = 0;
        for (; students[temp] != null; ++temp)
            sum += students[temp].getGrade();
        avg = sum / temp;
    }

    //    @retern day lap
    public String getDay() {
        return day;
    }

    //   @param chenge day lab
    public void setDay(String day) {
        this.day = day;
    }

    //  @retern capacity field
    public int getCapacity() {
        return capacity;
    }

    //    @param cpacity set lab capacity
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}