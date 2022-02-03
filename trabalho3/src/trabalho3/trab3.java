package trabalho3;
import javax.swing.JOptionPane;
public class trab3
{public static void main(String[] args)
	{int idade[], matricula[],i,k,opção;
	String entra;
	matricula=new int [20];
	idade=new int [20];
	
	for(i=0;i<20;i++)
    	{entra=JOptionPane.showInputDialog("Informe o número de matricula do(a) aluno(a):");
        matricula[i]=Integer.parseInt(entra);
        for (k=i-1;k==0;k--)
        	{if (matricula[i]==matricula[k])
        		{entra=JOptionPane.showInputDialog("Nº já informado, favor informar um diferente. \nInforme o número de matricula:");
        		matricula[i]=Integer.parseInt(entra);
        		}
        	}
		entra=JOptionPane.showInputDialog("Informe a idade do(a) aluno(a):");
		idade[i]=Integer.parseInt(entra);
		}
	
	do{	entra=JOptionPane.showInputDialog("\nMENU: \n\n1. MOSTRAR \n2. ORDENAR CRESCENTE \n3. INVERTER \n4. PROCURAR MATRICULA \n5. PROCURAR IDADE"
				+ "\n6. MÉDIA \n7. MAIS JOVEM \n8. ANIVERSÁRIO \n9. REPETE \n10. POPULAR \n\n99. VAZAR");
		opção=Integer.parseInt(entra);
		switch (opção)
			{default: System.out.print("Opção inválida");
			
			case 1:	SubMostrar(matricula,idade);
			break;
				
			case 2: SubOrdenarCrescente(matricula,idade);
			break;
			
			case 3: SubInverter(matricula,idade);
			break;
			
			case 4: SubProcuraMatricula(matricula);
			break;
			
			case 5: SubProcuraIdade(matricula,idade);
			break;
			
			case 6: SubMedia(idade);
			break;
			
			case 7: SubMaisJovem(matricula,idade);
			break;
			
			case 8: SubAniversauro(matricula,idade);
			break;
			
			case 9: SubRepete(idade);
			break;
			
			case 10: SubPopular(matricula,idade);
			break;
			
			case 99:System.out.println("\nObrigado por usar o programa. \nAté uma próxima :D");
			break;
			}
		}while(opção!=99);
	}

public static void SubMostrar(int mat[], int id[])
	{int i;
	System.out.println("\n\nNº de matrícula: \tIdade");
	for (i=0;i<mat.length;i++)
		{System.out.print("\n"+mat[i]+"\t\t\t"+id[i]);
		}
	System.out.println(" ");
	}

public static void SubOrdenarCrescente(int mat[], int id[])
	{int i,aux,aux2,voltas;
	for(voltas=1;voltas<=19;voltas++)
		{for(i=0;i<19;i++)
  	  		{if (mat[i]>mat[i+1])
  	  	  		{aux=mat[i+1]; 		aux2=id[i+1];
  	  	  		mat[i+1]=mat[i]; 	id[i+1]=id[i];
  	  	  		mat[i]=aux; 		id[i]=aux2;
  	  	  		}
  	  		}
		}
	System.out.println("\nOrdenado crescente!");
	}

public static void SubInverter(int mat[],int id[])
	{int aux, aux2, i;
	for(i=0; i<19/2; i++)
		{aux = mat[i]; 			aux2 = id[i];
		mat[i] = mat[19-i]; 	id[i] = id[19-i];
		mat[19-i] = aux; 		id[19-i] = aux2;
		}
	System.out.println("\nColeção Invertida!");
	}

public static void SubProcuraMatricula(int mat[])
	{int i,verde,procura;
	String ent;
	verde=0;
	ent=JOptionPane.showInputDialog("Procurar matrícula nº:");
	procura=Integer.parseInt(ent);
	for (i=0;i<19;i++)
		{if (mat[i]==procura)
			{verde=1;
			System.out.println("\n\nEsse aluno existe :)");
			}	
		}
	if (verde==0)
		{System.out.println("\n\nNão há nenhum funcionário com o número de matrícula informado");
		}
	}	

public static void SubProcuraIdade(int mat [],int id[])
	{int verde, i, procura;
	String ent;
	verde=0;
	ent=JOptionPane.showInputDialog("Procurar matrícula nº:");
	procura=Integer.parseInt(ent);
	for (i=0;i<19;i++)
		{if (mat[i]==procura)
			{verde=1;
			System.out.println("\n\nEncontrado! \nMatrícula: "+mat[i]+"\tIdade:"+id[i]);
			}	
		}
	if (verde==0)
		{System.out.println("\n\nNão há nenhum aluno com o número de matrícula informado");
		}
	}

public static void SubMedia(int id[])
	{int i, somaidade=0;
	for (i=0;i<20;i++)
		{somaidade=somaidade+id[i];
		}
	System.out.println("\nA média de idades é de "+(somaidade/20)+" anos");
	}

public static void SubMaisJovem(int mat[], int id[])
	{int i, maisjovem;
	maisjovem=999;
	for (i=0;i<20;i++)
		{if (id[i]<maisjovem)
			{maisjovem=id[i];
			}
		}
	for (i=0;i<20;i++)
		{if (id[i]==maisjovem);
		System.out.println("\nO aluno mais jovem é o "+mat[i]);
		}
	}

public static void SubAniversauro(int mat[], int id[])
	{int i, aniversariante;
	String ent;
	ent=JOptionPane.showInputDialog("Qual o(a) aluno(a)?");
	aniversariante=Integer.parseInt(ent);
	for (i=0;i<20;i++)
		{if (mat[i]==aniversariante)
			{id[i]=id[i]+1;
			System.out.println("\n\nFeliz aniversário, funcionário "+mat[i]);
			}
		}
	}

public static void SubRepete (int id[])
	{int i;
	for(i=0;i<19;i++)
		{if (id[i]==id[i+1])
			{System.out.println("\n\nExiste repetição de idade ("+id[i]+")");
			}
		}
	}


public static void SubPopular(int mat[], int id[])
	{int i,k;
	String ent;
	for(i=0;i<20;i++)
		{ent=JOptionPane.showInputDialog("Informe o número de matricula do(a) aluno(a):");
		mat[i]=Integer.parseInt(ent);
		for (k=i-1;k==0;k--)
    		{if (mat[i]==mat[k])
    			{ent=JOptionPane.showInputDialog("Nº já informado, favor informar um diferente. \nInforme o número de matricula:");
    			mat[i]=Integer.parseInt(ent);
    			}
    		}
		ent=JOptionPane.showInputDialog("Informe a idade do(a) aluno(a):");
		id[i]=Integer.parseInt(ent);
		}
	System.out.println("\nRepopulado!");
	}

}