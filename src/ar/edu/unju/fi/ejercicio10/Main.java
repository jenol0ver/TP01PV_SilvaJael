package ar.edu.unju.fi.ejercicio10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            Pizza pizza = new Pizza();
            System.out.println("Ingrese el diámetro de la pizza:");
            pizza.setDiametro(scanner.nextInt());
            System.out.println("¿La pizza tiene ingredientes especiales? (true/false):");
            pizza.setIngredientesEspeciales(scanner.nextBoolean());
            pizza.calcularPrecio();
            pizza.calcularArea();
            System.out.println("Precio de la pizza: " + pizza.getPrecio());
            System.out.println("Área de la pizza: " + pizza.getArea());
        }
        scanner.close();

	}

}
