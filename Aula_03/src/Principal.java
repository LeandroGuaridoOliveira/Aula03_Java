import org.w3c.dom.ls.LSOutput;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        // ler o nome, preço, id e disponivel
        //criar um objeto Produtos com os dados

        Scanner leitor = new Scanner(System.in);

        System.out.println("digite o nome do produto:");
        String nome = leitor.next() + leitor.nextLine();

        System.out.println("digite o codigo do produto:");
        int id = leitor.nextInt();


        System.out.println("digite o preço do produto:");
        float preco = leitor.nextFloat();

        System.out.println("esta disponivel?");
        boolean disponivel = leitor.nextBoolean();

        // ler os dados do fornecedor


        //Objeto produto
        Produtos produto = new Produtos();

        //colocar os dados no objeto
        produto.nome = nome;
        produto.id = id;
        produto.preco = preco;
        produto.disponivel = disponivel;

        //exibir dados do objeto
        System.out.println(
                "nome do produto: " + produto.nome +
                "\n" + "id do produto: " + produto.id +
                "\n" + "preço da produto: " + produto.preco+
                "\n" + "tem disponivel? " + produto.disponivel );




    }

}
