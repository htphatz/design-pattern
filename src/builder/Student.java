package builder;

public class Student {
    private String id;
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    private String email;
    private String university;

    public Student(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
        this.email = builder.email;
        this.university = builder.university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", university='" + university + '\'' +
                '}';
    }

    public static class Builder {
        private String id;
        private String name;
        private int age;
        private String address;
        private String phoneNumber;
        private String email;
        private String university;

        public Builder(String id) {
            this.id = id;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder university(String university) {
            this.university = university;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }
}
