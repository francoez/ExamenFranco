package controller;

import clases.Electrodomestico;
import clases.Lavadora;

public class controller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Electrodomestico electrodomestico=new Electrodomestico("nevera", "siemens", 32);
System.out.println(electrodomestico.toString());

Lavadora lavadora=new Lavadora("siemens", 23, 54, true);
System.out.println(lavadora.toString());	

lavadora.setMarca("pepe");
System.out.println(lavadora.toString());
	
	}

}
