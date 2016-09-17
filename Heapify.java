/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapify;

/**
 *
 * @author murphy249
 */
public class Heapify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PriorityQueue<Integer> q;
        
        q = new PriorityQueue<Integer>();
        q.enqueue(4);
        q.enqueue(7);
        q.enqueue(6);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(7);
        q.enqueue(6);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(7);
        q.enqueue(6);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(7);
        q.enqueue(6);
        q.enqueue(3);
        q.printAll();
    }
    
}
