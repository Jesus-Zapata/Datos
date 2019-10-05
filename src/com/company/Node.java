package com.company;

public class Node {
    private Plant plant;

    private Node next;


    public Node(Plant plant, Node next) {
        this.plant = plant;
        this.next = next;
    }

    public Node() {

    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public Plant getPlant() {
        return plant;
    }

    public void setPlant(Plant plant) {
        this.plant = plant;
    }
}
