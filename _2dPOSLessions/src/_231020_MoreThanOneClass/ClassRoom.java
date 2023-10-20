package _231020_MoreThanOneClass;

public class ClassRoom {
    private String nameOfClass;
    // this is an empty array of Student-objects!
    // there are currently NO student-objects in this array
    private Student[] students = new Student[36];
    private int currentStudentAmount = 0;

    public ClassRoom(String nameOfClass){
        this.nameOfClass = nameOfClass;
    }

    public void addStudent(Student student){
        students[currentStudentAmount] = student;
        currentStudentAmount++;
    }

    public Student getStudentById(int id){
        // Your turn: find the student in students by id.
    }

    @Override
    public String toString(){
        // your turn
        /*
        name of class: DHIF22
            List of Students:
         */
        // build a new stringbuilder object to build a string
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("name of class" + this.nameOfClass);
        stringBuilder.append("\n");
        stringBuilder.append("List of Students\n");
        for(int i = 0; i < currentStudentAmount; i++){
            stringBuilder.append(students[i].toString());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom("DHIF22");
        System.out.println(classRoom);

    }

}
