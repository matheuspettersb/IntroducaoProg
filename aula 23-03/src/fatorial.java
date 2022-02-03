
public class fatorial 
{ /* o q tava dando errado era por o primo=1 antes do while */

	public static void main(String[] args) 
	{int numero,primo,aux,quantp;
     numero = 1347;
     quantp = 0;

     while (numero <=25368)
     	{primo = 1;
    	 aux =  numero - 1;
     	while (aux >1)
     		{if ((numero % aux)== 0)
     			{primo = 0;
     			aux = 1;
     			}
     		aux = aux - 1;
     		}
     	if (primo == 1)
     		{quantp = quantp+1;
     		}
     	numero = numero +1;
     	}
     System.out.println ("existem " + quantp + " primos entre 1347 e 25368");
     }
}
