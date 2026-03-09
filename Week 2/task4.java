import java.util.*;
import java.util.stream.*;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Util {
    public static boolean isOlder(Person p, int ageLimit) {
        return p.age > ageLimit;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        List<Person> persons = new ArrayList<>();

        for(int i = 0; i < n; i++){
            String name = sc.next();
            int age = sc.nextInt();
            persons.add(new Person(name, age));
        }

        int ageLimit = sc.nextInt();

        //  Sort alphabetically by name (method reference)
        persons.stream()
                .map(p -> p.name)
                .sorted(String::compareTo)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        //  Filter persons older than ageLimit (static method reference)
        persons.stream()
                .filter(p -> Util.isOlder(p, ageLimit))
                .map(p -> p.name)
                .forEach(name -> System.out.print(name + " "));
        System.out.println();

        //  Convert names to uppercase (instance method reference)
        persons.stream()
                .map(p -> p.name)
                .map(String::toUpperCase)
                .forEach(name -> System.out.print(name + " "));
    }
}