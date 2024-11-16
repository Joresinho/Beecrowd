/*Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados. A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada. */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.io.IOException;
/**
 *
 * @author Administrador
 */
public class Main {

    public static void main(String[] args) throws IOException{
     Scanner sc = new Scanner(System.in);   
     float[] lados = {sc.nextFloat(), sc.nextFloat(), sc.nextFloat()};
     
//Converter o array float para Float
     Float[] ladosObj = new Float[lados.length]; 
     for(int i = 0; i< lados.length; i++){
         ladosObj[i] = lados[i];
     }
//Ordenar em ordem decrescente
Arrays.sort(ladosObj, Collections.reverseOrder());
   
//Converter de volta para float
for(int i = 0; i < lados.length; i++){
    lados[i] = ladosObj[i];
}

//Criar uma array do tipo String e armazenar nela 
//as classificaçõoes do triângulo especificado.

String[] classificaçoes = new String[6];

//Criar if-else para adicionar as classificações do triângulo.
if(lados[0]>= lados[1] + lados[2]){
 classificaçoes[0] = "NAO FORMA TRIANGULO";   
} else{
    if((lados[0]*lados[0]) == (lados[1]*lados[1] + (lados[2]*lados[2]))){
  classificaçoes[1] = "TRIANGULO RETANGULO"; 
}  if(Math.pow(lados[0], 2) > (Math.pow(lados[1], 2) + Math.pow(lados[2],  2))){
    classificaçoes[2] = "TRIANGULO OBTUSANGULO";
} if(Math.pow(lados[0], 2)<((Math.pow(lados[1], 2) + (Math.pow(lados[2], 2))))){
      classificaçoes[3] = "TRIANGULO ACUTANGULO";  
    } if(lados[0]==lados[1] && lados[0]==lados[2]){
        classificaçoes[4] = "TRIANGULO EQUILATERO";
    }  if(lados[0]==lados[1] &&  lados[0]!= lados[2] && lados[1]!=lados[2]|| lados[0]==lados[2] && lados[0]!=lados[2] && lados[1]!=lados[2] || lados[1]==lados[2] && lados[0]!=lados[1]){
       classificaçoes[5] = "TRIANGULO ISOSCELES"; 
    } 
    }

for(int i = 0; i<classificaçoes.length;  i++){
    if(classificaçoes[i]!=null){
    System.out.println(classificaçoes[i]);
}
}
}
}
