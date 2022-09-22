package forum_dsi_agenda07;

import java.util.Scanner;

public class Forum_dsi_agenda07 {
    
    public static void main(String[] args) {
        // declaração das variáveis
        int idade = 0;
        int total = 0;
        String nome;
        
        // utilizando Scanner
        Scanner ler = new Scanner (System.in);
        
        for (int i = 0; i <= 10; i++) { //laço de repetição para as 08 pessoas
            
            System.out.println("Insira o nome: "); 
            nome = ler.next(); // usuário irá digitar o nome e este comando irá ler e armazenar na variável
            
            System.out.println("Insira a idade: ");
            idade = ler.nextInt(); // usuário irá digitar a idade e este comando irá ler e armazenar na variável
            
            if (idade > 18) {
                System.out.println("MAIOR DE IDADE!");
                total += 1;
            
            } else {
                System.out.println("MENOR DE IDADE!");
            } // Fim if-else
            
        }// Fim para
       
          System.out.println("O total de maiores de idade é de :" + total);
        
    }
    
}
