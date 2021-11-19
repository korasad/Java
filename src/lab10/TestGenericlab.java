package lab10;

import java.util.ArrayList;

public class TestGenericlab
{
    public static void main(String[] args) {
        //задание 1
        One one = new One();
        ArrayList<Integer> Arr_1 = one.ArrayToArrayList( new Integer[] { 1 , 2, 4, 3} );
        System.out.println(Arr_1);
        //задание 2
        try {
            Sec Arr_2 = new Sec();
            Arr_2.add(1);
            Arr_2.add(2);
            Arr_2.add("Ara");
            Arr_2.add("123");
            System.out.println(Arr_2);
        }
        catch (Exception e)
        {
            System.out.println("Err");
        }
        //Задание 3
        try {
            System.out.println(one.getElemetn(3, new Integer[] { 1 , 2, 5, 20} ));
            System.out.println(one.getElemetn(3, new String[] { "A", "AB", "ABC", "ABCD", "ABCDE"} ));
        }
        catch (Exception e)
        {
            System.out.println("Err");
        }
        //Задание 4
        Ther<String> dir = new Ther<>();
    }
}
