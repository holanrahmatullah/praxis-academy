package onlineapp;

import java.util.Scanner;

public class Program4
{
 	public static void main(String[] args) {

System.out.println("Here's a simple multiplication table using nested loops:");
for (int j = 1; j <= 10; j++)
{
    for (int i = 1; i <= 10; i++)
    {
        System.out.print((i * j) + " ");
    }
    System.out.println();
}
	}
}