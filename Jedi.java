/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapify;

/**
 * @author JF
 * @version A long long time ago
 * A long long time ago in a galaxy far far away, each jedi have a midiclorian count. 
*/
public class Jedi /* implements Comparable */
{
	private String name;
	private double midi;
	public Jedi(String name, double midi)
	{
		this.name =name;
		this.midi = midi;
	}
        
	public Jedi(String name)
	{
		this.name = name;
		this.midi = -1;
	}
        
	public String toString()
	{
		return "Jedi " + name +"\nMidi-chlorians count : " + midi+"\n"  ;
	}
        
	public double getMidi()
	{
		return midi;
	}
        
	public String getName()
	{
		return name;
	}
        /*
	// returns true if the object’s midi value are equal and false otherwise – CODE INCOMPLETE
	public boolean equals(Object other)
	{
		if(!(other instanceof Jedi))
		 return false;
	}
        
	// returns -1 if less, 1 if larger, or 0 if it is an equal midi count – CODE INCOMPLETE
	public int compareTo(Object other)
	{
		if(!( other instanceof Jedi))
		 return 0;
	}
        */
}
