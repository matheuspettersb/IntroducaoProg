import javax.swing.JOptionPane;
public class exercicio_subprograma
{public static void main(String[] args)
	{int numero, maiorprimo, voltas, contagemPrimos, contagemMD3, contagemMD3e2, fatorial, menorFat;
	String entra;
	maiorprimo=1;
	contagemPrimos=0;
	contagemMD3=0;
	contagemMD3e2=0;
	menorFat=999999;
	
	for (voltas=0; voltas<10; voltas++)
		{entra=JOptionPane.showInputDialog("informe o numero");
		numero=Integer.parseInt(entra);
		if (primo(numero)==true)
			{if (numero>maiorprimo)
				{maiorprimo=numero;
				}
			contagemPrimos=contagemPrimos+1;
			}
		if (multiploD3(numero)==true)
			{contagemMD3++;
			if (numero%2==0);
				{contagemMD3e2++;
				}
			}
		fatorial=fatorial(numero);
		if (fatorial<menorFat)
			{menorFat=fatorial;
			}
		}
	System.out.println("Existem "+contagemPrimos+" entre os primos informados");
	System.out.println("O maior primo informado foi "+maiorprimo);
	System.out.println("Existem "+contagemMD3+" multiplos de 3, e destes "+contagemMD3e2+" também multiplos de 2");
	System.out.println("O menor fatorial é "+menorFat);
	}

public static boolean primo(int num)
	{int aux;
	for (aux=num-1; aux>1; aux--)
		{if ((num%aux)==0)
			{return false;
			}
		}
	return true;
	}

public static boolean multiploD3(int num)
	{if ((num%3)==0)
		{return true;
		}
	return false;
	}

public static int fatorial(int num)
	{int calcula, aux;
	calcula=0;
	for (aux=num; aux>1; aux--)
		{calcula=calcula*aux;
		}
	return calcula;
	}
}