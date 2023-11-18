package candidatos;

import java.util.concurrent.ThreadLocalRandom;

public class AnaliseCandidatos {
    public static void main(String[] args) {
        analisarCandidato(1900);
        analisarCandidato(2000.0);
        analisarCandidato(2200.0);
    }



    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o Candidato.");
        }
        if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta.");
        }
        if (salarioBase < salarioPretendido){
            System.out.println("Aguardadando resultado dos demais Candidatos.");
        }
    }


}
