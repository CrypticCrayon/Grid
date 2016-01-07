/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mohames4;

import java.util.Scanner;

public class GridApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        Grid grid1 = new Grid(10, 10);
        String dir;
        int mag;

        do {
            grid1.draw();
            System.out.println("Please enter (U)p, (D)own, (L)eft, (R)ight, or (E)xit: ");
            dir = sc.next();

            if (!dir.equalsIgnoreCase("E")) {
                System.out.println("Enter a magnitude (integer)");
                mag = sc.nextInt();

                Vector v = new Vector(dir, mag);

                grid1.getBox().push(v);
            }

        } while (!dir.equalsIgnoreCase("E"));

    }

}
