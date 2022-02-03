import javax.swing.JOptionPane;

public class exemploArray
  {public static void main(String[] args) 
	  {int aluno,idade[],somaTudo,media,contaJovem;
	   String entrada;
	   idade = new int[10];
	   somaTudo = 0;
	   for(aluno=0; aluno < 10; aluno++)
	       {entrada = JOptionPane.showInputDialog("INFORME A IDADE DO ALUNO ");
	        idade[aluno] = Integer.parseInt(entrada);
	        somaTudo = somaTudo + idade[aluno];
	       }
	   media = somaTudo / 10;
	   contaJovem = 0;
	   for(aluno=0; aluno < 10; aluno++)
	       {if (idade[aluno] < media)
	    	    contaJovem++;
	       }
	   System.out.println("MEDIA DE IDADE = "+media);
	   System.out.println("MAIS JOVENS QUE A MEDIA SAO "+contaJovem);
    }
 }
