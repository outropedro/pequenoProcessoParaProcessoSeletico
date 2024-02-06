import java.util.Scanner;

public class ProcessoSeletivo {
    public static void main(String[] args) {
         
    }
    
    public static void analisarCandidato(double salario) {
        final int SALARIO_BASE = 2000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual o salario pretendido pelo candidato: ");
        salario = scanner.nextDouble();
        if(salario < SALARIO_BASE){
            System.out.println("LIGAR PARA CANDIDATO.");
        }
        else if(salario == SALARIO_BASE){
            System.out.println("LIGAR PARA CANDIDATO COM CONTRA PROPOSTA.");
        }
        else{
            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
        }          
    }

    public static void selecaoCandidatos(){
        final double SALARIO_BASE = 2000;
        String [] candidatos = new String[15];
        String [] candidatosAprovados = new String[5];
        double [] salario = new double[15];
        Scanner scanner = new Scanner(System.in);
        int contadorAprovados = 0;

        for(int i = 0 ; i < 15 ; i++){
            System.out.println("Digite o nome do candidato: ");
            candidatos[i] = scanner.nextLine();
            System.out.println("Digite o salario pretendido do candidato: ");
            salario[i] = scanner.nextDouble();
            
            if(salario[i] <= SALARIO_BASE){
                contadorAprovados ++;
                candidatosAprovados[i] = candidatos[i];
            }
            if(contadorAprovados <= 5){
                break;
            }

        }

        System.out.println("Os candidatos aprovados para entrevista foram: ");
        for(int i = 0 ; i < 5 ; i++){
            System.out.println(candidatosAprovados[i] + "\n");
        }
    }
}
