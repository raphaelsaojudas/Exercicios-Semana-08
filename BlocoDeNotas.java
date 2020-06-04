import java.util.ArrayList;
public class BlocoDeNotas{

   private ArrayList<Nota> notas;
   public BlocoDeNotas(){
      notas = new ArrayList<Nota>();
   }
   public void addNota(Nota nota){
      notas.add(nota);
   }
   private int buscar(String nome){
      for(int i = 0; i < notas.size(); i++){
         Nota nota = notas.get(i);
         String nomeNota = nota.getNome();
         if(nome.equals(nomeNota)){
            return i;
         }
      }
      return -1;
   }
   public boolean blockNota(String nome){
      int posicao = buscar(nome);
      if(posicao >= 0){
         notas.remove(posicao);
         return true;
      } else {
         return false;
      }
   }
   public boolean enviarMensagem(String nome, String mensagem){
      int posicao = buscar(nome);
      if(posicao >= 0){
         Nota nota = notas.get(posicao);
         nota.setMensagem(mensagem);
         return true;
      } else {
         return false;
      }
   }
   public Nota[] procurarVelhos(){
      if(notas.size() == 0){
         return new Nota[0];
      }
      int maior = notas.get(0).getIdade();
      for(Nota nota:notas){
         if(nota.getIdade() > maior){
            maior = nota.getIdade();
         }
      }
      int qtde = 0;
      for(Nota nota:notas){
         if(nota.getIdade() == maior){
            qtde++;
         }
      }
      Nota[] velhos = new Nota[qtde];
      int k = 0;
      for(int i = 0; i < notas.size(); i++){
         Nota nota = notas.get(i);
         if(nota.getIdade() == maior){
            velhos[k++] = nota;
         }
      }
      return velhos;
   }
   public void addNota(String nome, int idade){
      Nota nota = new Nota();
      nota.setNome(nome);
      nota.setIdade(idade);
      notas.add(nota);
   
   }
   public void listarNotas(){
      for(Nota nota:notas){
         System.out.println(nota);
      }
   }
}