package org.example;

public class Rectangle {

    public int area(int length, int height) {
        return length * height;
    }

    public int perimeter(int length, int height) {
        return 2 * (length + height);
    }

    public boolean isTriangle(int a, int b, int c) {
        return (a < b + c) && (b < a + c) && (c < a + b);
    }
}

