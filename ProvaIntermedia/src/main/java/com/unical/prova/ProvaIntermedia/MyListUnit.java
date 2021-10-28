package com.unical.prova.ProvaIntermedia;

import java.util.Comparator;
import java.util.List;

public class MyListUnit {
	public List<Integer> sort (List<Integer> lista, int order){
		Comparator<Integer> c = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1-o2;
			}
		};
		
		if(order == 0)
			lista.sort(null);
		
		if(order == 1)
			lista.sort(c.reversed());
		return lista;
	}
}
