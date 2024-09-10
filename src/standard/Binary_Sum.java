package standard;

import java.util.Scanner;

public class Binary_Sum {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        try {
	            System.out.print("Digite o primeiro número binário: ");
	            String binario1 = scanner.nextLine();

	            System.out.print("Digite o segundo número binário: ");
	            String binario2 = scanner.nextLine();

	            int decimal1 = Integer.parseInt(binario1, 2);
	            int decimal2 = Integer.parseInt(binario2, 2);

	            int somaDecimal = decimal1 + decimal2;

	            String resultadoBinario = Integer.toBinaryString(somaDecimal);

	            System.out.println("Resultado em binário: " + resultadoBinario);
	            System.out.println("Resultado em decimal: " + somaDecimal);
	            
	        } catch (NumberFormatException e) {
	            System.out.println("Erro: Um dos números digitados não está no formato binário.");
	        } finally {
	            scanner.close();
	        }
	    }
	}



