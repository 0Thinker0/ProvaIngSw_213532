package com.unical.prova.ProvaIntermedia;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	MyListUnit sortingClass = new MyListUnit();
    	
    	List<Integer> lista = new ArrayList<Integer>();
    	lista.add(1);
    	lista.add(34);
    	lista.add(2);
    	lista.add(6);
    	lista.add(8);
    	lista.add(5);
    	
    	
    	lista = sortingClass.sort(lista, 0);
    	
    	for(Integer element : lista) {
    		System.out.println(element);
    	}
    }
}
