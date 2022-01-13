package com.company;

public class Person implements Comparable <Person>{
   private String name;
   private  int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(Person person) {
        //obratniy poryadok
     //   return person.getName().compareTo(name);
       return person.getAge()- age;
        // return  age - person.getAge();
      // po poryadku po alfavitu
       //  return  name.compareTo(person.getName());
    }
}