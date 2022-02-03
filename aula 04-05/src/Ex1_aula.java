import javax.swing.JOptionPane;
public class Ex1_aula
{public static void main(String[] args)
	//inverter tava dando errado, estudar correção do Bernardo
	{int numero[],i,aux,opção,voltas;
	String entra;
	numero = new int [20];
	for (i=0; i<20; i++)
		{entra=JOptionPane.showInputDialog("Informe um número");
		numero[i]=Integer.parseInt(entra);
		}
	do	{entra=JOptionPane.showInputDialog("escolha ai\n\n\t1. Mostrar\n\t2. Ordenar crescente\n\t3. Ordenar decrescente\n\t4. Inverter\n\t5. Vazar");
		opção=Integer.parseInt(entra);
		switch(opção)
			{case 1:System.out.println("Coleção: ");
			 		for(i=0; i < 20; i++)
			 		System.out.print(" "+numero[i]);
			break;
			
			case 2:for(voltas=1;voltas<=19;voltas++)
						{for(i=0; i < 19; i++)
							{if (numero[i] > numero[i+1])
								{aux=numero[i] ;
								numero[i]=numero[i+1];
								numero[i+1]=aux;
								}
							}
						}
					System.out.println("\nOrdem crescente: ");
					for(i=0;i<20;i++)
						{System.out.print(" "+numero[i]);
						}
			break;
			
			case 3:for(voltas=1; voltas <= 19; voltas++)
						{for(i=0; i < 19; i++)
							{if (numero[i] < numero[i+1])
								{aux = numero[i] ;
								numero[i] = numero[i+1];
								numero[i+1]=aux;
								}
							}
						}
	   
			System.out.println("\nOrdem decrescente: ");
			for(i=0; i < 20; i++)
				{System.out.print(" "+numero[i]);
				}
			break;
			
			case 4:System.out.print("\nInvertido: ");
			for( i = 19; i>=0; i--) 
			{System.out.print("  " + numero[i]);
            }
			break;
				
			case 5:System.out.print("\nvlw mano, até uma próxima");	
			}	
		}while(opção!=5);	
	}
}