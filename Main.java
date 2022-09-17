package com.internshala.javaapp;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println("\t\tToday's Special Menu\n   ---------------------------------------------------");
		System.out.println("    Special Cakes\n    ---------------------------------------------");
		
		List<Cake> listCake = new ArrayList();
		Cake ob1 = new Cake();
		ob1.name = "Chocolate Brownie";
		ob1.price = 250.0f;
		listCake.add(ob1);
		Cake ob2 = new Cake();
		ob2.name = "Chocolate Maple";
		ob2.price = 300.0f;
		listCake.add(ob2);
		for(Cake x: listCake) {
			System.out.println("    " + x.name + ": \u20B9" + x.price);
		}
		System.out.println("\n");
		System.out.println("    Special Pastries\n    ---------------------------------------------");
		List<Pastry> listPastry = new ArrayList();
		Pastry ob3 = new Pastry();
		ob3.name = "Black Forest";
		ob3.price = 35.0f;
		listPastry.add(ob3);
		Pastry ob4 = new Pastry();
		ob4.name = "Choco Truffle";
		ob4.price = 40.0f;
		listPastry.add(ob4);
		for(Pastry y : listPastry) {
			System.out.println("    " + y.name + ": \u20B9" + y.price);
			
		}
				
	}

}
