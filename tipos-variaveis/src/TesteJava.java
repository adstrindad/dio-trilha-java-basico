public class TesteJava {

    public static void main (String[] args){

        int numero1 = 10;
        int numero2 = 20;

        
        boolean simNao = numero1 == numero2;
        System.out.println("NumeroUm é igual ao numeroDois? " + simNao);

        
        simNao = numero1 != numero2;
        System.out.println("NumeroUm é diferente do numeroDois? " + simNao);

        
        simNao = numero1 > numero2;
        System.out.println("NumeroUm é maior que o numeroDois? " + simNao);

        
        simNao = numero1 < numero2;
        System.out.println("NumeroUm é menor que o numeroDois? " + simNao);

        
        simNao = numero1 >= numero2;
        System.out.println("NumeroUm é maior ou igual ao numeroDois? " + simNao);

        
        simNao = numero1 <= numero2;
        System.out.println("NumeroUm é menor ou igual ao numeroDois? " + simNao);
    }
}