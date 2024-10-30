public class Operadores {
    
    public static void main(String[] args) {
        
        
        // Operadores aritméticos:
        
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


        // Operador terario: 
        // Se/não(se valor corresponder, retorna verdadeiro, se valor não corresponder, retorna falso).
        
        int a, b;   
        a = 5;
        b = 6;  

        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.print(resultado);

    }
}
