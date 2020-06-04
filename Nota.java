public class Nota{

   private String nome, mensagem;
   private int idade;

   public String getNome(){
      return nome;
   }
   
   public int getIdade(){
      return idade;
   }
   
   public String getMensagem(){
      return mensagem;
   }
        
   public void setNome(String nome){
      this.nome = nome;
   }
      
      
   public void setMensagem(String mensagem){
      if(mensagem.length() <= 144){
         this.mensagem = mensagem;
      } else {
         this.mensagem = mensagem.substring(0, 144);
      }
   }
   public void setIdade(int idade){
      this.idade = idade;
   }
   public String toString(){
      return "[Nome: "+nome+"]\n[Mensagem: "+mensagem+"]";
   }
}