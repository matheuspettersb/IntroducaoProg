import javax.swing.JOptionPane;
public class UsaConta 
  {public static void main(String[] args) 
	  {Conta um,dois;
	   String entra;
	   int aux;
	   entra = JOptionPane.showInputDialog("INFORME O NUMERO DA CONTA");
           aux = Integer.parseInt(entra);
           entra = JOptionPane.showInputDialog("INFORME O ITULAR DA CONTA");
           um = new Conta(aux,entra);
           entra = JOptionPane.showInputDialog("INFORME O NUMERO DA CONTA");
           aux = Integer.parseInt(entra);
           entra = JOptionPane.showInputDialog("INFORME O ITULAR DA CONTA");
           dois = new Conta(aux,entra);  
           System.out.println("SALDO DA CONTA um: "+um.consultar());
           System.out.println("SALDO DA CONTA dois: "+dois.consultar());
           um.depositar(500);
           dois.depositar(300);
           System.out.println("SALDO DA CONTA um: "+um.consultar());
           System.out.println("SALDO DA CONTA dois: "+dois.consultar());
           if (um.sacar(400))
    	      System.out.println("SAQUE EFETUADO COM SUCESSO");
           System.out.println("SALDO DA CONTA um: "+um.consultar());
           if (dois.sacar(800) == false)
    	      System.out.println("SALDO INSUFICIENTE");
           System.out.println("SALDO DA CONTA dois: "+dois.consultar());
	}
  }
