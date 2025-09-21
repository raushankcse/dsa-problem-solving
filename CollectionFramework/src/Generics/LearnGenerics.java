package Generics;

public class LearnGenerics {
  public static void main(String[] args) {
    
    Dog<String, String> d1 = new Dog<>("a123", "Leo" );

    Dog<Integer, String> d2 =new Dog<>(1, "Leo");

    System.out.println(d2.getName());






  }


}


class Dog<E,V> {

  E id;
  V name;

  public Dog(E id, V name){
    this.id = id;
    this.name = name;
  }



  V getName(){
    return name;
  }



}