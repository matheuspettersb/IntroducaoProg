import javax.swing.JOptionPane;

public class ex1_array 
{public static void main(String[] args) 
	{int soma,media,posiçao,numero[],MaiorqMedia,somaImpares,somaPosImpares;
	numero=new int [10];
	String entra;
	soma=0;
	somaImpares=0;
	somaPosImpares=0;
	MaiorqMedia=0;
	
	for (posiçao=0;posiçao<10;posiçao++)
		{entra=JOptionPane.showInputDialog("Informe o número");
		numero[posiçao]=Integer.parseInt(entra);
		soma=soma+numero[posiçao];
		}
	media=soma/10;
	System.out.println("A média dos números é "+media);
	
	for (posiçao=0;posiçao<10;posiçao++)
		{if (numero[posiçao]>media);
			{MaiorqMedia=MaiorqMedia++;
			}
		}
	System.out.println("Exixtem "+MaiorqMedia+" numeros maiores que a média na lista");
	
	for (posiçao=0;posiçao<10;posiçao++)
		{if (numero[posiçao]%2==1)
			{somaImpares=somaImpares+numero[posiçao];
			}
		}
	System.out.println("Soma dos impares = "+somaImpares);
	
	for (posiçao=0;posiçao<10;posiçao=posiçao+2)
		{somaPosImpares=somaPosImpares+numero[posiçao];
		}
	System.out.println("A soma dos numeros das posições impares é "+somaPosImpares);
	
	System.out.print("Ordem dos numeros: ");
	for (posiçao=0;posiçao<10;posiçao++) 
		{System.out.print(" "+ numero[posiçao]);
		}
	System.out.println("Ordem inversa: ");
	for (posiçao=9;posiçao<0;posiçao=posiçao-1);
		{System.out.print(" "+ numero[posiçao]);
		}
	}
}