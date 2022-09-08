package SpringConstructorInjection.constructor;

public class Person {
     private  String name;
     private  int id;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
