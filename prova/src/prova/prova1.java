package prova;

import javax.swing.JOptionPane;

public class prova1 
{
	public static void main(String[] args) 
	{int numero, qntnumero, primo, qtdprimo, maiorprimo, m3, m3pares, menornumero, fatorial, aux, repete;
	String entra;
	
	menornumero=100000;
	maiorprimo=0;
	qntnumero=0;
	qtdprimo=0;
	m3=0;
	m3pares=0;
	repete=0;
	
	do {
		do  {entra=JOptionPane.showInputDialog("Qual é o número?");
		numero=Integer.parseInt(entra);
		}while(numero<=0);
		
		if (qntnumero==0)
			{menornumero=numero;
			}
		if (numero<menornumero)
			{menornumero=numero;
			}
		if (numero%3==0)
			{m3=m3+1;
			if (numero%2==0)
				{m3pares=m3pares+1;
				}
			}
		
		primo= 1;
		aux = numero - 1;
		while (aux >1)
			{if ((numero % aux)== 0)
		 		{primo = 0;
		 		aux = 1;
		 		}
			aux = aux - 1;
			}
		if (primo==1)
			{qtdprimo=qtdprimo+1;
			if (qtdprimo==1)
				{maiorprimo=numero;
				}
			if (numero>maiorprimo)
				{maiorprimo=numero;
				}
			}
		
		if (repete==numero)
		{System.out.println("houve repetição");
		}
		
		repete=numero;
		qntnumero=qntnumero+1;		
		}while (qntnumero<100);
	
	fatorial=1;
	for (aux=menornumero; aux>1; aux=aux-1)
		{fatorial=fatorial*aux;
		}
	
	System.out.println("Dados da sequência:");
	System.out.println("Existem "+qtdprimo+" primos na sequencia");
	System.out.println("O maior primo informado foi "+maiorprimo);
	System.out.println("Foram informados "+m3+" multiplos de 3, sendo destes "+m3pares+" numeros pares");
	System.out.println("O menor numero foi "+menornumero+ " e sua fatorial é "+fatorial);
	}
}
