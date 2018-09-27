
package biblioteca ;

public class Biblioteca {


    public static void main(String[] args) {
        
      Livro l1 = new Livro();
      l1.autor = "Carlos Drumon";
      l1.categoria = "Literatura";
      l1.codigo = 01;
      
      Livro l2 = new Livro();
      l2.autor = "Olavo Bilac";
      l2.categoria = "Literatura";
      l2.codigo = 02;
      
      Livro l3 = new Livro();
      l3.autor = "J.K. Rowling";
      l3.categoria = "Aventura";
      l3.codigo = 03;
      

     Acervo acervo = new Acervo();
     acervo.AddLivro(l1);
     acervo.AddLivro(l2);
     acervo.AddLivro(l3);
     
     acervo.ConsultarAcervo();
     
     acervo.RemoverLivro(l1);
     acervo.ConsultarAcervo();
        System.out.println();
     acervo.ConsultarLivro(l3);
      
        
    }
    
}
