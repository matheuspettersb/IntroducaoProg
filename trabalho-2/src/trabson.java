import javax.swing.JOptionPane;
public class trabson
{public static void main(String[] args)
	{int matricula[], idade[], i,op��o,voltas,aux,aux2,procura,verde,somaidade,aniversariante,maisidoso,idosomatricula; 
	matricula = new int [20];
	idade = new int [20];
	aux=0;
	aux2=0;
	maisidoso=0;
	String entra;
	
	for (i=0; i<20; i++)
	{entra=JOptionPane.showInputDialog("Matr�cula do funcion�rio:");
	matricula[i]=Integer.parseInt(entra);
	entra=JOptionPane.showInputDialog("Idade do funcion�rio:");
	idade[i]=Integer.parseInt(entra);
	}
	
	do {entra=JOptionPane.showInputDialog("Selecione a Op��o:"
			+ "\n\n\t1. MOSTRAR \n\t2. ORDENAR CRESCENTE \n\t3. ORDENAR DECRESCENTE \n\t4. INVERTER \n\t5. PROCURAR MATRICULA \n\t6. PROCURAR IDADE"
			+ "\n\t7. MEDIA \n\t8. MAIS IDOSO \n\t9. ANIVERSARIO \n\t10. REPETE \n\t 99. VAZAR");
		op��o=Integer.parseInt(entra);
		switch(op��o)
			{case 1:System.out.println("\n\nCole��o atual: \nMatricula: \tIdade:");
				for (i=0; i<20; i++)
				System.out.print("\n"+matricula[i] +"\t\t"+ idade[i]);
				break;
				
			case 2:	for(voltas=1;voltas<=19;voltas++)
						{for(i=0;i<19;i++)
					  	  	{if (matricula[i]>matricula[i+1])
					  	  	  	{aux=matricula[i+1]; aux2=idade[i+1];
					  	  	  	matricula[i+1]=matricula[i]; idade[i+1]=idade[i];
					  	  	  	matricula[i]=aux; idade[i]=aux2;
					  	  	  	}
					  	  	}
						}
				System.out.println("\n\nOrdenado crescente");
				break;
				
			case 3:for(voltas=1;voltas<=19;voltas++)
			  		  {for(i=19;i>0;i--)
			  		  	  {if(matricula[i]>matricula[i-1])
			  		  	     {aux=matricula[i-1]; aux2=idade[i-1];
			  		  	     matricula[i-1]=matricula[i]; idade[i-1]=idade[i];
			  		  	     matricula[i]=aux; idade[i]=aux2;
			  		  	     }
			  		  	  }
			  		  }
				System.out.println("\n\nOrdenado decrescente");
				break;
				
			case 4:	for(i=0; i < 19 / 2; i++)
	 	       		{aux = matricula[i]; aux2 = idade[i];
	 	       		matricula[i] = matricula[19-i]; idade[i] = idade[19-i];
	 	       		matricula[19-i] = aux; idade[19-i] = aux2;
	 	       		}
 	           	System.out.println("\nCOLECAO INVERTIDA");
				break;
			
			case 5:verde=0;
				entra=JOptionPane.showInputDialog("Procurar matr�cula n�:");
				procura=Integer.parseInt(entra);
				for (i=0;i<19;i++)
						{if (matricula[i]==procura)
							{verde=1;
							System.out.println("\n\nEsse funcion�rio existe :)");
							}	
						}
				if (verde==0)
						{System.out.println("\n\nN�o h� nenhum funcion�rio com o n�mero de matr�cula informado");
						}
				break;
			
			case 6:verde=0;
				entra=JOptionPane.showInputDialog("Procurar matr�cula n�:");
				procura=Integer.parseInt(entra);
				for (i=0;i<19;i++)
					{if (matricula[i]==procura)
						{verde=1;
						System.out.println("\n\nEncontrado! \nMatr�cula: "+matricula[i]+"\tIdade:"+idade[i]);
						}	
					}
				if (verde==0)
					{System.out.println("\n\nN�o h� nenhum funcionario com o n�mero de matr�cula informado");
					}
				break;
			
			case 7: somaidade=0;
				for (i=0;i<20;i++)
					{somaidade=somaidade+idade[i];
					}
				System.out.println("\n\nA m�dia de idades � de "+(somaidade/20)+" anos");
				break;
			
			case 8: for (i=0;i<20;i++)
					{if (idade[i]>maisidoso)
						{maisidoso=idade[i];
						}
					}
				for (i=0;i<20;i++)
					{if (idade[i]==maisidoso);
						System.out.print("\n\nO funcion�rio mais idoso � o "+matricula[i]);
					}
				break;

			case 9:entra=JOptionPane.showInputDialog("Qual funcionario?");
				aniversariante=Integer.parseInt(entra);
				for (i=0;i<20;i++)
					{if (matricula[i]==aniversariante)
						{idade[i]=idade[i]+1;
						System.out.println("\n\nFeliz anivers�rio, funcion�rio "+matricula[i]);
						}
					}
				break;
			
			case 10: for(i=0;i<19;i++)
						{if (idade[i]==idade[i+1])
							{System.out.println("\n\nExiste repeti��o de idade ("+idade[i]+")");
							}
						}
				break;
			
			case 99:System.out.print("\n\nat� mais :)");
				break;
				
			default:System.out.print("\n\nTem essa op��o n�o bro!");
				break;
			}
		}while (op��o!=99);
	}
}