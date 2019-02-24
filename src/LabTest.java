public class LabTest {
    public static void main(String[] args) {
        Lab lab = new Lab(5, 20);
        lab.enrollStudent(new Student("Roham", "Zendehdel", "9731088"));
        lab.enrollStudent(new Student("AmirHossein", "Rajabpoor", "9731086"));
        lab.enrollStudent(new Student("AmirMahdi", "ZarrinNejad", "9731087"));
        lab.getStudents()[0].setGrade(20);
        lab.getStudents()[1].setGrade(15);
        lab.getStudents()[2].setGrade(18);
        System.out.println("Average = " + lab.getAverage());
        System.out.println("Day of the week = " + lab.getDayOfTheWeek());
        System.out.println("Current Capacity = " + lab.getCurrentCapacity());
        System.out.println("Student1 Name = " + lab.getStudents()[0].getFirstName() + " " + lab.getStudents()[0].getLastName());
    }
}
