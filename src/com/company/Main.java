package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here

        Cat cat = new Cat("Mini", "Black", 10);
        Cat cat2 = new Cat("Mono", "White", 12);
        Cat[] cats = new Cat[2]; //creates 10 cats

        for (int i = 0; i<2; i++){
            Scanner sc = new Scanner (System.in);
            System.out.println("Type the name of the cat");
            String name = sc.next();
            System.out.println("Type the color of the cat");
            String color = sc.next();
            System.out.println("Type the weight of the cat");
            int weight = sc.nextInt();
            System.out.println("Type the breed of the cat");
            String breed = sc.next();

            cats[i] = new Cat (name,color,weight);

           // cats[i] = new Cat();
        }

        for (int i = 0; i<2; i++){
            cats[i].ShowMyInfo();
        }




    }
}
