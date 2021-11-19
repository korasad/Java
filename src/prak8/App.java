package prak8;

class App {
    public static void main(String[] args) {
        WaitList<Integer> list1 = new WaitList();
        WaitList<Integer> list2 = new BounderWaitList(5);
        UnfairWaitList<Integer> list3 = new UnfairWaitList();

        list1.add(8);
        System.out.println (list1.isEmpty());


        System.out.println ("Первый список: ");
        list1.printQ();

        list2.add(3);
        list2.add(1);
        list2.add(2);
        list2.remove(2);
        System.out.println ("Второй список: ");
        list2.printQ();

        list3.add(45);
        list3.remove(45);
        list3.add(78);
        list3.add(89);
        list3.moveToBack(78);
        System.out.println ("Третий список: ");
        list3.printQ();

    }
}
