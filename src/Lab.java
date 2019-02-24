public class Lab {
    private Student[] students;
    private int dayOfTheWeek;
    private int currentCapacity;
    private int capacity;
    public Lab (int dayOfTheWeek, int capacity){
        this.dayOfTheWeek = dayOfTheWeek;
        this.capacity = capacity;
        this.currentCapacity = 0;
        this.students = new Student[capacity];
    }
    public void enrollStudent(Student std){
        if (this.currentCapacity < capacity) {
            students[this.currentCapacity] = std;
            this.currentCapacity++;
        }
    }
    public Student[] getStudents(){
        return this.students;
    }
    public float getAverage(){
        float avg = 0;
        for (int i = 0 ; i < this.currentCapacity; i++)
            avg += this.students[i].getGrade();
        avg /= this.currentCapacity;
        return avg;
    }
    public int getCurrentCapacity(){
        return this.currentCapacity;
    }
    public int getDayOfTheWeek(){
        return this.dayOfTheWeek;
    }
}
