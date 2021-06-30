package application;

interface ColonConstructor {
    Student getStudent(String name);
}

class Student {
    Student(String name) {
        System.out.println(name + " is successfully enrolled!");
    }
}

public class ConstructorReferenceDemo {

    public static void main(String[] args) {

        ColonConstructor c = Student::new;
        c.getStudent("Maria");
    }
}
