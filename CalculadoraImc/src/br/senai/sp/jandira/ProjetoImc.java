package br.senai.sp.jandira;

import java.util.Scanner;

import javax.swing.JOptionPane;


public class ProjetoImc {
	
	public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
	
	double peso, altura, imc;
	String auxilio;
	String segundoAuxilio = "";
	
	//System.out.println("Qual é o seu peso?");
	auxilio = JOptionPane.showInputDialog(
			null, 
			"Qual é o seu peso?", 
			"calculadora IMC", 
			JOptionPane.QUESTION_MESSAGE);
			
	peso = Double.parseDouble(auxilio);
	
	
	//System.out.println("Qual sua altura?");
	segundoAuxilio = JOptionPane.showInputDialog(
			null, 
			"Qual sua altura?", 
			"calculadora IMC", 
			JOptionPane.QUESTION_MESSAGE);
	
	altura = Double.parseDouble(segundoAuxilio);
	
	imc = peso / Math.pow(altura, 2.0);
	
	
	if (imc <= 18.5){
		segundoAuxilio = ("\nVocê está abaixo do peso");	
	}
	
	if (imc >= 18.5 && imc <= 25.0){
		segundoAuxilio = ("\nVocê está no peso ideal, Parabéns!");
	}
	
	if (imc >= 25.0 && imc <= 30.0) {
		segundoAuxilio = ("\nAtenção! Você está levemente acima do peso");	
	}

	if (imc >= 30.0 && imc <= 35.0) {
		segundoAuxilio = ("\nAtenção! Você está na Obesidade grau I");	
	}
	
	if (imc >= 35.0 && imc <= 40.0){
		segundoAuxilio = ("\nAtenção! Você esta na Obesidade grau II considerada severa.");	
	}
	
	if (imc >= 40.0){
		segundoAuxilio = ("\nAtenção! Você esta  na Obesidade grau III considerada mórbida");	
	}			
	
	segundoAuxilio = segundoAuxilio + " Seu IMC é " +  String.format("%.2f", imc);
	
	JOptionPane.showMessageDialog(
			null, segundoAuxilio, 
			"Resultado", 
			JOptionPane.INFORMATION_MESSAGE);


}

}
