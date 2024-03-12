import com.google.gson.Gson;

class Student {
    String name;
    int age;
    String email;

    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 20, "johndoe@example.com");

        Gson gson = new Gson();


        String json = gson.toJson(student);
        System.out.println("Serialized JSON: " + json);

        Student deserializedStudent = gson.fromJson(json, Student.class);
        System.out.println("Deserialized Student: " + deserializedStudent.name + ", " + deserializedStudent.age + ", " + deserializedStudent.email);
    }
}
