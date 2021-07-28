
import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String name;
    private LocalDate birthDate;


    private class Position {
        protected double salary ;
        protected String name ;

        public String toString() {
            return name +":" + salary;
        }
    }

    public Person (String name, String bDate) {
        this.name = name;
        this.birthDate = LocalDate.parse(bDate);
    }

    Position position = new Position();

    public int getAge() {
        LocalDate today = LocalDate.now();
        Period p = Period.between(this.birthDate, today);
        int age = p.getYears();
        return age;
    }

    public void setPosition(String nm, double pSalary) {
        position.name = nm;
        position.salary = pSalary;
    }

    public String getPosition(){
        return position.name + "salary: " + position.salary;
    }

    public String toString() {
          return "name: " + name + "\n" +
            "age: " + getAge() + "\n" +
            "position: " + position.name + "\n" +
            "salary: " + position.salary;
    }
}

    /* TODO Create a constructor for Person that takes in two Strings. A name and a birthdate in ISO format (yyyy-mm-dd) and sets the corresponding memeber variables correctly */
    /* TODO Create a member variable (of Person) of type Position.*/
    /* TODO Create a getAge method that returns the age in years of this person. You need to use the Period class here.*/
    /* TODO Code the setPosition method. This should take one String and one double for the title and the salary respectively.*/

    /* TODO A getter for position.*/

    /* TODO Override the toString() method to display the person's name, age and position (with salary and title).*/
/* TODO Finish closing curly braces and the class.*/
