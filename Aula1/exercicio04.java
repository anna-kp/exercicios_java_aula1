public class SomaImpares {
    public static void main(String[] args) {
        
        int[] numeros = {2, 5, 7, 10, 13, 18, 21};
        int soma = 0;
        
        for (int num : numeros) {
            if (num % 2 != 0) { 
                soma += num;  
            }
        }

        System.out.println("Soma dos ímpares = " + soma);
    }
}
