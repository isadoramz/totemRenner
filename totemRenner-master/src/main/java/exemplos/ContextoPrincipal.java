package exemplos;

import java.util.Scanner;

import static exemplos.TipoAcao.*;

public class ContextoPrincipal {


    public static void main(String[] args) throws Exception {
        System.out.println("Ecolha seu modulo 1 - Dirigir e 2 - Pintar");

        // Terminal
        Scanner scanner = new Scanner(System.in);
        Long entradaTerminal = scanner.nextLong();

        // Cliente chegou e pediu um robo que pinta
        TipoAcao enumEncontrado = procurarAcao(entradaTerminal);

        // Ultima aula
        AcaoInterface acaoCriada = FabricaDeAcao.criarAcao(enumEncontrado);

        AcaoDirigir acaoDirigir = new AcaoDirigir();
        Robozinho robozinho = new Robozinho(acaoDirigir);

        // Cliente na casa dele
        robozinho.efetuarRotina();
    }



}
