import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStream {
    public static void main(String[] args) {

        List<Student> ls = List.of(
                new Student("ab", 21),
                new Student("cd",  41),
                new Student("ab", 21),
                new Student("cd",  41),
                new Student("bb", 12)
        );


        List<Student> collect1 = ls.stream().distinct().collect(Collectors.toList());

        List<Student> collect = ls.stream().sorted(Comparator.comparingInt(s2 -> s2.age)).collect(Collectors.toList());

        List<Student> collect2 = ls.stream().map(student -> {
            student.name = student.name.toUpperCase();
            return student;
        }).collect(Collectors.toList());


        collect2.stream().forEach(student -> System.out.println(student.name + "  " + student.age));
        System.out.println("done");
    }

}

class Student{
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean isSame(Student s1, Student s2) {
        return s1.name.equals(s2.name) && s1.age == s2.age;
    }

    @Override
    public boolean equals(Object o) {
        return this.hashCode() == o.hashCode();
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}