package prak9;

public class Person {
    int INN;
    String Name;

    public Person()
    {
        this.INN = -1;
        this.Name = "NONE";
    }
    public Person(int INN, String Name) throws EmptyStringExeption
    {
        this.INN = INN;
        if(Name.isEmpty())
            throw new EmptyStringExeption("Person name can't be empty");
        this.Name = Name;
    }
}