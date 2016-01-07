/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mohames4;


public class Vector {

    private final String direction;
    private final int magnitude;

    public Vector(String direction, int magnitude) {
        this.direction = direction;
        this.magnitude = magnitude;
    }

    public String getDirection() {
        return direction;
    }

    public int getMagnitude() {
        return magnitude;
    }
    
    
    
}
