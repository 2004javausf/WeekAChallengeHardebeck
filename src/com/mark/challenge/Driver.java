// THIS IS AN ORDER MENU FOR A BASIC MEXICAN RESTURAUNT!

package com.mark.challenge;

import java.util.Scanner;


//WORKS FOR ORDERS OF 1, I DONT HAVE ENOUGH TIME TO SORT IT OUT TO MAKE IT WORK FOR OTHER ORDERS


public class Driver {
	
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String meal;
		System.out.println("Would you like to order tacos or burritos");
		meal = sc.nextLine();
		whatMeal(meal);
		
	}

	
	
	
	public static void whatMeal(String meal) {
		
		BeanOne taco = new BeanOne();
		BeanTwo burrito = new BeanTwo();
		double tot = 1;
		
		if (meal.equalsIgnoreCase("tacos")) {  // if statement to determine if we are eating tacos or burritos
			System.out.println("How many tacos would you like?");
			taco.setQuantity(sc.nextInt());
			tot = 5*tot*taco.getQuantity();
			for (int i = 1; i<=taco.getQuantity();i++) {
				Integer order = i;
				System.out.println("What would you like on taco " + i);
				String test;
				test = sc.nextLine();
				
				System.out.println("Would you like beans? yes or no.");
				taco.setBeans(sc.nextLine());
				System.out.println("Would you like carne asada, pastor, carnitas, chicken, chorizo, or no meat?");
				taco.setMeat(sc.nextLine());
					switch (taco.getMeat()){
					case "carne asada":
						taco.setMeat("carne asada");
						break;
					case "pastor":
						taco.setMeat("pastor");
						break;
					case "carnitas":
						taco.setMeat("carnitas");
						break;
					case "chicken":
						taco.setMeat("chicken");
						break;
					case "chorizo":
						taco.setMeat("chorizo");
						break;
					case "no meat":
						taco.setMeat("no meat");
						break;
					default:
						taco.setMeat("NO MEAT IT IS");
						break;
				}
				System.out.println("Would you like guacamole? yes or no.");
				taco.setGuac(sc.nextLine());
				
				System.out.println("Would you like salsa? yes or no.");
				taco.setSalsa(sc.nextLine());
				System.out.println(taco);
				int z = 1;
				do {
					System.out.println("Gracias");
				}
				while (z++<taco.getQuantity());
				
				
				int j = 1;	
				while (j++<taco.getQuantity()) {
					System.out.println("What would you like on your next taco?");
				}
				
				//System.out.println(order.length); (was going to use this to try and sort out orders using for each, not enough time
				
		}
			if (taco.getGuac().equalsIgnoreCase("yes")&&taco.getMeat().equalsIgnoreCase("carne asada")){
				double carne = 1.5;
				double guac = 3.5;
				add(tot,guac,carne);
			}
			else if (taco.getGuac().equalsIgnoreCase("yes")) {
				double guac = 3.5;
				add(tot,guac);
			}
			else if (taco.getMeat().equalsIgnoreCase("carne asada")) {
				double guac = 1.5;
				add (tot,guac);
				
		}
			else {
				add(tot);
			}
				
		}
		else if (meal.equalsIgnoreCase("burritos")) {
			System.out.println("How many burritos would you like?");
			burrito.setQuantity(sc.nextInt());
			tot = 6*tot*burrito.getQuantity();
			for (int i = 1; i<=burrito.getQuantity();i++) {
				System.out.println("What would you like on burrito " + i);
				String test;
				test = sc.nextLine();
				
				System.out.println("Would you like beans? yes or no.");
				burrito.setBeans(sc.nextLine());
				System.out.println("Would you like rice? yes or no.");
				burrito.setRice(sc.nextLine());
				System.out.println("Would you like carne asada, pastor, carnitas, chicken, chorizo, or no meat?");
				burrito.setMeat(sc.nextLine());
					switch (burrito.getMeat()){
					case "carne asada":
						break;
					case "pastor":
						break;
					case "carnitas":
						break;
					case "chicken":
						break;
					case "chorizo":
						System.out.println("chorizo");
						break;
					case "no meat":
						break;
					default:
						break;
				}
				System.out.println("Would you like guacamole? yes or no.");
				burrito.setGuac(sc.nextLine());
				System.out.println("Would you like salsa? yes or no.");
				burrito.setSalsa(sc.nextLine());
				System.out.println(burrito);
				
				int z = 1;
				do {
					System.out.println("Gracias");
				}
				while (z++<burrito.getQuantity());
				
				
				int j = 1;	
				while (j++<burrito.getQuantity()) {
					System.out.println("What would you like on your next taco?");
				}
				
				
				if (burrito.getGuac().equalsIgnoreCase("yes")&&burrito.getMeat().equalsIgnoreCase("carne asada")){
					double carne = 1.5;
					double guac = 3.5;
					add(tot,guac,carne);
				}
				else if (burrito.getGuac().equalsIgnoreCase("yes")) {
					double guac = 3.5;
					add(tot,guac);
				}
				else if (burrito.getMeat().equalsIgnoreCase("carne asada")) {
					double guac = 1.5;
					add (tot,guac);
					
			}
				else {
					add(tot);
				}
					
		}
			
				
		
	}
		else {
			System.out.println("Please choose a taco or burrito.");
		}
		
		
		
		
		
}
	static double add(double tot) {
		System.out.println("Your total is " + tot + " dollars");
		return tot;
	}
	static double add(double tot,double guac, double carne) {
		tot = tot+guac+carne;
		System.out.println("Your total is " + tot + " dollars");
		return tot+guac+carne;
	}
	static double add(double tot, double guac) {
		tot = tot+guac;
		System.out.println("Your total is " + tot+ " dollars");
		return guac + tot;
	}
}

