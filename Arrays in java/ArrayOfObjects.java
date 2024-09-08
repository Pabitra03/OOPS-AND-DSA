class Student{
    int rollno;
    String name;
    int marks;
}
public class ArrayOfObjects {
    public static void main(String[] args) {
        // Create an array of objects
        Student s1 = new Student();
        s1.rollno =1;
        s1.name = "pabitra";
        s1.marks = 95;

        Student s2 = new Student();
        s2.rollno =2;
        s2.name = "Harsh";
        s2.marks = 88;

        Student s3 = new Student();
        s3.rollno =3;
        s3.name = "Meena";
        s3.marks = 98;

        Student Students[] = new Student[3];
        Students[0] = s1;
        Students[1] = s2;
        Students[2] = s3;

        for(int i=0 ; i<Students.length; i++){
            System.out.println(Students[i].name + " : " + Students[i].marks);
        }

    }
    
}
