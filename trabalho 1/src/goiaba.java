import javax.swing.JOptionPane;

public class goiaba 
{
	public static void main(String[] args) 
	{int numero,aux,fatorial,primo,somamedia,media,qntd,maior,qntprimo,impares,maiorpar,par,m5,m53,veintidos,repete,qtdrepetidos;
	String entra;
	somamedia=0;
	qntd=0;
	impares=0;
	qntprimo=0;
	maior=0;
	maiorpar=0;
	m5=0;
	m53=0;
	veintidos=0;
	repete=0;
	qtdrepetidos=0;
	do {
		do  {entra=JOptionPane.showInputDialog("Qual � o n�mero?");
			numero=Integer.parseInt(entra);
			}while(numero<=0);
	if (numero<31)
		{System.out.println("O numero � "+ numero);
		if (numero%5==0)
			{m5=m5+1;
			if (numero%3==0)
				{m53=m53+1;
				}
			}
		if (repete==numero)
			{System.out.println("===XXX===XXX===  N�MERO REPETIDO  ===XXX===XXX===");
			qtdrepetidos=qtdrepetidos+1;
			}
			
		if (numero==22)
			{veintidos=veintidos+1;
			}
		fatorial=1;
		for (aux=numero; aux>1; aux=aux-1)
			{fatorial=fatorial*aux;
			}
		System.out.println("A fatorial de "+numero+ " � "+fatorial);
		primo = 1;
		aux =  numero - 1;
		while (aux >1)
			{if ((numero % aux)== 0)
		 		{primo = 0;
		 		aux = 1;
		 		}
			aux = aux - 1;
			}
		if (repete!=numero)
			{if(primo==1)
				{System.out.println(numero+" � primo");
				qntprimo=qntprimo+1;
				}
			}
		else
			{System.out.println(numero+ " n�o � primo");
			}
		if (numero%2==0)
			{par=numero;
			System.out.println(numero+ " � par");
				if (par>maiorpar)
					{maiorpar=numero;
					}
			}
		else 
			{System.out.println(numero+ " � impar");
			impares=impares+1;
			}
		somamedia=somamedia+numero;
		qntd=qntd+1;
		if (numero>maior)
			{if (numero<31)
				{maior=numero;
				}
			}
		}
	repete=numero;
	}while (numero<31);
	media=somamedia/qntd;
	System.out.println("Dados:");
	System.out.println("A m�dia dos numeros digitados � "+media);
	System.out.println("O maior n�mero digitado foi "+maior);
	if (qntprimo!=0)
		{System.out.println("Foram informados "+qntprimo+" primos");
		}
	else
		{System.out.println("N�o foram informados primos");
		}
	if (impares!=0)
		{System.out.println("Foram informados "+impares+" impares");
		}
	else
		{System.out.println("N�o foram informados n�meros impares");
		}
	if (maiorpar==0)
		{System.out.println("N�o foi informado nenhum n�mero par");
		}
	else
		{System.out.println("O maior par informado foi "+maiorpar);
		}
	if (m5>0)
		{if (m53==0)
			{System.out.println("Foram informados "+m5+" m�ltiplos de 5");
			}
		else
			{System.out.println("Foram informados "+m5+" m�ltiplos de 5, sendo "+m53+" tamb�m m�ltiplos de 3");
			}
		}
	else
		{System.out.println("N�o foram informados m�ltiplos de 5");
		}
	if (veintidos>0)
		{System.out.println("O n�mero 22 apareceu "+veintidos+" vezes");
		}
	System.out.println("Numeros foram repetidos "+qtdrepetidos+" vezes ");
	}
}