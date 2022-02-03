import javax.swing.JOptionPane;
public class prova
{	public static void main(String[] args)
	{int aluno[], idade[], estado[], i, anodenascimento, somaMedia, media, voltas, aux, aux2, aux3;
	aluno = new int [10];
	idade = new int [10];
	estado = new int [10];
	String entra;
	i=0;
	
	somaMedia=0;
	for (i=0;i<10;i++)
		{entra=JOptionPane.showInputDialog("Número de matrícula do aluno:");
		aluno[i]=Integer.parseInt(entra);
		entra=JOptionPane.showInputDialog("Ano de nascimento do aluno:");
		anodenascimento=Integer.parseInt(entra);
		idade[i]=(2020-anodenascimento);
		somaMedia=somaMedia+idade[i];
		entra=JOptionPane.showInputDialog("Estado de origem do aluno (1=SC, 2=PR, 3=RS, ... 27=TO)");
		estado[i]=Integer.parseInt(entra);
		}
	
	media=(somaMedia/10);
	System.out.println("\nA idade média dos alunos de BCC intrevistados é "+media+" anos");
	
	System.out.println("\nAlunos mais novos que a média:");
	for (i=0;i<10;i++)
		{if (idade[i]<media)
			{System.out.println("Aluno: "+aluno[i]+"\tAno de Nascimento: "+(2020-idade[i]));
			}
		}
	
	for (voltas=1;voltas<9;voltas++)
		{for (i=0;i<9;i++)
			{if (idade[i]>idade[i+1])
				{aux=idade[i+1];      aux2=aluno[i+1];      aux3=estado[i+1];
				idade[i+1]=idade[i];  aluno[i+1]=aluno[i];  estado[i+1]=estado[i];
				idade[i]=aux;         aluno[i]=aux2;        estado[i]=aux3;
				}
			}
		}
	System.out.println("\nAluno mais velho: \nAluno: "+aluno[9]+"\tIdade: "+idade[9]+"\tEsatdo de origem: "+estado[9]);
	
	for (voltas=1;voltas<9;voltas++)
    	{for (i=0;i<9;i++)
        	{if (estado[i]>estado[i+1])
            	{aux=aluno[i+1];      aux2=idade[i+1];      aux3=estado[i+1];
            	aluno[i+1]=aluno[i];  idade[i+1]=idade[i];  estado[i+1] = estado[i];
            	aluno[i]=aux;         idade[i]=aux2;        estado[i] = aux3;
            	}
        	}
    	}
    for(i=0;i<9;i++)
       {if (estado[i]==estado[i+1])
           {System.out.println("Existe repetição do estado "+estado[i]);
           }
       }

    for (voltas=1;voltas<9;voltas++)
    	{for (i=0;i<9;i++)
        	{if (idade[i]>idade[i+1])
        		{aux=aluno[i+1];      aux2=idade[i+1];      aux3=estado[i+1];
                aluno[i+1]=aluno[i];  idade[i+1]=idade[i];  estado[i+1]=estado[i];
                aluno[i]=aux;         idade[i]=aux2;        estado[i] =aux3;
        		}
        	}
    	}
    System.out.println("\nMatrículas ordenadas por ordem de idade:");
    for(i=0;i<10;i++)
        {System.out.print("\nMatrícula número: " +aluno[i]+"\tIdade: " +idade[i]+"\tEsdado de origem: " +estado[i]);
        }
	}					
}	