public class Prototype
{
    public static void main(String[] args) throws CloneNotSupportedException {
    hash Hash = new hash();
    Student Igor = new Student(18, "Igor");

    Hash.setStudent(Igor);
    System.out.println(Igor);
    Student clone = hash.getStudent();
        System.out.println(clone);
    }

    static class Student implements Cloneable {
        int age;
        String name;

        @Override
        public String toString() {
            return "Student{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }

        public Student(int age, String name) {
            this.age = age;
            this.name = name;

        }

        @Override
        protected Object clone() throws CloneNotSupportedException
        {
            return (Student) super.clone();
        }
    }

    static class hash {
        private static Student student;

        public static Student getStudent() throws CloneNotSupportedException {
           return (Student) student.clone();
        }

        public void setStudent(Student student)
        {
            this.student = student;
        }
    }
}
