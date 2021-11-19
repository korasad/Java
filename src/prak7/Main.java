package prak7;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Deque<Integer> deque1 = new ArrayDeque<>();
        Deque<Integer> deque2 = new ArrayDeque<>();

        int k = 0;
        int s;

        Scanner in = new Scanner(System.in);

        for(int i = 0; i < 5; i++) deque1.addLast(in.nextInt());

        for(int i = 0; i < 5; i++) deque2.addLast(in.nextInt());

        while(!deque1.isEmpty() & !deque2.isEmpty()){
            int a = deque1.getFirst();
            int b = deque2.getFirst();

            deque1.pollFirst();
            deque2.pollFirst();

            if(k >= 106){ System.out.println("botva"); break;}
            else
            if(a == 0 & b == 9){
                deque1.addLast(a);
                deque1.addLast(b);
            }
            else if(a == 9 & b == 0){
                deque2.addLast(b);
                deque2.addLast(a);
            }
            else if(a > b){
                deque1.addLast(a);
                deque1.addLast(b);
            }
            else if(b > a){
                deque2.addLast(b);
                deque2.addLast(a);
            }
            k++;
        }
        if(deque1.isEmpty()) System.out.println("second " + k);
        else
            System.out.println("first " + k);

    }

}
