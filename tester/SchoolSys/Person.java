package tester.SchoolSys;

public abstract class Person {
    protected String name;    
    //protected int id;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getRole();

    @Override
    public String toString() {
        return "my role is " + getRole();
    }
}


