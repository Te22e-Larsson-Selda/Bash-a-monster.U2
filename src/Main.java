import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);

        Character p1 = new Character();
        p1.health = 100;
        p1.name = "player1";

        System.out.println(p1.name + " has " + p1.health + " health");

        Character p2 = new Character();
        p2.health = 100;
        p2.name = "player2";


        System.out.println("press space to attack");
        String ans = sc.nextLine();

        if (ans.equals(" ")) {
            p2.changeHealth(10);
            p1.changeHealth(5);

        }
    }


}