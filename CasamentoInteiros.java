/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casamentointeiros;
import java.util.Scanner;
import java.util.Arrays;
import java.util.LinkedList;

public class CasamentoInteiros {

    public static void main(String[] args) {
	Scanner bm = new Scanner(System.in); //instancia e cria um objeto scanner usando o dispositivo de entrada 
	
	int resposta = 0;
	String a, b;
        
	//o método nextInt() lê o valor digitado e o armazena em uma variável do tipo int
	a = bm.next();
	b = bm.next();
	// tamanho da string
	while (a.length() < b.length())
	    a = "0" + a;
	while (b.length() < a.length())
	    b = "0" + b;
         //criando lista encadeada
	LinkedList<Character> numeroa = new LinkedList<Character>();
	LinkedList<Character> numerob = new LinkedList<Character>();
        
	for (int i=0; i<a.length(); i++) { //inicia o loop
	    if (a.charAt(i) == b.charAt(i)) { // o método retorna o caractere no indice especificado na string
		numeroa.add(a.charAt(i));
		numerob.add(a.charAt(i));
	    }
	    else if (a.charAt(i) < b.charAt(i))
		numerob.add(b.charAt(i));
	    else
		numeroa.add(a.charAt(i));
	}

	int result_a = -1, result_b = -1;
	int multiplicaçao;

	
	// calcular o valor de a 
	if (numeroa.size() > 0) {
	    result_a = 0;
	    multiplicaçao = 1;
	    for (int i=numeroa.size()-1; i >=0; i--) {
	    result_a += Character.getNumericValue(numeroa.get(i)) * multiplicaçao;
	    multiplicaçao *= 10;
	    }
	}

	// calcular o valor de b
	if (numerob.size() > 0) {
	    result_b = 0;
	    multiplicaçao = 1;
	    for (int i=numerob.size()-1; i >=0; i--) {
		result_b += Character.getNumericValue(numerob.get(i)) * multiplicaçao;
		multiplicaçao *= 10;
	    }
	}
	  
	if (result_a > result_b)
	    System.out.printf("%d %d\n",result_b, result_a);
	else
	    System.out.printf("%d %d\n",result_a, result_b);
    }
}
