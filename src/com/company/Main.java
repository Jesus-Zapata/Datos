package com.company;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        try{
	    LinkedList list = new LinkedList();
	    Lector lector = new Lector(list);
	    lector.leer();
	    list.display();
        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }

    }
}
