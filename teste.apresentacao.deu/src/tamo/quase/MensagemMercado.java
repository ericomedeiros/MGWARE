package tamo.quase;

import javax.swing.JOptionPane;


public class MensagemMercado {
	/**
	 * Esta função serve pra voces escreverem uma mensagem para o cliente, pode escrever qalqer coisa
	 * 
	 * */
	public static void mensagemSimples(String mensagem){
		JOptionPane.showMessageDialog(null, mensagem);
	}
	
	/**
	 * Esta função serve pra aparecer uma mensagem de confirmação entao quando o cliente
	 * clicar no botão ok volta o valor booleano TRUE e quando clica em Cancel ou fecha a janela
	 * volta FALSE
	 * */
	public static boolean mensagemDeConfirmação(String mensagem){
		int vol = JOptionPane.showConfirmDialog(null, mensagem);
		
		if(vol == JOptionPane.YES_OPTION){
			return true;
		}else{
			return false;
		}
		
	}
	
	/**
	 * Mensagem utilizada pra o cliente fazer a decizão dentre carrinho ou cesta, 
	 * caso for carrinho retorna 0
	 * caso for cesta retorna 1
	 * */
	public static  int mensagemCarrinhoCesta(){
		  //mensagem
		  //define as opções
		  Object[] options = {"Carrinho", "Cesta"};
		  //cria a mensagem
		  int i = JOptionPane.showOptionDialog(null,"Escolha qual voce quer","Ações",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
		  //com o valor recebido vai testar o que foi pressionado
		  if (i == JOptionPane.YES_OPTION){  
		   
		   return 0;//Carrinho
		  }
		  //retorna
		  return 1;//Cesta
		
	}
	
	/**
	 * Mensagem utilizada pra fazer o cliente decidir dentre pegar mais produtos ou ja comprar todos que tem.
	 * Caso for pegar mais produtos retorna 0
	 * caso for comprar retorna 1
	 * */
	public static int mensagemAddCompraProduto(){
		//mensagem
		  //define as opções
		  Object[] options = {"Adicionar", "Comprar"};
		  //cria a mensagem
		  int i = JOptionPane.showOptionDialog(null,"Escolha qual voce quer","Ações",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
		  //com o valor recebido vai testar o que foi pressionado
		  if (i == JOptionPane.YES_OPTION){  
		   
		   return 0;//Quer colocar mais um produto
		  }
		  //retorna
		  return 1;//Quer comprar os produtos pegados
	}
	
	public static String mensagemComResposta(String mensagem){
		String volta = JOptionPane.showInputDialog(mensagem);
		return volta;
	}
	
}

