package inheritance;

public class Person {
    int id;
    String fName;
    String lName;
    int age;
    public void seeFeatures(){
        System.out.println(getId() + " - " + fName + " " +
        lName + " " + age);
    }
    public int getId(){
        return id;
    }
}
