package com.company;

public class LinkedList {

    private Node top;

    public LinkedList() {
        top = null;
    }

    /****************************************************************
     *
     * Determines the size, that is, the number of elements in the list
     *
     * @return  the size of the list
     *
     ****************************************************************/
    public int getLen() {
        int len=0;
        Node n=top;
        while(n!=null){
            n=n.getNext();
            len++;
        }
        return len;
    }

    /****************************************************************
     *
     * Inserts a node before a specific index.  When the list is empty
     * that is, top = null, then the index must be 0. After the first
     * element is added, index must be:  0 <= index < size of list
     *
     * @param index a specific index into the list.
     *
     * @throws IllegalArgumentException if index < 0 or
     *          index >= size of the list
     ****************************************************************/

    public  void insertBefore (int index, double ph, double soilt, double soilm , double illu , double env_temp ,double env_hum ,String label) throws IllegalArgumentException {
        Plant plant=new Plant( ph,soilt,soilm , illu , env_temp ,env_hum ,label);
        if(this.getLen()==0 && index==0){
            Node n=new Node( plant, null);
            top=n;
        }else if(index >= this.getLen() || index<0){
            throw new IllegalArgumentException("Hay error");
        }else{
            int count = 0;
            Node temp = top;
            while(count < index-1){
                temp=temp.getNext();
                count++;
            }
            if(index==0){
                Node p=new Node(plant ,top);
                top=p;
            }else if(count+1!=getLen()){
                Node p=new Node(plant,temp.getNext());
                temp.setNext(p);
            }else{
                Node p=new Node(plant, null);
                temp.setNext(p);
            }

        }
    }

    /****************************************************************
     *
     * Inserts a node after a specific index.  When the list is empty
     * that is, top = null, then the index must be 0. After the first
     * element is added, index must be:  0 <= index < size of list
     *
     * @param index a specific index into the list.
     *
     * @throws IllegalArgumentException if index < 0 or
     *          index >= size of the list
     ****************************************************************/

    public void insertAfter (int index, double ph, double soilt, double soilm , double illu , double env_temp ,double env_hum ,String label) throws IllegalArgumentException{
        Plant plant=new Plant( ph,soilt,soilm , illu , env_temp ,env_hum ,label);
        if(index==0 && this.getLen()==0){
            Node nuevo=new Node(plant,top);
            top=nuevo;
        }else if( (index<0 || index>=this.getLen())&&this.getLen()!=0){
            throw new IllegalArgumentException("if index < 0 or index >= size of the list");
        }else{
            int count=0;
            Node temp=top;
            while(count<index){
                count++;
                temp=temp.getNext();
            }
            if(index==0){
                Node nuevo=new Node(plant,temp.getNext());
                top.setNext(nuevo);
            }else if(count!=this.getLen()-1){
                Node nuevo=new Node(plant,temp.getNext());
                temp.setNext(nuevo);
            }else{
                Node nuevo=new Node(plant,null);
                temp.setNext(nuevo);
            }
        }
    }

    /****************************************************************
     *
     * Removes the top element of the list
     *
     * @return returns the element that was removed.
     *
     * @throws RuntimeException if top == null, that is,
     *           there is no list.
     *
     ****************************************************************/

    public String removeTop () throws RuntimeException {
        Node temp=top;
        if(top==null){
            throw new RuntimeException("There is no list");
        }else{
            Node nuevo=top.getNext();
            top=nuevo;
        }
        return temp.toString();
    }

    /****************************************************************
     *
     * This Method removes a node at the specific index position.  The
     * first node is index 0.
     *
     * @param index the position in the linked list that is to be
     *          removed.  The first position is zero.
     *
     * @throws IllegalArgumentException if index < 0 or
     *          index >= size of the list
     *
     ****************************************************************/
    public boolean delAt(int index) throws IllegalArgumentException{
        boolean d=false;
        if(index==0 && this.getLen()!=0){
            top=top.getNext();
            d=true;
        }else if(index>=this.getLen()|| index<0){
            throw new IllegalArgumentException("Hay error");
        }else{
            int count=0;
            Node temp=top;
            Node tump=top.getNext();
            if(index==this.getLen()-1){
                while(count<index-1){
                    count++;
                    temp=temp.getNext();
                }
                temp.setNext(null);
                d=true;
            }else{
                while(index<count){
                    temp.getNext();
                    tump.getNext();
                    count++;
                }
                temp.setNext(tump);
                d=true;
            }
        }
        return d;
    }

    public void display() {
        Node temp = top;

        System.out.println ("___________ List ________________________");
        while (temp != null) {
            System.out.println (temp.getPlant().toString());
            temp = temp.getNext();
        }
    }
}
