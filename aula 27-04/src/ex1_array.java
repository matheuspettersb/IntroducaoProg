import javax.swing.JOptionPane;

public class ex1_array 
{public static void main(String[] args) 
	{int soma,media,posi�ao,numero[],MaiorqMedia,somaImpares,somaPosImpares;
	numero=new int [10];
	String entra;
	soma=0;
	somaImpares=0;
	somaPosImpares=0;
	MaiorqMedia=0;
	
	for (posi�ao=0;posi�ao<10;posi�ao++)
		{entra=JOptionPane.showInputDialog("Informe o n�mero");
		numero[posi�ao]=Integer.parseInt(entra);
		soma=soma+numero[posi�ao];
		}
	media=soma/10;
	System.out.println("A m�dia dos n�meros � "+media);
	
	for (posi�ao=0;posi�ao<10;posi�ao++)
		{if (numero[posi�ao]>media);
			{MaiorqMedia=MaiorqMedia++;
			}
		}
	System.out.println("Exixtem "+MaiorqMedia+" numeros maiores que a m�dia na lista");
	
	for (posi�ao=0;posi�ao<10;posi�ao++)
		{if (numero[posi�ao]%2==1)
			{somaImpares=somaImpares+numero[posi�ao];
			}
		}
	System.out.println("Soma dos impares = "+somaImpares);
	
	for (posi�ao=0;posi�ao<10;posi�ao=posi�ao+2)
		{somaPosImpares=somaPosImpares+numero[posi�ao];
		}
	System.out.println("A soma dos numeros das posi��es impares � "+somaPosImpares);
	
	System.out.print("Ordem dos numeros: ");
	for (posi�ao=0;posi�ao<10;posi�ao++) 
		{System.out.print(" "+ numero[posi�ao]);
		}
	System.out.println("Ordem inversa: ");
	for (posi�ao=9;posi�ao<0;posi�ao=posi�ao-1);
		{System.out.print(" "+ numero[posi�ao]);
		}
	}
}