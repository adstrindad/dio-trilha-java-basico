public class Operadores {
    
    public static void main(String[] args) {
          
        // Operadores aritméticos:
        // Os operadores aritméticos em Java são utilizados para realizar operações matematicas básicas.

        int soma = 10 + 10;
        // usado para fazer a soma de valores 
        System.out.println(soma);
        
        int subtração = 10 - 10;
        // usado para fazer a subtração de valores
        System.out.println(subtração);

        int divisão = 10 / 2;
        // usado para fazer a divisão valores 
        System.out.println(divisão);

        int multiplicação = 10 * 2;
        // usado para fazer a multiplicação de valores
        System.out.println(multiplicação); 

        int resto  = 10 % 3; 
        // usado para retornar o resto de uma divisão
        System.out.println(resto);

        // Operador ternario: 
        // Se/não(se valor corresponder, retorna verdadeiro, se valor não corresponder, retorna falso).
        
        int a, b;   
        a = 5;
        b = 6;  

        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.print(resultado);
    
        // Operadores relacionais:
        // Os operadores relacionais em Java são utilizados para comparar dois valores e determinar a relação entre eles.

        int numero1 = 10;
        int numero2 = 20;

        //Operador utilizado para declarar igualdade entre valores.
        boolean simNao = numero1 == numero2;
        System.out.println("NumeroUm é igual ao numeroDois? " + simNao);

        //Operador utilizado para declarar diferença entre valores.
        simNao = numero1 != numero2;
        System.out.println("NumeroUm é diferente do numeroDois? " + simNao);

        //Operador utilizado para declarar valor maior entre valores declarados.
        simNao = numero1 > numero2;
        System.out.println("NumeroUm é maior que o numeroDois? " + simNao);

        //Operador utilizado para declarar valor maior entre valores declarados.
        simNao = numero1 < numero2;
        System.out.println("NumeroUm é menor que o numeroDois? " + simNao);

        //Operador utilizado para declarar valor maior ou igual entre valores declarados.
        simNao = numero1 >= numero2;
        System.out.println("NumeroUm é maior ou igual ao numeroDois? " + simNao);

        //Operador utilizado para declarar valor menor ou igual entre valores declarados.
        simNao = numero1 <= numero2;
        System.out.println("NumeroUm é menor ou igual ao numeroDois? " + simNao);
    }
    
}
