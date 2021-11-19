package lab10;

import java.io.File;
import java.util.ArrayList;

public class Ther<E> {
    private String dir = System.getProperty("user.dir");
    private ArrayList<E> items = new ArrayList<>();
    public Ther()
    {
        File f = new File(this.dir + "/src/Labratory");
        String[] items = f.list();
        for(int i = 0; i < 5; i++)
        {
            this.items.add((E) items[i]);
        }
        for(E elemt : this.items)
            System.out.println(elemt);
    }
}