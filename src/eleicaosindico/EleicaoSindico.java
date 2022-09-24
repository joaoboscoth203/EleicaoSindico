
package eleicaosindico;

import java.util.Scanner;

public class EleicaoSindico {

    public static void main(String[] args) {        
                   
          int eleitores = 5;
          int candidatoA = 0;
          int candidatoB = 0;
          int candidatoC = 0;
          int nulo = 0;
          int votos = 0;
          double validos = 0;
          
          
                Scanner input = new Scanner(System.in);

                // partindo de zero votos, enquanto votos for menor que eleitores, um novo eleitor deve votar.
                while (votos < eleitores) {
                    try {
                    System.out.println("==================== MENU PRINCIPAL ====================");
                    System.out.println("Para votar no candidato A, digite 1;\nPara votar no canditado B, digite 2;\nPara votar no candidato C, digite 3.\n");
                    int voto = input.nextInt();                    

                      if (voto == 1) {
                          candidatoA = candidatoA + 1;
                          votos = votos + 1;
                          validos = validos + 1;
                        } else {
                          if (voto == 2) {
                              candidatoB = candidatoB + 1;
                              votos = votos + 1;
                              validos = validos + 1;
                          } else {
                              if (voto == 3) {
                                  candidatoC = candidatoC + 1;
                                  votos = votos + 1;
                                  validos = validos + 1;
                              } else {
                                  nulo = nulo + 1;
                                  votos = votos + 1;
                              }
                          }
                      }
                    } catch (Exception e) {
                        System.out.println("Digite apenas numeros.");
                    }
                    
          
          double validosA = (candidatoA/validos)*100; // votos validos de A
          double validosB = (candidatoB/validos)*100; // votos validos de B
          double validosC = (candidatoC/validos)*100; // votos validos de C
          
          System.out.println("");
          System.out.println("====================== RESULTADO ======================");
          
          double vencedor = validosC;   //vencedor começa = validosC
            if (validosA > vencedor)    //se A for o mais votado...
                vencedor = validosA;    // vencedor recebe valor de A
            if (validosB > vencedor)    // se B for o mais votado
                vencedor = validosB;    // vencedor recebe valor de B
                // Ao final desse IF, a variavel "vencedor" tem o valor igual ao mais votado
                
            // verificar empate
            if (vencedor == validosB && vencedor == validosC || vencedor == validosA && vencedor == validosB || vencedor == validosA && vencedor == validosC || vencedor == validosA && vencedor == validosB && vencedor == validosC) {
                System.out.printf("O candidato A teve %.2f%% dos votos validos.%n", validosA);
                System.out.printf("O candidato B teve %.2f%% dos votos validos.%n", validosB);
                System.out.printf("O candidato C teve %.2f%% dos votos validos.%n", validosC);
                System.out.println("Votos nulos: "+nulo);
                System.out.println("Houve empate! deveremos ter um segundo turno.");
                
            } else {
                // se o valor da variavel vencedor for igual aos votos validos de A... A venceu.   
            if (vencedor == validosA) {
                System.out.printf("O candidato A foi eleito com %.2f%% dos votos validos.%n", validosA);
                System.out.printf("O candidato B teve %.2f%% dos votos validos.%n", validosB);
                System.out.printf("O candidato C teve %.2f%% dos votos validos.%n", validosC);
                System.out.println("Votos nulos: "+nulo);
                
            // se o valor da variavel vencedor for igual aos votos validos de B... B venceu.     
            } else {
                if (vencedor == validosB) {
                System.out.printf("O candidato B foi eleito com %.2f%% dos votos validos.%n", validosB);
                System.out.printf("O candidato A teve %.2f%% dos votos validos.%n", validosA);
                System.out.printf("O candidato C teve %.2f%% dos votos validos.%n", validosC);
                System.out.println("Votos nulos: "+nulo);
                
            // se o valor da variavel vencedor for igual aos votos validos de C... C venceu.     
            } else {
                    if (vencedor == validosC) {
                System.out.printf("O candidato C foi eleito com %.2f%% dos votos validos.%n", validosC);
                System.out.printf("O candidato A teve %.2f%% dos votos validos.%n", validosA);
                System.out.printf("O candidato B teve %.2f%% dos votos validos.%n", validosB);
                System.out.println("Votos nulos: "+nulo);
                
                // caso o valor da variavel vencedor for zero, significa que todos anularam o voto.
                } else {
                        System.out.println("Todos os eleitores anularam o voto.");
                    }
            } 
            }
             
            
        }        
    }
    }
}

 