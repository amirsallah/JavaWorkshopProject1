public class Run {
    public static void main(String[] args) {
        Student std1 = new Student("Ehsan", "Edalat", "9031066");
        Student std2 = new Student("Seyed", "Ahmadpanah", "9031806");
        Student std3 = new Student("Ahmad", "Asadi", "9031054");
        Lab lab1 = new Lab(12, "sunday");

        std1.print();
        std1.setGrade(15);
        std1.print();


        std2.print();
        std2.setGrade(11);
        std2.print();


        std3.print();
        std3.setFirstName("HamidReza");
        std3.print();

        lab1.enrollStudent(std1);
        lab1.enrollStudent(std2);

        lab1.print();

    }
}
