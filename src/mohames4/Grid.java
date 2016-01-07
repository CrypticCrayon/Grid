/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mohames4;


public class Grid {

    private static final char WALL_TOP_BOTTOM = 0x2550;
    private static final char WALL_LEFT_RIGHT = 0x2551;
    private static final char WALL_TOP_LEFT_CORNER = 0x2554;
    private static final char WALL_TOP_RIGHT_CORNER = 0x2557;
    private static final char WALL_BOTTOM_RIGHT_CORNER = 0x255D;
    private static final char WALL_BOTTOM_LEFT_CORNER = 0x255A;
    private static final char BOX_CHAR = 0x2588;
    private static final char EMPTY = 0x2591;

    private final int verticalSize;
    private final int horizontalSize;
    private final Box box;

    public Grid(int verticalSize, int horizontalSize) {
        this.verticalSize = verticalSize;
        this.horizontalSize = horizontalSize;
        
        //this does not need a box parameter but we need to create a box while new grid is created
        this.box = new Box(horizontalSize-1, verticalSize-1);
    }

    public int getVerticalSize() {
        return verticalSize;
    }

    public int getHorizontalSize() {
        return horizontalSize;
    }

    public Box getBox() {
        
        return box;
    }

    

    public void draw() {
    // TODO! NOT DONE

        System.out.print(WALL_TOP_LEFT_CORNER);
        for (int i = 0; i < horizontalSize; i++) {
            System.out.print(WALL_TOP_BOTTOM);
        }
        System.out.print(WALL_TOP_RIGHT_CORNER);
        System.out.println();
        for (int i = 0; i < verticalSize; i++) {
            System.out.print(WALL_LEFT_RIGHT);
            for (int j = 0; j < horizontalSize; j++) {
                if (i == box.getY() && j == box.getX()) {
                    System.out.print(BOX_CHAR);
                } else {
                    System.out.print(EMPTY);
                }
            }
            System.out.print(WALL_LEFT_RIGHT);
            System.out.println();
        }
        System.out.print(WALL_BOTTOM_LEFT_CORNER);
        for (int i = 0; i < horizontalSize; i++) {
            System.out.print(WALL_TOP_BOTTOM);
        }
        System.out.print(WALL_BOTTOM_RIGHT_CORNER);
        System.out.println();
    }
}
