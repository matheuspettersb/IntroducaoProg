import javax.swing.JOptionPane;
public class ExercícioSubPrograma_txt
{public static void main(String[] args)
	{int numero[], i;
	String entra;
	numero = new int [20];
	
	for (i=0;i<20;i++)
		{entra=JOptionPane.showInputDialog("informe o número da posição "+(i+1));
		numero[i]=Integer.parseInt(entra);
		}
	System.out.println("COLEÇÃO:");
	for (i=0;i<20;i++)
		{System.out.print("\n"+numero[i]);
		}
	System.out.println("\n ordenando em ordem crescente");
	for (i=0;i<20;i++)	
		{ArrayCrescente(numero[i]);
		}
	}

	System.out.println("Coleção:");
	for (i=0;i<20;i++)
		{System.out.println("\n ")
		}


public static void fatorial(int num)
	{
	}

public static boolean ehPrimo(int num)
	{
	}

public static void ArrayCrescente (int num[i])
	{for (i)
	}

public static void Inverter (int num)
	{
	}
}