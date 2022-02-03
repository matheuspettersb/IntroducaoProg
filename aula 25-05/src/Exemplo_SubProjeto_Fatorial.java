import javax.swing.JOptionPane;
public class Exemplo_SubProjeto_Fatorial
{public static void main(String[] args)
	{String entra;
	int num, result;
	entra=JOptionPane.showInputDialog("informe o numero");
	num=Integer.parseInt(entra);
	result=fatorial(num);
	// o "fatorial(num)" � um subprojeto, e aqui ele inicia o subprojeto levando o valor de num.
	// quando o fatorial(num) volta ele est� c o valor de "calcula" (olhar a anota��o do return).
	System.out.println("Fatorial de "+num+" � "+result);
	result=cubo(num);
	System.out.println("O cubo de "+num+" � "+result);
	if (primo(num)==true)
		{System.out.println(num+" � primo");
		}
	else 
		{System.out.println(num+" n�o � primo");
		}
	}

public static int fatorial(int veio)
// int veio > veio=num, oq ele tr�s.
	{int calcula, aux;
	calcula=1;
	for (aux=veio; aux>1; aux--)
		{calcula=calcula*aux;
		}
	return calcula;
// volta pro main levando consigo o valor de calcula.
	}

public static int cubo(int numero)
	{int calcula;
	calcula=numero*numero*numero;
	return calcula;
	}

public static boolean primo(int numero)
	{int aux;
	for (aux=numero-1; aux>1; aux--)
		{if ((numero%aux)==0)
			{return false;
			}
		}
	return true;
	}
}