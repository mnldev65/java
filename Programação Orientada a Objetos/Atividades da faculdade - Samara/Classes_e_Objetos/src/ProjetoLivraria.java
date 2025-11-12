public class ProjetoLivraria {
    public static void main(String[] args) {
        Livro obj1 = new Livro();

        obj1.titulo = "Harry Potter e a Pedra Filosofal";
        obj1.numeroPaginas = 304;
        obj1.anoPublicacao = 1997;
        obj1.preco = 25.90;

        System.out.println("Título: " + obj1.titulo);
        System.out.println( "Número de paginas" + obj1.numeroPaginas);
        System.out.println("Ano Pub.: " + obj1.anoPublicacao);
        System.out.println("Preco: " + obj1.preco);
    }
}
