package com.javalessons.oop.innerclasses;

public class Display {

    private static final int DISPLAY_HEIGHT = 1920;
    private static final int DISPLAY_WIDTH = 1280;

    public Display() {
        Pixel pixel = new Pixel(10, 10, Color.BLUE);

    }

    private static class Pixel {

        private int x, y;
        private Color color;

        public Pixel(int x, int y, Color color) {
            if (x <= DISPLAY_WIDTH && y <= DISPLAY_HEIGHT && x >= 0 && y >= 0) {
                this.x = x;
                this.y = y;
                this.color = color;
                System.out.println("Creating pixel with coordinates " + x + ", " + y + ", color " + color);
            } else {
                throw new IllegalArgumentException("Coordinates y and x should be between "
                        +DISPLAY_HEIGHT+" and "+DISPLAY_WIDTH);
            }
        }
    }

    public enum Color {RED, GREEN, BLUE, CYAN, MAGENTA, YELLOW, BLACK}

}
