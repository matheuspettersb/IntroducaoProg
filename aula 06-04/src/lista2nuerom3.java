import javax.swing.JOptionPane;

public class lista2nuerom3 
{
	public static void main(String[] args) 
	{int base,expoente,resultado,aux;
	String entra;
	base=0;
	expoente=0;
	entra = JOptionPane.showInputDialog("informe a base");
	base=Integer.parseInt(entra);
	while(base<=20)
		{entra=JOptionPane.showInputDialog("informe o expoente");
		expoente=Integer.parseInt(entra);
		resultado=1;
			for(aux=expoente;aux>=1;aux=aux-1)
				{resultado=resultado*base;
				}
			System.out.println(base+" elevado a "+expoente+" é "+resultado);
			entra = JOptionPane.showInputDialog("informe a base");
			base=Integer.parseInt(entra);
		}
	}
}
