import javax.swing.JOptionPane;
public class AppBloco{
   public static void main(String[] args){
      Bloco bloco = new Bloco();
      int menu;
      String nome = null;
      String mensagem = null;
      do{
         menu = Integer.parseInt(JOptionPane.showInputDialog(
            "1 add nota\n2 remover nota\n3 procura nota"+
            "\n4 listar todos\n5 sair"));
         if(menu == 1){
            nome = JOptionPane.showInputDialog("Nome:");
            mensagem = JOptionPane.showInputDialog("mensagem:");
            bloco.addNota(nome, mensagem);
         }
         else if(menu == 2){
            nome = JOptionPane.showInputDialog("Nome para remover:");
            if(bloco.blockNota(nome)){
               JOptionPane.showMessageDialog(null, "Removido");
            }
            else {
               JOptionPane.showMessageDialog(null, "Nao encontrado");
            }
         }
         else if(menu == 3){
            Nota[] notas = bloco.procurarVelhos();
            for(int i = 0; i < notas.length; i++){
               System.out.println(notas[i]);
            }
         }
         else if(menu == 4){
            bloco.listarNotas();
         }
         else if(menu == 5){
         }
         else {
            JOptionPane.showMessageDialog(null,
               "Opcao invalida");
         }
      }while(menu != 5);
   }
}