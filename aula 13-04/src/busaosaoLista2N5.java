import javax.swing.JOptionPane;

public class busaosaoLista2N5
{
	public static void main(String[] args)
	{int nonibus,inicio,fim,voltas,pessoas,precorde,nrecorde,somaPassag;
	String entra;
	precorde=-1;
	nrecorde=0;
	somaPassag=0;
	for(voltas=0;voltas<5;voltas=voltas+1)
		{entra=JOptionPane.showInputDialog("Qual o n�mero do onibus?");
		nonibus=Integer.parseInt(entra);
		entra=JOptionPane.showInputDialog("Qual era n�mero da catraca no inicio?");
		inicio=Integer.parseInt(entra);
		entra=JOptionPane.showInputDialog("Qual o n�mero da catraca no final?");
		fim=Integer.parseInt(entra);
		pessoas=fim-inicio;
		somaPassag = somaPassag + pessoas;
		if(pessoas>precorde)
			{precorde=pessoas;
			nrecorde=nonibus;
			}
		}
	System.out.println("O onibus mais brabo � o "+nrecorde+" com "+precorde+" pessoas");
	System.out.println("A m�dia por viajem � "+ (somaPassag/5));
	}
}