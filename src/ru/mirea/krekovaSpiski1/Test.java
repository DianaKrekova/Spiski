package ru.mirea.krekovaSpiski1;

public class Test {
    public static void main(String[] args) {
        Group gr = new Group();
        for (int i=0;i<=2;i++){
            gr = Group.insert(gr);
        }
        gr.printList(gr);
    }
}
