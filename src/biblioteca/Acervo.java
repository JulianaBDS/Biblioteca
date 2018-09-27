
package biblioteca;

import java.util.ArrayList;



public class Acervo {

    ArrayList<Livro> acervo;
    
    public Acervo(){
        acervo = new ArrayList();
    }
    
    public void ConsultarLivro(Livro liv){
        
       if(acervo.contains(liv)){
           System.out.println( acervo.get(acervo.indexOf(liv)));
       }
       else{
           System.out.println("Esse livro n existe no acervo");
       }
        
    }
    
    public void ConsultarAcervo(){
      
        System.out.println(acervo);
        
    }
    
    public void AddLivro(Livro liv){

        if(acervo.contains(liv)==false){
            acervo.add(liv);
            System.out.println("Livro add com sucesso!!");
        }
        else{
            System.out.println("Esse livro já existe no acervo");
        }
        
    }
    
    public void RemoverLivro(Livro liv){
        if(acervo.contains(liv)){
            acervo.remove(liv);
            System.out.println("Livro removido!!");
        }
        else{
            System.out.println("Livro n encontrado");
        }
        
        
    }
        
    
    
}
