import javax.swing.JOptionPane;
public class lista4_ex2
{	public static void main(String[] args)
	//ta bugando os 2 do meio, resolução no ava
	{int sexo[],nota[],idade[],posição,media,somaMedia,mediaHomens,notaFJovem,FJovem,acimaMedia50;
	nota=new int[5];
	sexo=new int[5];
	idade=new int[5];
	String entra;
	somaMedia=0;
	mediaHomens=0;
	FJovem=100;
	notaFJovem=-1;
	acimaMedia50=0;
	media=0;
	for (posição=0; posição<5; posição++)
		 {entra=JOptionPane.showInputDialog("Informe o seu sexo (1=mulher, 2 homem)");
		 sexo[posição]=Integer.parseInt(entra);
		 entra=JOptionPane.showInputDialog("Qual a sua idade?");
		 idade[posição]=Integer.parseInt(entra);
		 if (sexo[posição]==1)
		 	{if (idade[posição]<FJovem)
		 		{FJovem=idade[posição];
		 		notaFJovem=nota[posição];
		 		}
		 	}
		 entra=JOptionPane.showInputDialog("Que nota você dá para o cinema? (0-10)");
		 nota[posição]=Integer.parseInt(entra);
		 somaMedia=somaMedia+nota[posição];
		 }
	System.out.println("A nota média recebida foi "+(media=somaMedia/5));
	if (notaFJovem<0)
		{System.out.println("Nenhuma mulher respondeu a pesquisa");
		}
	
	else
		{System.out.println("A nota atribuída pela mulher mais jovem foi "+notaFJovem);
		}
	
	for (posição=0;posição<5;posição++)
		{if (sexo[posição]==2)
			{mediaHomens=mediaHomens+nota[posição];
			}
		}
	System.out.println("A nota média atribuida pelos homens foi "+(mediaHomens/5));
	
	for (posição=0;posição<5;posição++)
		{if (sexo[posição]==1)
			{if (idade[posição]>50)
				{if (nota[posição]>media)
					{acimaMedia50++;	
					}
				}
			}
		}
	if (acimaMedia50>0)
		{System.out.println("Existem "+acimaMedia50+" mulheres com mais de 50 anos e que deram nota acima da media");
		}
	else
		{System.out.println("nenhuma mulher com mais de 50 anos deu nota maior do que a media");
		}
	}
}