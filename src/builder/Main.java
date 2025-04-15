package builder;

public class Main {
    public static void main(String[] args) {
        Student student = new Student.Builder("123")
                .address("123 Main St")
                .university("XYZ University")
                .phoneNumber("09xxxxxxx")
                .name("Tan Phat")
                .age(20)
                .email("phat@gmail.com")
                .build();

        System.out.println("Student info: " + student);
    }
}
