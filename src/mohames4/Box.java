/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mohames4;

public class Box {

    private static final int minX = 0;
    private static final int minY = 0;

    private final int maxX;
    private final int maxY;

    private int x = minX;
    private int y = minY;

    public Box(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void push(Vector v) {
        // passes vector object as a parameter 

        if (v.getDirection().equalsIgnoreCase("R")) {
            x += v.getMagnitude();
           //gets vector objects direction by using getdir methond and magnitude by getmag method

        } else if (v.getDirection().equalsIgnoreCase("U")) {
            y -= v.getMagnitude();

        } else if (v.getDirection().equalsIgnoreCase("L")) {
            x -= v.getMagnitude();

        } else if (v.getDirection().equalsIgnoreCase("D")) {
            y += v.getMagnitude();
        }

        if (x > maxX) {

            x = maxX;

        } else if (x < minX) {
            x = minX;
        }
        
        if (y >maxX){
            y = maxX;
            
        }else if (y<minX){
            y = minX;
        }
    }

}
