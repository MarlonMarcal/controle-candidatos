package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {

        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
            
        }

    }

    static void entrandoEmContato(String candidato){
           int tentativasRealizadas = 1;
           boolean continuarTentando = true;
           boolean atendeu = false;
           do {

            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando)
                tentativasRealizadas++;
            else
                System.out.println("Contato relaizado com sucesso!! ");    


           } while(continuarTentando && tentativasRealizadas < 3);

           if(atendeu)
            System.out.println("Consneguimos contato com "+candidato+" na "+tentativasRealizadas+" Tentativa");
           else
            System.out.println("não conseguimos contato com "+candidato+", Numero maximo tentativas "+tentativasRealizadas+" Realizada");
    }

    static boolean atender(){
        return new Random().nextInt(3)==1;
    } 


    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
        System.out.println("Imprimindo a lista de candidatos informado o inndice do elemento: ");

        for (int indice = 0; indice < candidatos.length; indice++) {

            System.out.println("O candidatoo de numero: "+(indice+1)+" é "+ candidatos[indice]);
            
        }

        System.out.println("forma abreviada com For each");

        for (String candidato : candidatos) {

            System.out.println("O candidato selecionado foi "+candidato);
            
        }

    }



    static void selecaoCandidatos() {

        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA",
                "DANIELA", "JORGE" };

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBae = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {

            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + "Solicitou este valor de salário " + salarioPretendido);
            if(salarioBae >= salarioPretendido){
                System.out.println("O candidato "+ candidato + " foi selecionnado para a vaga");
                candidatosSelecionados++;
            }

            candidatoAtual++;

        }

    }

    static double valorPretendido() {

        return ThreadLocalRandom.current().nextDouble(1800, 2200);

    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o canditado");

        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");

        } else {
            System.out.println("Aguardando resultado dos demais candidatos ");

        }

    }

}