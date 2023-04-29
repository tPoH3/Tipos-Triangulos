import java.util.Scanner;

//instrução1
// Perguntat ao Usuaria(aluno) o tamanho da base do triangulo.
//instrução2
//Guarde o valor da base do triangulo em uma variavel.
//instrução3
//Perguntar ao Usuario(aluno) o tamanho da altura
//instrução4
//Guardar o valor do tamanho da altura do triangulo.
//instrução5
//Fazer a multiplicação da base pela altura.
//instrução6
//Fazer a divisão por 2 para obter a area.
//instrução7
//Guardar o resultado da divisão.
//instrução8
//Printar o resultado
//instrução9
//Apresentar o resultado para o usuario.
//...

class TiposTriangulos {
  
	public static void main(String args[]){  
   
    		Scanner teclado = new Scanner(System.in);
			
			
    		double Z,Y, X;
			
			if(X > 0 && Y > 0 && Z > 0){
			
			
			System.out.printf("Insira o tamanho da base X do triangulo \n");
			X = teclado.nextDouble();
			
			System.out.printf("Insira o tamanho da base Y do triangulo \n");
			Y = teclado.nextDouble();
			
			System.out.printf("Insira o tamanho da base Z do triangulo \n");
			Z = teclado.nextDouble();
			
			//Triangulo Equilatero
			if(X == Y && X == Z){
				
				if(X > Y && X > Z){
			System.out.printf("Este triangulo e Equilatero e a hipotenuza e X"); 
				}
				if(Y > X && Y > Z){
			System.out.printf("Este triangulo e Equilatero e a hipotenuza e X"); 
				}
				
			}
			
			//Triangulo Isoceles
			if(X == Y && X != Z || Y == X && Z != X ){
			System.out.printf("Este triangulo e Isoceles"); 
			System.exit(0);
			}
			
			//Triangulo Escaleno
			if(X != Y && X != Z){
			System.out.printf("Este triangulo e Escaleno"); 
			}
			
			

    		System.exit(0);
			
			}
		
	}

}
