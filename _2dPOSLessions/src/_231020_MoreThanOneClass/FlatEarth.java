package _231020_MoreThanOneClass;

public class FlatEarth {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom("DHIF23");
        System.out.println(classRoom);

        Student student = new Student(1, "Ernst", "Lustig");
        classRoom.addStudent(student);
        System.out.println(classRoom);

        Student studentOther = new Student(4, "Mike", "Tyson");
        classRoom.addStudent(studentOther);
        System.out.println(classRoom);

        // Your turn: Rename Mike Tyson to Mike Tyson-Maier.
        studentOther.setLastName("Tyson-Maier");
        // call System.out.println(classRoom);
        System.out.println(classRoom);

        ClassRoom dhif24 = new ClassRoom("dhif24");

        for(int i = 0; i < 36; i++){
            Student tempStudent = new Student(i+1, "unknown", "LastName unknown" + i);
            dhif24.addStudent(tempStudent);
        }
        System.out.println(dhif24);
    }
}
