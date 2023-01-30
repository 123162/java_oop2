
package example;
class Person{
    private String name;

    public Person(String name) {
        this.name = name;
        System.out.println("1");
    }
    
}
class Student extends Person{
    
    public Student(String name) {
        super(name);
        System.out.println("3");
    }
    public Student(){
        this("student");
        System.out.println("2");
    }
    
}
public class Example {

    public static void main(String[] args) {
       Student s=new Student();
    }
    
}
