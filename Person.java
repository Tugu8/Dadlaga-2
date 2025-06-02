
class Person {
    String name; 
    int age;  

    void greet() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }
}