import javax.swing.JOptionPane;
public class prova_3
{public static void main(String[] args)
	{int elemento[], tamanho, jafoi, opção,i,fatmenor;
	String entra;
	
	entra=JOptionPane.showInputDialog("Qual o tamanho da coleção?");
	tamanho=Integer.parseInt(entra);
	elemento = new int [tamanho];
	jafoi=0;
	
	do 	{entra=JOptionPane.showInputDialog("Menu: \n\n1. Inserir \n2. Mostrar \n3. Esta Crescente \n4. Fatorial Menor \n5. Inverte \n6. Tem Repetido \n\n99. Vazar");
		opção=Integer.parseInt(entra);
		switch(opção)
			{case 1: for(i=0;i<tamanho;i++)
						{entra=JOptionPane.showInputDialog("Informe o elemento");
						elemento[i]=Integer.parseInt(entra);
						}
					 jafoi=1;
					 break;
					 
			case 2: if(jafoi==0)
					  	{System.out.println("Favor inserir elementos");
					  	break;
					  	}
					SubMostra(elemento);
					break;
					
			case 3: if(jafoi==0)
			  			{System.out.println("Favor inserir elementos");
			  			break;
			  			}
					if(SubCrescente(elemento)==true)
						{System.out.println("\nSim, está crescente");
						}
					else
						{System.out.println("\nNão, não está crescente");
						}
					
					break;
					
			case 4: if(jafoi==0)
  						{System.out.println("Favor inserir elementos");
  						break;
  						}
					fatmenor=SubFatorialMenor(elemento);
					System.out.println("\nA fatorial do menor número é "+fatmenor);
					break;
					
			case 5: if(jafoi==0)
						{System.out.println("Favor inserir elementos");
						break;
						}
					int aux;
					for(i=0;i<((elemento.length-1)/2); i++)
						{aux=elemento[i];
						elemento[i]=elemento[(elemento.length-1)-i];
						elemento[(elemento.length-1)-i]=aux;
						}	
					System.out.println("\nColeção Invertida!");
					break;
			
			case 6: if(jafoi==0)
						{System.out.println("Favor inserir elementos");
						break;
						}
					if(SubRepetido(elemento)==true)
						{System.out.println("\nSim, existem elementos repetidos!");
						}
					else
						{System.out.println("\nNão, não existem elementos repetidos!");
						}
					break;
					
			case 99:System.out.println("\nObrigado por usar o programa! \nAté uma próxima :D");
					break;
			
			}
		}while(opção!=99);
	}

public static void SubMostra(int elem[])
	{int i;
	System.out.println("\nColeção:");
	for (i=0;i<elem.length;i++)
		{System.out.print("\n\t"+elem[i]);
		}
	System.out.print("\n");
	}

public static boolean SubCrescente(int elem[])
	{int i;
	for (i=0;i<(elem.length-1);i++)
		{if (elem[i]>elem[i+1])
			{return false;
			}
		}
	return true;
	}

public static int SubFatorialMenor(int elem[])
	{int i, fatorial, menor,aux;
	menor=elem[0];
	for(i=0;i<elem.length;i++)
		{if (elem[i]<menor)
			{menor=elem[i];
			}
		}
	fatorial=1;
    for (aux=menor;aux>1;aux--)
        {fatorial=fatorial*aux;
        }
	return fatorial;
	}

public static boolean SubRepetido(int elem[])
	{int i;
	for (i=0;i<(elem.length-1);i++)
		{if(elem[i]==elem[i+1])
			{return true;
			}
		}
	return false;
	}
}