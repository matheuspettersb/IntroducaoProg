import javax.swing.JOptionPane;
public class lista4_ex2
{	public static void main(String[] args)
	//ta bugando os 2 do meio, resolu��o no ava
	{int sexo[],nota[],idade[],posi��o,media,somaMedia,mediaHomens,notaFJovem,FJovem,acimaMedia50;
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
	for (posi��o=0; posi��o<5; posi��o++)
		 {entra=JOptionPane.showInputDialog("Informe o seu sexo (1=mulher, 2 homem)");
		 sexo[posi��o]=Integer.parseInt(entra);
		 entra=JOptionPane.showInputDialog("Qual a sua idade?");
		 idade[posi��o]=Integer.parseInt(entra);
		 if (sexo[posi��o]==1)
		 	{if (idade[posi��o]<FJovem)
		 		{FJovem=idade[posi��o];
		 		notaFJovem=nota[posi��o];
		 		}
		 	}
		 entra=JOptionPane.showInputDialog("Que nota voc� d� para o cinema? (0-10)");
		 nota[posi��o]=Integer.parseInt(entra);
		 somaMedia=somaMedia+nota[posi��o];
		 }
	System.out.println("A nota m�dia recebida foi "+(media=somaMedia/5));
	if (notaFJovem<0)
		{System.out.println("Nenhuma mulher respondeu a pesquisa");
		}
	
	else
		{System.out.println("A nota atribu�da pela mulher mais jovem foi "+notaFJovem);
		}
	
	for (posi��o=0;posi��o<5;posi��o++)
		{if (sexo[posi��o]==2)
			{mediaHomens=mediaHomens+nota[posi��o];
			}
		}
	System.out.println("A nota m�dia atribuida pelos homens foi "+(mediaHomens/5));
	
	for (posi��o=0;posi��o<5;posi��o++)
		{if (sexo[posi��o]==1)
			{if (idade[posi��o]>50)
				{if (nota[posi��o]>media)
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