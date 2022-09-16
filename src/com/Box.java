package com;

public class Box<T> {
    private T box;

    public Box(T box) {
        this.box = box;
    }

    public T getBox() {
        return box;
    }

    public void setBox(T box) {
        this.box = box;
    }
    public static <box> void generic(box T){

    }
}
