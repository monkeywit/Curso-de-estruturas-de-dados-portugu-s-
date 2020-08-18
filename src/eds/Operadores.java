package eds;

import java.util.*;

public class Operadores {

	public static void main(String[] args) {
		
		//operador de atribuição
		int x = 10;
		int i, j;
		i = j = 5;
		System.out.println(i);
		System.out.println(j);
		
		//operadores aritmeticos
		x = 5 + 4;
		System.out.println(x);
		int y = 10 % 2;
		System.out.println(y);
		
		//operadores incrmento e decremento
		int m = 20;
		m++;
		System.out.println("m= " + m);
		m--;
		System.out.println("depois do decremento m= " + m);
		
		//operadores lógicos - comparação
		System.out.println(10 > 5);
		System.out.println(10 < 5);
		System.out.println(10 == 5);
		System.out.println(10 != 5);
		System.out.println(10 >= 20);
		System.out.println(10 <= 20);
		
		//operadores lógicos - booleanos
		boolean r = (10 > 5) && (3 != 8) && (100 >= 50);
		System.out.println("resultado de operador and: " + r);
		
		boolean r2 = (10 > 50) || (3 != 3) || (100 >= 500);
		System.out.println("resultado de operador or: " + r2);
		
		boolean r3 = (0x00001111 > 0x00011011);
		System.out.println("resultado de operação entre numeros representados por bits: " + r3);
		
		boolean r4 = !(true);
		System.out.println("resultado de operador negação: " + r4);
		
		
		//operadores bitwise
		int a = 15;   //00001111
		int b = 27;   //00011011
		int c = a | b;//00011111
		
		System.out.println(c);
		
		//operadores atribuição operacional
		int k = 8;
		k *= 5; //k = k * 5;
		
		System.out.println("k= "+ k);

	}

}
