import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        Scanner scanner = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            myLinkedList.add(scanner.nextLine());
        }
        System.out.println("Выход из 1 цикла");
        for (int i = 0; i <= 9; i++) {
            myLinkedList.getElement(scanner.nextInt());
        }
        scanner.close();
    }
}

