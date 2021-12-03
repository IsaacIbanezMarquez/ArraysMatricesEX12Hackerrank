
import java.io.*;
import java.util.*;


// Matriu trasposada:

/* Fer un programa que llegeixi una taula numèrica i escrigui la taula transposada. La taula transposada s'obté canviant les files per les columnes.

Input Format

Introduïm N M: enters i defineixen el tamany de la matriu. Introduïm NxM enters que seran els valors corresponents a la matriu.

Constraints

No n'hi ha.

Output Format

S'imprimeix la matriu trasposada.

Sample Input 0

3 3
1 0 0
1 1 0
1 1 1
Sample Output 0

1 1 1
0 1 1
0 0 1
Sample Input 1

4 10
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
1 2 3 4 5 6 7 8 9 10
Sample Output 1

1 1 1 1
2 2 2 2
3 3 3 3
4 4 4 4
5 5 5 5
6 6 6 6
7 7 7 7
8 8 8 8
9 9 9 9
10 10 10 10

 */


public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lado1A = sc.nextInt();
        int lado2A = sc.nextInt();
        int [][] A = new int [lado1A] [lado2A];


        for (int x=0; x < lado1A; x++)
        {
            for (int y=0; y < lado2A; y++)
            {
                A[x][y] = sc.nextInt();
            }
        }





        int i = 0;
        for (int x=0; x < lado2A; x++)
        {
            for (int y=0; y < lado1A; y++)
            {

                if (i == lado1A)
                {
                    System.out.println(" ");
                    i=0;
                }
                System.out.print(A[y][x] + " ");
                i++;
            }
        }

    }
}
