class Person<T>{
    private String name;
    private int age;
    T part;
}

class Students extends Person<String>{

}

class Teacher<E> extends Person<E>{
    
}

public class Demo2 {
    public static void main(String[] args) {
        Person<String> person = new Person<>();
        person.part = "string";
        System.out.println(person.part);
    }

}
