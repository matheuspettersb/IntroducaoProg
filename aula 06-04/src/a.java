import javax.swing.JOptionPane;

public class a 
{
	public static void main(String[] args)
	{int numero,opcao,aux,giro,fatorial,primo;
		    String entra;
		    for(giro = 1; giro <= 5; giro = giro +1)
		       {entra = JOptionPane.showInputDialog("SISTEMA OPERACOES MATEMATICAS"+
	                   				    "\n\n\t1. DOBRO\n\t2. QUADRADO"+
	 						    		"\n\t3. TRIPLO\n\t4. CUBO" +
	                   				     "\n\t5. FATORIAL\n\t6 PAR OU IMPAR\n\t7 É PRIMO?"+
	 						    		"\n\n\tQUAL A OPERACAO VOCE QUER APRENDER ");
		        opcao  = Integer.parseInt(entra);
		        numero = 0;
		        if (opcao <= 7)
		       	     {entra = JOptionPane.showInputDialog("AGORA INFORME UM NUMERO");
		              numero = Integer.parseInt(entra);
		       	     } 
		       	switch (opcao)
		       		{case 1: aux = numero * 2;
		       			 System.out.println("DOBRO DE "+numero+" = "+aux);
		       			 break;
		       		 case 2: aux = numero * numero;
		       		         System.out.println("QUADRADO DE "+numero+" = "+aux);
		       		         break;
		       		 case 3: aux = numero * 3;
		       			 System.out.println("TRIPLO DE "+numero+" = "+aux);
		       			 break;
		       		 case 4: aux = numero * numero * numero;
		       			 System.out.println("CUBO DE "+numero+" = "+aux);
		       			 break;
		       		 case 5:fatorial=1;
		       		 		for (aux=numero; aux>1; aux=aux-1)
		       		 			{fatorial=fatorial*aux;
		       		 			}
		       		 		System.out.println("FATORIAL DE "+numero+ " É "+fatorial);
		       		 		break;
		       		 case 6:if (numero%2==0)
		       		 	   {System.out.println(numero+ " É PAR");
		       		 	   }
		       		 	   else
		       		 	   {System.out.println(numero+ " É IMPAR");
		       		 	   }
		       		 	   break;
		       		 case 7:primo = 1;
		       		 		aux =  numero - 1;
		       			 		while (aux >1)
		       			 			{if ((numero % aux)== 0)
		       			 				{primo = 0;
		       			 				aux = 1;
		       			 				}
		       			 			aux = aux - 1;
		       			 			}
		       			 	if(primo==1)
		       			 		{System.out.println(numero+" É PRIMO");
		       			 		}
		       			 	else
		       			 		{System.out.println(numero+ " NÃO É PRIMO");
		       			 		}
		       			 	break;
		       		 default: System.out.println("OPCAO INVALIDA"); 		 
		       		}
		       }
		    System.out.println("OBRIGADO POR USAR O SISMIM - SISTEMA FEITO POR MIM  :-) ");
	}
}
