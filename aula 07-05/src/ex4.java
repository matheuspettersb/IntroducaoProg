import javax.swing.JOptionPane;

public class ex4
{	public static void main(String[] args)
	{int numero[], i, soma, media, menoresMedia, somaImpares, somaPosi��oImpares,voltas,aux;
	numero=new int [20];
	String entra;
	
	soma=0;
	media=0;
	menoresMedia=0;
	somaImpares=0;
	somaPosi��oImpares=0;
	
	for (i=0;i<20;i++)
		{entra=JOptionPane.showInputDialog("Informe o "+(i+1)+"� numero");
		numero[i]=Integer.parseInt(entra);
		soma=soma+numero[i];
		if ((i+1)%2==1)
			{somaPosi��oImpares=somaPosi��oImpares+numero[i];
			}
		if (numero[i]%2==1)
			{somaImpares=somaImpares+numero[i];
			}
		}
	media=soma/20;
	for (i=0;i<20;i++)
		{if (numero[i]<media)
			{menoresMedia++;
			}
		}
	
	System.out.println("A m�dia dos n�meros informados � "+media);
	System.out.println("Existem "+menoresMedia+" numeros menores que a media na cole��o");
	System.out.println("A soma dos n�meros nas posi��es impares � "+ somaPosi��oImpares);
	if (somaImpares>0)
		{System.out.println("A soma dos n�meros impares � "+somaImpares);
		}
	else
		{System.out.println("N�o foram informados n�meros impares");
		}
	for (voltas=1;voltas<19;voltas++);
		{for (i=0;i<19;i++);
			{if (numero[i]>numero[i+1]);
				{aux=numero[i];
				numero[i]=numero[i+1];
				numero[i+1]=aux;
				}
			}
		}
		System.out.print("\nCOLE��O:");
		for (i=0;i<19;i++)
			{System.out.print(" "+numero[i]);
			}
	}
}