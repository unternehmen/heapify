/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapify;
import java.util.Arrays;

/**
 *
 * @author murphy249
 * @param <T>
 */
@SuppressWarnings("unchecked")
public class PriorityQueue<T extends Comparable<T>> {
    private T[] data;
    private int expended;
    
    public PriorityQueue() {
        data = (T[])(new Object[1]);
        expended = 0;
    }
    
    public void enqueue(T obj) {
        int childPos, parentPos, layerSize;
        double power;
        T parent;
        
        if (expended == data.length) {
            data = Arrays.copyOf(data, data.length * 2);
        }
        
        childPos = expended;
        data[childPos] = obj;
        
        while (childPos > 0) {
            power = Math.floor(Math.log(childPos) / Math.log(2));
            layerSize = (int)Math.pow(2, power);
            
            if ((childPos & 1) == 1) {
                parentPos = childPos - (layerSize - 1);
            } else {
                parentPos = childPos - layerSize;
            }
            
            parent = data[parentPos];
                
            if (obj.compareTo(parent) > 0) {
                data[childPos] = parent;
                data[parentPos] = obj;
                childPos = parentPos;
            } else {
                break;
            }
        }
        
        expended++;
    }
    
    void printAll() {
        for (int i = 0; i < expended; i++) {
            System.out.println("data[" + i + "]: " + data[i]);
        }
    }
}
