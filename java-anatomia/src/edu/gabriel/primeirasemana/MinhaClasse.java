package edu.gabriel.primeirasemana;

public class MinhaClasse {
    public static void main(String[] args) {
        // Declaração de variáveis
        String meuNome = "Gabriel";
        int anoFabricacao = 2022;
        boolean verdadeira = false;

        anoFabricacao = 2018;

        // Chamada de métodos
        String primeiroNome = "Gabriel";
        String segundoNome = "Cordeiro";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    /*
     * Declaração de métodos
     * 
     * Estrutura: 
     * 
     * TipoRetorno NomeObjetivoNoInfinitivo(Parametros)
     */
    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
