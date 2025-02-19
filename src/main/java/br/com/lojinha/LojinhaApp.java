package br.com.lojinha;

import br.com.lojinha.pojo.Produto;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto();
         // Aula atributos
        //meuProduto.nome = "Play Statio 4";
        //meuProduto.valor = 4999.99;
        //meuProduto.marca = "Sonny";
        //meuProduto.tamanho = "Medio";
        //meuProduto.itensInclusos = "2 Controles e 3 Jogos";

        // Aula Encapsulamento
        meuProduto.setNome("Play Statio 4");
        meuProduto.setValor(2999.99);
        meuProduto.setMarca("Sonny");
        meuProduto.setTamanho("Medio");
        meuProduto.setItensInclusos("2 Controles e 3 Jogos");

        System.out.println(meuProduto.getNome());
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getMarca());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getItensInclusos());

// Aula variaveis
//        String joias = "100gr de Ouro 50K";
//        int minhaIdade = 34;
//        double meuSalario = 29500.99;
//        boolean minhaResposta = false;
//
//        System.out.println(joias);
    }
}
