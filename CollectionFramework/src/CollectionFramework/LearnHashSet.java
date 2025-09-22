package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

class Student{

  int rollNo;
  String name;

  public Student(int rollNo, String name){
    this.rollNo = rollNo;
    this.name = name;
  }

  @Override
  public String toString() {
    return "Student [rollNo=" + rollNo + ", name=" + name + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + rollNo;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Student other = (Student) obj;
    if (rollNo != other.rollNo)
      return false;
    return true;
  }

  




}


public class LearnHashSet {
  public static void main(String[] args) {
    Set<Student> set = new HashSet<>();

    Student s1 = new Student(1, "raushan");
    Student s2 = new Student(1, "raj");
    System.out.println(s1.equals(s2));

    set.add(new Student(1, "Raj"));
    set.add(new Student(2, "raushan"));

    System.out.println(set);


  }
}
