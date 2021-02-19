package application;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

public class ProcessadorDePesquisa {

    // Eu sou o cliente e passei as instrucoes pra voces
    // podem repassar para a Isadora se ela nao estava na reuniao de alinhamento

    public static void main(String[] args) throws Exception {

        // Entrada do terminal
        EntradaTerminal entradaTerminal = new EntradaTerminal();

        // Guardar nota da pesquisa
        Integer notaDaPesquisa = entradaTerminal.entradaInteira();

        Pesquisa pesquisa = new Pesquisa();
        // Regra da nota da pesquisa
    }

}
