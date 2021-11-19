package prak9;

public interface methods {
    Person search_by_name(String name) throws database.StudentNotFoundExeption;
    Boolean search(Person key)  throws database.StudentNotFoundExeption;

}