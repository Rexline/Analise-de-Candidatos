package candidatos;

import java.util.concurrent.ThreadLocalRandom;

public class SelecaoDeCandidatos {
    public static void main(String[] args) {
        selecaoCandidatos();
    }


    static void selecaoCandidatos() {

        String[] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
        Integer candidatosSelecionados = 0;
        Integer candidatoAtual = 0;
        Double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            Double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " Solicitou este valor de salário " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            }
            candidatoAtual++;
        }
    }

    static Double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}