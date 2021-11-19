package prak9;

import java.util.ArrayList;
import java.util.Scanner;

public class database implements methods {


    class StudentNotFoundExeption extends Exception
    {
        public StudentNotFoundExeption(String errmessg)
        {
            super(errmessg);
        }
    }

    private Scanner scanner = new Scanner(System.in);
    private ArrayList<Person> database = new ArrayList<>();

    public database()
    {
        System.out.print("Введите количество элементов ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++)
        {
            try
            {
                System.out.println("Введите ИНН и имя ");
                database.add(new Person(scanner.nextInt(), scanner.nextLine().trim()));
            }
            catch (EmptyStringExeption err)
            {
                System.out.println("Person name can't be empty");
                i--;
            }
        }
    }

    public Person search_by_name(String name) throws StudentNotFoundExeption
    {
        Person temp = new Person();
        for(Person s : database)
        {
            if(s.Name.equals(name))
                temp = s;
        }
        if(temp.INN == -1)
        {
            throw new StudentNotFoundExeption("Student not in databasse");
        }
        return temp;
    }

    public Boolean search(Person key)  throws StudentNotFoundExeption
    {
        for(Person s : database)
        {
            if(s.Name.equals(key.Name) && s.INN == key.INN) {
                return true;
            }
            if(s.Name.equals(key.Name) && s.INN != key.INN) {
                throw new StudentNotFoundExeption("INN is not valid");
            }
        }
        return false;
    }
}