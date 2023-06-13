package June_9_2023;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

    public class Studentsort {
        public static class Student implements Comparable<Student> {
            private String firstName;
            private String lastName;
            private double gpa;

            public Student(String firstName, String lastName, double gpa) {
                this.firstName = firstName;
                this.lastName = lastName;
                this.gpa = gpa;
            }

            public String getFirstName() {
                return firstName;
            }

            public String getLastName() {
                return lastName;
            }

            public double getGpa() {
                return gpa;
            }

            @Override
            public int compareTo(Student other) {
                return this.lastName.compareTo(other.lastName);
            }
        }
        public static void main(String[] args) {

            List<Student> students = new ArrayList<>();
            ;
            try (BufferedReader br = new BufferedReader(new FileReader("/Users/vhemanthkumar/Desktop/students.csv"))) {
                String line;
                br.readLine();
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");
                    String firstName = data[0].trim();
                    String lastName = data[1].trim();
                    double gpa = Double.parseDouble(data[2].trim());
                    students.add(new Student(firstName, lastName, gpa));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            Collections.sort(students);

            for (Student student : students) {
                System.out.println("Name: " + student.getFirstName() + " " + student.getLastName() +
                        ", GPA: " + student.getGpa());
            }
        }

    }


