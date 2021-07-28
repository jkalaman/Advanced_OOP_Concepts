public class Task {
    public static void main(String[] args) {
        Person p = new Person("Kim Possible", "2000-01-01");
        p.setPosition("Associate", 34000);
        Resume r = new Resume(p);
        Resume.Education ed = r.new Education("NEIU", "Computer Science");
        /* TODO Create an education object. Schoo is NEIU, major is Computer Science.*/
        /* TODO add this education object to the resume "r"*/
        r.addEducation(ed);
        Resume.Experience ex = new Resume.Experience("Busboy", 2004, 2007);
        /* TODO Create a new Experience object and add it to the resume.*/
        /* TODO Create a new experience object on the fly, inside the addExperiece call.*/
        r.addExperience(ex);
        r.addExperience(new Resume.Experience("Analyst", 2012, 2013));
        r.addExperience(new Resume.Experience("Sr Analyst", 2013, 2016));
        System.out.println(r); //watch the resume print.
    }
/* TODO This code is exactly the same as in Task 3 and should yield the same output.*/
}