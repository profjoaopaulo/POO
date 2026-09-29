
public class Livro {

    // Dados que identificam o livro e informam se ele pode ser emprestado.
    String titulo;
    String autor;
    boolean disponivel;

    // Cria um livro com os dados recebidos e o marca como disponível.
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    // Retorna o título do livro.
    public String getTitulo() {
        return this.titulo;
    }

    // Retorna o nome do autor.
    public String getAutor() {
        return this.autor;
    }

    // Informa se o livro está disponível para empréstimo.
    public boolean getDisponivel() {
        return this.disponivel;
    }

    // Tenta emprestar o livro e atualiza sua disponibilidade quando possível.
    public void emprestar() {

        if (this.disponivel == false) {
            System.out.println("O livro já se encontra emprestado!"); 
        }else {
            this.disponivel = false;
            System.out.println("Boa leitura!");
        }
    }

    // Marca o livro como disponível novamente após a devolução.
    public void devolver() {
        this.disponivel = true;
        System.out.println("Livro disponível para empréstimo!");
    }
}
