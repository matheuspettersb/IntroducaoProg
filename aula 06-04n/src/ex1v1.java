import javax.swing.JOptionPane;

public class ex1v1
{public static void main(String[] args)
	{int numero[],i,somaM5,somaPrimo; 
	String entra;
	numero=new int [10];
	
	somaPrimo=0;
	somaM5=0;
	
	for (i=0;i<10;i++)
	{entra=JOptionPane.showInputDialog("informe o número");
	numero[i]=Integer.parseInt(entra);
	}
	
	for (i=0;i<10;i++)
		{if(Primo(numero[i]))
			{somaPrimo=somaPrimo+numero[i];
			}
		if(Mult5(numero[i]))
			{somaM5=somaM5+numero[i];
			}
		}
	System.out.println("Somatorio dos primos: "+somaPrimo);
	System.out.println("Somatorio dos multiplos de 5: "+somaM5);
	}

public static boolean Primo(int num)
	{int aux;
	for (aux=num-1; aux>1;aux--)
		{if (num%aux==0)
			{return false;
			}
		}
	return true;
	}

public static boolean Mult5(int x)
	{if (x%5==0)
		{return true;
		}
	return false;
	}
}