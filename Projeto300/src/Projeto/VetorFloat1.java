package Projeto;

import java.util.Scanner;

public class VetorFloat1{

 public static void main(String args[]) {

   Scanner ler = new Scanner(System.in);

   float nota;

   float sum = 0;

   for(int i = 1; i <= 10; i++){

     System.out.printf("Insira a %dº nora: ", i);

     nota = ler.nextFloat();

     sum+=nota;

   }

   

   float media = sum/10;

   if(media <= 7){

     System.out.println("Abaixo da media");

   }else{

     System.out.println("Acima da media");

   }

   

 }

}