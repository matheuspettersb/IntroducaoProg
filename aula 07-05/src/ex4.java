import javax.swing.JOptionPane;

public class ex4
{	public static void main(String[] args)
	{int numero[], i, soma, media, menoresMedia, somaImpares, somaPosiçãoImpares,voltas,aux;
	numero=new int [20];
	String entra;
	
	soma=0;
	media=0;
	menoresMedia=0;
	somaImpares=0;
	somaPosiçãoImpares=0;
	
	for (i=0;i<20;i++)
		{entra=JOptionPane.showInputDialog("Informe o "+(i+1)+"º numero");
		numero[i]=Integer.parseInt(entra);
		soma=soma+numero[i];
		if ((i+1)%2==1)
			{somaPosiçãoImpares=somaPosiçãoImpares+numero[i];
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
	
	System.out.println("A média dos números informados é "+media);
	System.out.println("Existem "+menoresMedia+" numeros menores que a media na coleção");
	System.out.println("A soma dos números nas posições impares é "+ somaPosiçãoImpares);
	if (somaImpares>0)
		{System.out.println("A soma dos números impares é "+somaImpares);
		}
	else
		{System.out.println("Não foram informados números impares");
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
		System.out.print("\nCOLEÇÃO:");
		for (i=0;i<19;i++)
			{System.out.print(" "+numero[i]);
			}
	}
}