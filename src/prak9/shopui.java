package prak9;

import java.util.Scanner;

public class shopui {
    private Scanner scanner = new Scanner(System.in);
    public shopui(database DATA) {
        while (true) {
            try {
                //Ввод ИНН и фамилии
                System.out.println("Введите Инн и Имя для поиска");
                Person temp = new Person(scanner.nextInt(), scanner.nextLine().trim());
                System.out.println(DATA.search(temp));
            } catch (EmptyStringExeption err) {
                System.out.println("Person can't be with empty name");
            } catch (database.StudentNotFoundExeption err) {
                System.out.println("INN is not valid");
            }
            try {
                //Поиск по имени
                System.out.println("Введите имя");
                String temp = scanner.nextLine().trim();
                System.out.println(DATA.search_by_name(temp));
            } catch (database.StudentNotFoundExeption err) {
                System.out.println("Student not in databasse");
            }
        }
    }
}