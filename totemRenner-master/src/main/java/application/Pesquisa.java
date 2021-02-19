package application;

import java.util.ArrayList;
import java.util.List;

public class Pesquisa {

    Integer nota;

    public void validarNota(Integer notaDaPesquisa) throws Exception {

        if (notaDaPesquisa > 10){
            throw new Exception("A nota não pode ser maior que 10!");
        } else if(notaDaPesquisa < 0){
            throw new Exception("A nota não pode ser menor que 0!");
        }
    }
    // Começar
    // Atribuir uma nota
        // Regras de uma nota
    // Terminar



}
